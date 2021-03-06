package com.vmmobvoi.karl.client;

import android.util.Log;

import com.ebo.carlife.protobuf.CarlifeDeviceInfoProto;
import com.ebo.carlife.protobuf.CarlifeModuleStatusListProto;
import com.ebo.carlife.protobuf.CarlifeModuleStatusProto;
import com.ebo.carlife.protobuf.CarlifeProtocolVersionMatchStatusProto;
import com.ebo.carlife.protobuf.CarlifeVideoEncoderInfoProto;

import java.io.FileOutputStream;
import java.util.Arrays;

public class MessageSendHandler {


    //收到车机端协议版本的请求指令
    public static final int PROTOCOL_VERSION_MATCH = 1;
    public static final int PROTOCOL_VERSION_NOT_MATCH = 2;

    private static Object mLock = new Object();


    //msgLength = msgheadlength + msgdatalenght
    private static byte[] generateHead(int channelId, int msgLength) {
        byte[] head = new byte[8];
        ByteConvert.intToBytes(channelId, head, 0);
        ByteConvert.intToBytes(msgLength, head, 4);
        return head;
    }

    //返回手机端encoder 编码信息
    public static void replayVideoEncoderInitDone(final FileOutputStream outputStream) {
        new Thread(new Runnable() {
            @Override
            public void run() {


                synchronized (mLock) {


                    try {

                        CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo.Builder builder = CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo.newBuilder();
                        builder.setWidth(1280);
                        builder.setHeight(720);
                        builder.setFrameRate(30);
                        CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo info = builder.build();
                        final CarlifeCmdMessage protocolM = new CarlifeCmdMessage(true);
                        protocolM.setServiceType(CommonParams.MSG_CMD_VIDEO_ENCODER_INIT_DONE);
                        protocolM.setData(info.toByteArray());
                        protocolM.setLength(info.getSerializedSize());
                        Log.e("", "=======replayVideoEncoderInitDone ： protocolM.toByteArray().length = " + protocolM.toByteArray().length);
                        Log.e("", "=======replayVideoEncoderInitDone ： protocolM.getData().length = " + protocolM.getData().length);

                        //发送head
                        outputStream.write(generateHead(CommonParams.MSG_CHANNEL_ID, 16));
                        outputStream.flush();
                        //发送msg （必须放在一个byte数组里）
                        final byte[] msg = new byte[16];
                        System.arraycopy(protocolM.toByteArray(), 0, msg, 0, protocolM.toByteArray().length);
                        System.arraycopy(protocolM.getData(), 0, msg, protocolM.toByteArray().length, protocolM.getData().length);
                        Log.e("", "=======replayVideoEncoderInitDone ： " + Arrays.toString(msg));
                        // [0, 8, 0, 0, 0, 1, 0, 8, 8, -48, 5, 16, -128, 10, 24, 30]
                        outputStream.write(msg);//msg head
                        outputStream.flush();
                        Log.e("", "=======replayVideoEncoderInitDone  ok");
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.e("", "=======replayVideoEncoderInitDone  exception");
                    }

                }


            }
        }).start();
    }

    //返回手机端encoder 编码信息
    public static void replayModuleStatus(final FileOutputStream outputStream) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (mLock) {

                    try {


                        CarlifeModuleStatusProto.CarlifeModuleStatus.Builder builder1 = CarlifeModuleStatusProto.CarlifeModuleStatus.newBuilder();
                        builder1.setModuleID(1);
                        builder1.setStatusID(0);
                        CarlifeModuleStatusProto.CarlifeModuleStatus status = builder1.build();
                        CarlifeModuleStatusListProto.CarlifeModuleStatusList.Builder builder = CarlifeModuleStatusListProto.CarlifeModuleStatusList.newBuilder();
                        builder.addModuleStatus(status);
                        builder.setCnt(1);
                        CarlifeModuleStatusListProto.CarlifeModuleStatusList list = builder.build();


                        final CarlifeCmdMessage protocolM = new CarlifeCmdMessage(true);
                        protocolM.setServiceType(CommonParams.MSG_CMD_MODULE_STATUS);
                        protocolM.setData(list.toByteArray());
                        protocolM.setLength(list.getSerializedSize());
                        Log.e("", "=======replayModuleStatus  ok");
                        Log.e("", "=======replayModuleStatus ： protocolM.toByteArray().length = " + protocolM.toByteArray().length);
                        Log.e("", "=======replayModuleStatus ： protocolM.getData().length = " + protocolM.getData().length);
                        int length = protocolM.toByteArray().length + protocolM.getData().length;
                        //发送head
                        outputStream.write(generateHead(CommonParams.MSG_CHANNEL_ID, length));
                        outputStream.flush();
                        //发送msg （必须放在一个byte数组里）
                        final byte[] msg = new byte[length];
                        System.arraycopy(protocolM.toByteArray(), 0, msg, 0, protocolM.toByteArray().length);
                        System.arraycopy(protocolM.getData(), 0, msg, protocolM.toByteArray().length, protocolM.getData().length);
                        Log.e("", "=======replayModuleStatus ： " + Arrays.toString(msg));
                        //[0, 2, 0, 0, 0, 1, 0, 2, 8, 1]
                        outputStream.write(msg);//msg head
                        outputStream.flush();
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.e("", "=======replayModuleStatus  exception");
                    }


                }
            }
        }).start();
    }

    //返回手机端信息
    public static void replayMDInfo(final FileOutputStream outputStream) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (mLock) {
                    try {
                        CarlifeDeviceInfoProto.CarlifeDeviceInfo.Builder builder = CarlifeDeviceInfoProto.CarlifeDeviceInfo.newBuilder();
                        builder.setOs(CommonParams.TYPE_OF_OS);
                        builder.setBoard(android.os.Build.BOARD);
                        builder.setBootloader(android.os.Build.BOOTLOADER);
                        builder.setBrand(android.os.Build.BRAND);
                        builder.setCpuAbi(android.os.Build.CPU_ABI);
                        builder.setCpuAbi2(android.os.Build.CPU_ABI2);
                        builder.setDevice(android.os.Build.DEVICE);
                        builder.setDisplay(android.os.Build.DISPLAY);
                        builder.setFingerprint(android.os.Build.FINGERPRINT);
                        builder.setHardware(android.os.Build.HARDWARE);
                        builder.setHost(android.os.Build.HOST);
                        builder.setCid(android.os.Build.ID);
                        builder.setManufacturer(android.os.Build.MANUFACTURER);
                        builder.setModel(android.os.Build.MODEL);
                        builder.setProduct(android.os.Build.PRODUCT);
                        builder.setSerial(android.os.Build.SERIAL);
                        builder.setCodename(android.os.Build.VERSION.CODENAME);
                        builder.setIncremental(android.os.Build.VERSION.INCREMENTAL);
                        builder.setRelease(android.os.Build.VERSION.RELEASE);
                        builder.setSdk(android.os.Build.VERSION.SDK);
                        builder.setSdkInt(android.os.Build.VERSION.SDK_INT);
                        CarlifeDeviceInfoProto.CarlifeDeviceInfo info = builder.build();
                        final CarlifeCmdMessage protocolM = new CarlifeCmdMessage(true);
                        protocolM.setServiceType(CommonParams.MSG_CMD_MD_INFO);
                        protocolM.setData(info.toByteArray());
                        protocolM.setLength(info.getSerializedSize());
                        Log.e("", "=======replayMDInfo  ok");
                        Log.e("", "=======replayMDInfo ： protocolM.toByteArray().length = " + protocolM.toByteArray().length);
                        Log.e("", "=======replayMDInfo ： protocolM.getData().length = " + protocolM.getData().length);
                        int length = protocolM.toByteArray().length + protocolM.getData().length;
                        //发送head
                        outputStream.write(generateHead(CommonParams.MSG_CHANNEL_ID, length));
                        outputStream.flush();
                        //发送msg （必须放在一个byte数组里）
                        final byte[] msg = new byte[length];
                        System.arraycopy(protocolM.toByteArray(), 0, msg, 0, protocolM.toByteArray().length);
                        System.arraycopy(protocolM.getData(), 0, msg, protocolM.toByteArray().length, protocolM.getData().length);
                        Log.e("", "=======replayMDInfo ： " + Arrays.toString(msg));
                        //[0, 2, 0, 0, 0, 1, 0, 2, 8, 1]
                        outputStream.write(msg);//msg head
                        outputStream.flush();
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.e("", "=======replayMDInfo  exception");
                    }

                }
            }
        }).start();
    }

    //返回版本匹配信息
    public static void replayVersionMatchStatus(final FileOutputStream outputStream) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (mLock) {
                    try {
                        CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus.Builder builder = CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus.newBuilder();
                        builder.setMatchStatus(PROTOCOL_VERSION_MATCH);
                        CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus matchStatus = builder.build();
                        final CarlifeCmdMessage protocolM = new CarlifeCmdMessage(true);
                        protocolM.setServiceType(CommonParams.MSG_CMD_PROTOCOL_VERSION_MATCH_STATUS);
                        protocolM.setData(matchStatus.toByteArray());
                        protocolM.setLength(matchStatus.getSerializedSize());
                        Log.e("", "=======replayVersionMatchStatus ： 222222");
                        //发送head
                        outputStream.write(generateHead(CommonParams.MSG_CHANNEL_ID, 10));
                        outputStream.flush();
                        //发送msg （必须放在一个byte数组里）
                        final byte[] msg = new byte[10];
                        Log.e("", "=======replayVersionMatchStatus ： protocolM.toByteArray().length = " + protocolM.toByteArray().length);
                        Log.e("", "=======replayVersionMatchStatus ： protocolM.getData().length = " + protocolM.getData().length);
                        System.arraycopy(protocolM.toByteArray(), 0, msg, 0, protocolM.toByteArray().length);
                        System.arraycopy(protocolM.getData(), 0, msg, protocolM.toByteArray().length, protocolM.getData().length);
                        Log.e("", "=======myHandler4444 ： " + Arrays.toString(msg));
                        //[0, 2, 0, 0, 0, 1, 0, 2, 8, 1]
                        outputStream.write(msg);//msg head
                        outputStream.flush();
                        Log.e("", "=======replayVersionMatchStatus  ok");
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.e("", "=======replayVersionMatchStatus  exception");
                    }

                }
            }
        }).start();
    }
}
