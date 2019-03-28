package com.vmmobvoi.karl.androidaoa;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbConstants;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;


/**
 * |- - - - - - - - - |
 * | get usb device   |        (主动 or 被动)
 * |- - - - - - - - - |
 * <p>
 * |
 * |
 * <p>
 * |- - - - - - - - - |
 * |check permission  |        (普通连接申请是为了发送切换到aoa模式的指令)
 * |- - - - - - - - - |        (aoa模式申请是为了open、read、write等操作)
 * <p>
 * /                \
 * /                  \
 * <p>
 * |- - - - - - - - - - - - - |            | - - - - - - - - - - - - - - - - - - - - - |
 * |普通模式：发送51、52、53指令 |            |AOA模式：初始化connection和Endpoint(in/out)  |
 * |- - - - - - - - - - - - - |            | - - - - - - - - - - - - - - - - - - - - - |
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String REQUEST_PERMISSION_ACTION = "asysbang.usb.permission";

    private UsbManager mUsbManager;

    private Button mConnect, mClear, mSend;

    private UsbDevice mCurDevice;

    private TextView mInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Host");
        setContentView(R.layout.activity_main);
        mConnect = findViewById(R.id.connect);
        mConnect.setOnClickListener(this);
        mClear = findViewById(R.id.clear);
        mClear.setOnClickListener(this);
        mInfo = findViewById(R.id.debuginfo);
        mSend = findViewById(R.id.send);
        mSend.setOnClickListener(this);
        init();
        IntentFilter filter = new IntentFilter();
        filter.addAction(UsbManager.ACTION_USB_DEVICE_ATTACHED);
        filter.addAction(UsbManager.ACTION_USB_DEVICE_DETACHED);
        filter.addAction(UsbManager.ACTION_USB_ACCESSORY_ATTACHED);
        filter.addAction(UsbManager.ACTION_USB_ACCESSORY_DETACHED);
        filter.addAction(REQUEST_PERMISSION_ACTION);
        registerReceiver(myUsbReceiver, filter);

        initCodec();
    }

    private void init() {
        mUsbManager = (UsbManager) getSystemService(USB_SERVICE);
        pIntent = PendingIntent.getBroadcast(MainActivity.this, 0, new Intent(REQUEST_PERMISSION_ACTION), 0);
    }

    PendingIntent pIntent;

    private BroadcastReceiver myUsbReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            mInfo.append("intent : " + intent.getAction() + "\n");
            Log.e("", "========" + intent.getAction());
            String action = intent.getAction();
            if (UsbManager.ACTION_USB_DEVICE_ATTACHED.equals(action)) {
                mCurDevice = intent.getParcelableExtra(UsbManager.EXTRA_DEVICE);
                mInfo.append("mCurDevice : " + mCurDevice.getDeviceName() + "\n");
                mInfo.append("mCurDevice isAccessoryMode : " + isAccessoryMode() + "\n");
                if (isAccessoryMode()) {
                    Log.e("", "======isAccessoryMode==");
                    mUsbManager.requestPermission(mCurDevice, pIntent);
                }

            } else if (UsbManager.ACTION_USB_DEVICE_DETACHED.equals(action)) {
                mCurDevice = null;
                mInfo.append("mCurDevice = null: \n");
            } else if (REQUEST_PERMISSION_ACTION.equals(action)) {
                boolean granted = intent.getBooleanExtra(UsbManager.EXTRA_PERMISSION_GRANTED, false);
                mInfo.append("REQUEST_PERMISSION_ACTION = granted : " + granted + "\n");
                if (granted) {
                    if (isAccessoryMode()) {
                        mAoaDeviceConnection = mUsbManager.openDevice(mCurDevice);
                        if (mAoaDeviceConnection == null) {
                            return;
                        }
                        boolean claimResult = mAoaDeviceConnection.claimInterface(mCurDevice.getInterface(0), true);
                        if (!claimResult) {
                            Log.e("", "======>>> claimResult");
                            return;
                        }
                        UsbInterface mUsbInterface = mCurDevice.getInterface(0);
                        mUsbEndpointIn = mUsbInterface.getEndpoint(BULK_ENDPOINT_IN_ADDRESS);
                        mUsbEndpointOut = mUsbInterface.getEndpoint(BULK_ENDPOINT_OUT_ADDRESS);
                    } else {
                        startAoaMode();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "no permission granted by user .....return", Toast.LENGTH_SHORT).show();
                }
            }
        }
    };

    private void startAoaMode() {
        boolean isAoaMode = isAccessoryMode();
        if (isAoaMode) {
            Toast.makeText(MainActivity.this, "mCurDevice is already is aoa mode ,u can send msg", Toast.LENGTH_SHORT).show();
            sendAccessoryInfo(mCurDevice);
        } else {
            mAoaDeviceConnection = mUsbManager.openDevice(mCurDevice);
            byte[] datas = new byte[2];
            int ret = mAoaDeviceConnection.controlTransfer(UsbConstants.USB_DIR_IN | UsbConstants.USB_TYPE_VENDOR, 51, 0, 0, datas, datas.length, 0);
            if (ret > 0) {
                int version = datas[1] << 8 | datas[0];
                mInfo.append(MessageFormat.format("aoa mode version  = {0}\n", version));
                sendAccessoryInfo(mCurDevice);
            } else {
                Toast.makeText(MainActivity.this, "mCurDevice is not supoort aoa mode, return", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private SurfaceView mView;

    private MediaCodec codec;

    //接收的视频帧队列
    private volatile ArrayList<DataInfo> mFrmList = new ArrayList<>();

    private void initCodec() {
        mView = findViewById(R.id.surface);
        mView.getHolder().addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                try {
                    codec = MediaCodec.createDecoderByType(MediaFormat.MIMETYPE_VIDEO_AVC);
                    MediaFormat mediaformat = MediaFormat.createVideoFormat(MediaFormat.MIMETYPE_VIDEO_AVC, 1280, 720);

                    mediaformat.setInteger(MediaFormat.KEY_COLOR_FORMAT, MediaCodecInfo.CodecCapabilities.COLOR_FormatSurface);
                    mediaformat.setInteger(MediaFormat.KEY_BIT_RATE, 5 * 1280 * 720);

                    //设置帧率
                    mediaformat.setInteger(MediaFormat.KEY_FRAME_RATE, 30);
                    codec.configure(mediaformat, holder.getSurface(), null, 0);
                    codec.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {

            }
        });

    }

    private final AtomicBoolean keepThreadAlive = new AtomicBoolean(true);

    private void startRecData() {
        new Thread(new Runnable() {
            @Override
            public void run() {

                int lengthToBeRender = 0;

                byte buffToBeRender[] = new byte[720 * 1280 *5];
                while (keepThreadAlive.get() ) {
                    byte buff[] = new byte[720 * 1280 * 5];
                    int bytesTransferred = mAoaDeviceConnection.bulkTransfer(mUsbEndpointIn, buff, buff.length, 100);
                    Log.e("", "======>>> AoaSocketThread bytesTransferred " + bytesTransferred);
                    if (bytesTransferred > 0) {
                        Log.e("", "======>>> bytesTransferred =  " + bytesTransferred);
                        if (bytesTransferred == 4 && "OVER".equals(new String(buff, 0, bytesTransferred))) {
                            Log.e("", "======>>> OVER = lengthToBeRender =  " + lengthToBeRender);
                            byte b[] = new byte[lengthToBeRender];
                            System.arraycopy(buffToBeRender, 0, b, 0, lengthToBeRender);
                            DataInfo da= new DataInfo();
                            da.mDataBytes =b;
                            da.receivedDataTime = System.currentTimeMillis();
                            mFrmList.add(da);
                            buff = null;
                            buffToBeRender = new byte[720 * 1280 * 5];
                            lengthToBeRender = 0;
                            b = null;
                        } else {
                            Log.e("", "======>>> ADD  = lengthToBeRender =  " + lengthToBeRender);
                            System.arraycopy(buff, 0, buffToBeRender, lengthToBeRender, bytesTransferred);
                            lengthToBeRender = lengthToBeRender + bytesTransferred;
                        }

                    }
                }
            }
        }).start();
    }

    private void startRender() {
        new Thread(new Runnable() {
            @Override
            public void run() {

                DataInfo dataInfo = null;
                long startDecodeTime = System.currentTimeMillis();
                int inIndex = -1;
                MediaCodec.BufferInfo info = new MediaCodec.BufferInfo();
                ByteBuffer byteBuffer = null;
                while (keepThreadAlive.get()) {
                    if (mFrmList.isEmpty()) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        continue;
                    }

                    dataInfo = mFrmList.remove(0);
                    int inputIndex = codec.dequeueInputBuffer(dataInfo.receivedDataTime);

                    if (inputIndex >= 0) {
                        //2 准备填充数据
                        byteBuffer = codec.getInputBuffer(inIndex);


                        byteBuffer.put(dataInfo.mDataBytes, 0, dataInfo.mDataBytes.length);
                        if (byteBuffer == null) {
                            continue;
                        }
                        //3 把数据传给解码器
                        codec.queueInputBuffer(inIndex, 0, dataInfo.mDataBytes.length, 0, 0);

                    } else {
//                    SystemClock.sleep(17);
                        continue;
                    }

                    int outIndex = MediaCodec.INFO_TRY_AGAIN_LATER;

                    //4 开始解码
                    try {
                        outIndex = codec.dequeueOutputBuffer(info, 0);
                        Log.i("", " ==============开始解码 : outIndex =  " + outIndex);
                    } catch (IllegalStateException e) {
                        e.printStackTrace();
                        Log.e("", "IllegalStateException dequeueOutputBuffer " + e.getMessage());
                    }
                    if (outIndex >= 0) {
                        codec.releaseOutputBuffer(outIndex, true);
                    }
                }

            }
        }).start();
    }

    class DataInfo {

        public byte[] mDataBytes;
        public long receivedDataTime;

    }

    public void sendAccessoryInfo(UsbDevice usbDevice) {
        mInfo.append("sendAccessoryInfo start \n");
        Log.e("", "======>>> sendAccessoryInfo start");
        UsbDeviceConnection udc = mUsbManager.openDevice(usbDevice);
        int ret = -1;
        try {
            byte[] datas = AccessoryInfo.MANUFACTURER_NAME.getBytes("utf-8");
            ret = udc.controlTransfer(UsbConstants.USB_DIR_OUT | UsbConstants.USB_TYPE_VENDOR, 52, 0, 0, datas, datas.length, 0);
            if (ret < 0) {
                return;
            }
            datas = AccessoryInfo.MODEL_NAME.getBytes("utf-8");
            ret = udc.controlTransfer(UsbConstants.USB_DIR_OUT | UsbConstants.USB_TYPE_VENDOR, 52, 0, 1, datas, datas.length, 0);
            if (ret < 0) {
                return;
            }
            datas = AccessoryInfo.DESCRIPTION.getBytes("utf-8");
            ret = udc.controlTransfer(UsbConstants.USB_DIR_OUT | UsbConstants.USB_TYPE_VENDOR, 52, 0, 2, datas, datas.length, 0);
            if (ret < 0) {
                return;
            }
            datas = AccessoryInfo.VERSION.getBytes("utf-8");
            ret = udc.controlTransfer(UsbConstants.USB_DIR_OUT | UsbConstants.USB_TYPE_VENDOR, 52, 0, 3, datas, datas.length, 0);
            if (ret < 0) {
                return;
            }
            datas = AccessoryInfo.URI.getBytes("utf-8");
            ret = udc.controlTransfer(UsbConstants.USB_DIR_OUT | UsbConstants.USB_TYPE_VENDOR, 52, 0, 4, datas, datas.length, 0);
            if (ret < 0) {
                return;
            }
            datas = AccessoryInfo.SERIAL.getBytes("utf-8");
            ret = udc.controlTransfer(UsbConstants.USB_DIR_OUT | UsbConstants.USB_TYPE_VENDOR, 52, 0, 5, datas, datas.length, 0);
            if (ret < 0) {
                return;
            }
            //After send info ok, we start up accessory.
            udc.controlTransfer(UsbConstants.USB_DIR_OUT | UsbConstants.USB_TYPE_VENDOR, 53, 0, 0, null, 0, 0);
        } catch (UnsupportedEncodingException e) {
            Log.e("ERROR", Log.getStackTraceString(e));
        }
        mInfo.append("sendAccessoryInfo ok \n");
    }


    private UsbDeviceConnection mAoaDeviceConnection;

    private UsbEndpoint mUsbEndpointIn = null;
    private UsbEndpoint mUsbEndpointOut = null;

    private static final int BULK_ENDPOINT_IN_ADDRESS = 0;
    private static final int BULK_ENDPOINT_OUT_ADDRESS = 1;

    private static final int PID_ACCESSORY_ONLY = 0x2D00;
    private static final int PID_ACCESSORY_ADB = 0x2D01;
    private static final int PID_ACCESSORY_AUDIO = 0x2D02;
    private static final int PID_ACCESSORY_AUDIO_ADB = 0x2D03;
    private static final int PID_ACCESSORY_AUDIO_BULK = 0x2D04;
    private static final int PID_ACCESSORY_AUDIO_ADB_BULK = 0x2D05;

    private static final int VID_ACCESSORY = 0x18D1;

    public boolean isAccessoryMode() {
        boolean flag = false;
        int vid = mCurDevice.getVendorId();
        int pid = mCurDevice.getProductId();
        if ((vid == VID_ACCESSORY)) {
            switch (pid) {
                case PID_ACCESSORY_ONLY:
                case PID_ACCESSORY_ADB:
                case PID_ACCESSORY_AUDIO:
                case PID_ACCESSORY_AUDIO_ADB:
                case PID_ACCESSORY_AUDIO_BULK:
                case PID_ACCESSORY_AUDIO_ADB_BULK:
                    flag = true;
                    break;
                default:
                    break;
            }
        }
        return flag;
    }

    private void sendMsg() {
        if (null == mCurDevice) {
            Toast.makeText(MainActivity.this, "mCurDevice is null , return", Toast.LENGTH_SHORT).show();
            return;
        }
        byte[] sendBuff = "i am host ,i send 123456 ".getBytes();
        mAoaDeviceConnection.bulkTransfer(mUsbEndpointOut, sendBuff, sendBuff.length, 100);
        mInfo.append("sendMsg : i am host ,i send 123456\n");
    }

    private void connect() {
        if (null == mCurDevice) {
            Toast.makeText(MainActivity.this, "mCurDevice is null , return", Toast.LENGTH_SHORT).show();
            return;
        }
        if (mUsbManager.hasPermission(mCurDevice)) {
            mInfo.append("hasPermission \n");
            startAoaMode();
        } else {
            mInfo.append("requestPermission \n");
            mUsbManager.requestPermission(mCurDevice, pIntent);
        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.clear:
                mInfo.setText("");
                break;
            case R.id.connect:
                connect();
                break;
            case R.id.send:

                startRecData();
                startRender();
                break;
        }

    }
}
