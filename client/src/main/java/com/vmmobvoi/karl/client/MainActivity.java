package com.vmmobvoi.karl.client;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ebo.carlife.protobuf.CarlifeProtocolVersionMatchStatusProto;
import com.ebo.carlife.protobuf.CarlifeProtocolVersionProto;
import com.google.protobuf.InvalidProtocolBufferException;

import java.awt.font.TextAttribute;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mSend, mClear, mCapture;

    private TextView mInfo;

    private UsbManager usbManager;

    ParcelFileDescriptor fileDescriptor;
    FileInputStream inputStream;
    FileOutputStream outputStream;

    private static final String ACTION_USB_PERMISSION = "com.android.example.USB_PERMISSION";
    private PendingIntent permissionIntent;

    private final BroadcastReceiver usbReceiver = new BroadcastReceiver() {

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (ACTION_USB_PERMISSION.equals(action)) {
//                mInfo.append("onReceive : ACTION_USB_PERMISSION" + "\n");
                synchronized (this) {
                    UsbAccessory accessory = intent.getParcelableExtra(UsbManager.EXTRA_ACCESSORY);
                    if (intent.getBooleanExtra(UsbManager.EXTRA_PERMISSION_GRANTED, false)) {
//                        mInfo.append("onReceive : EXTRA_PERMISSION_GRANTED" + "\n");
//                        mInfo.append("onReceive : accessory : getManufacturer = " + accessory.getManufacturer() + "\n");
                        if (accessory != null) {
                            //call method to set up accessory communication
//                            fileDescriptor = usbManager.openAccessory(accessory);
//                            mInfo.append("onReceive : fileDescriptor : +" + fileDescriptor + "\n");
                            if (fileDescriptor != null) {
                                FileDescriptor fd = fileDescriptor.getFileDescriptor();
                                inputStream = new FileInputStream(fd);
                                outputStream = new FileOutputStream(fd);
//                                mInfo.append("ReadThread : start\n");
                                ReadThread thread = new ReadThread();
                                thread.start();
                            }
                        }
                    } else {
                        Toast.makeText(MainActivity.this, "no permission granted by user .....return", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }
    };


    private Handler myHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            int id = msg.what;
            switch (id) {
                case CommonParams.MSG_CMD_PROTOCOL_VERSION_MATCH_STATUS:
                    MessageSendHandler.replayVersionMatchStatus(outputStream);
                    break;

                case CommonParams.MSG_CMD_VIDEO_ENCODER_INIT_DONE:
                    MessageSendHandler.replayVideoEncoderInitDone(outputStream);
                    break;

            }
        }
    };

    private boolean isReading = false;


    public static final int MSG_CHANNEL_ID = 0x0001;
    public static final int MSG_CHANNEL_ID_VIDEO = 0x0002;


    //收到车机端协议版本的请求指令
    public static final int PROTOCOL_VERSION_MATCH = 1;
    public static final int PROTOCOL_VERSION_NOT_MATCH = 2;
    private MediaProjectionManager mMediaProjectionManager;

    //回复车机端协议版本的请求指令

    private class ReadThread extends Thread {
        @Override
        public void run() {
            isReading = true;
            while (isReading) {
                try {
                    int lenght = -1;
                    final byte[] msgHead = new byte[8];
                    while ((lenght = inputStream.read(msgHead)) >= 0) {
                        int channelId = MessageReceiverHandler.parserChannelId(new byte[]{msgHead[0], msgHead[1], msgHead[2], msgHead[3]});
                        int msgLength = MessageReceiverHandler.parserMsgLengthFromHead(new byte[]{msgHead[4], msgHead[5], msgHead[6], msgHead[7]});
                        Log.e("", "=======read channelId : " + Util.algorismToHEXString(channelId, 8) + " , msgLength = " + msgLength);
                        byte[] buf = new byte[msgLength];
                        inputStream.read(buf);
                        if (channelId == MSG_CHANNEL_ID) {
                            //处理所有的cmd指令
                            int shouldReplayMessageType = MessageReceiverHandler.parserCmdMessage(buf);
                            myHandler.sendEmptyMessage(shouldReplayMessageType);
                        } else if (channelId == MSG_CHANNEL_ID_VIDEO) {
                            //处理video指令
                            MessageReceiverHandler.parserVideoMessage(buf);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static int bytesToInt(byte[] source) {
        return source[3] & 0xff | (source[2] & 0xff) << 8 | (source[1] & 0xff) << 16 | (source[0] & 0xff) << 24;
    }

    public static void intToBytes(int n, byte[] destination, int offset) {
        destination[3 + offset] = (byte) (n & 0xff);
        destination[2 + offset] = (byte) (n >> 8 & 0xff);
        destination[1 + offset] = (byte) (n >> 16 & 0xff);
        destination[offset] = (byte) (n >> 24 & 0xff);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Client");
        setContentView(R.layout.activity_main);
        mSend = findViewById(R.id.send);
        mSend.setOnClickListener(this);
        mClear = findViewById(R.id.clear);
        mClear.setOnClickListener(this);

        mCapture = findViewById(R.id.capture);
        mCapture.setOnClickListener(this);

        mInfo = findViewById(R.id.debuginfo);
        usbManager = (UsbManager) getSystemService(Context.USB_SERVICE);
        mMediaProjectionManager = (MediaProjectionManager) getSystemService(Context.MEDIA_PROJECTION_SERVICE);

        permissionIntent = PendingIntent.getBroadcast(this, 0, new Intent(ACTION_USB_PERMISSION), 0);
        IntentFilter filter = new IntentFilter(ACTION_USB_PERMISSION);
        registerReceiver(usbReceiver, filter);
        String action = getIntent().getAction();
        mInfo.append("onCreate : " + action + "\n");
        if (UsbManager.ACTION_USB_ACCESSORY_ATTACHED.equals(action)) {
            UsbAccessory accessory = (UsbAccessory) getIntent().getParcelableExtra(UsbManager.EXTRA_ACCESSORY);
            mInfo.append("onCreate UsbAccessory : getManufacturer = " + accessory.getManufacturer() + "\n");
            fileDescriptor = usbManager.openAccessory(accessory);
//            mInfo.append("onCreate : fileDescriptor : +" + fileDescriptor + "\n");
            usbManager.requestPermission(accessory, permissionIntent);
        } else if (Intent.ACTION_MAIN.equals(action)) {
            Toast.makeText(MainActivity.this, "this activity shoud be start by ACTION_USB_ACCESSORY_ATTACHED", Toast.LENGTH_SHORT).show();
        }
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(metrics);
        Log.e("", "=======onActivityResult===" + metrics.widthPixels + " , " + metrics.heightPixels + " , " + metrics.densityDpi);

        byte[] test = new byte[8];
        int cmd = CommonParams.MSG_CMD_PROTOCOL_VERSION_MATCH_STATUS;
        ByteConvert.intToBytes(cmd, test, 0);
        mInfo.append("onCreate test = " + Arrays.toString(test) + "\n");

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(usbReceiver);
    }

    private static final int REQUEST_CAPTURE_CODE = 0x00003200;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

    }




    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.clear:
                mInfo.setText("");
                break;
            case R.id.capture:
                startCapture();
                break;
        }
    }

    private void startCapture() {

    }

}
