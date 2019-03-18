package com.vmmobvoi.karl.client;

import android.util.Log;

import com.ebo.carlife.protobuf.CarlifeProtocolVersionProto;
import com.ebo.carlife.protobuf.CarlifeVideoEncoderInfoProto;
import com.google.protobuf.InvalidProtocolBufferException;

import java.text.MessageFormat;
import java.util.Arrays;

public class MessageReceiverHandler {


    //解析head中包含的channel id
    public static int parserChannelId(byte[] data) {
        return ByteConvert.bytesToInt(data);
    }

    //解析head中包含的msg的长度
    public static int parserMsgLengthFromHead(byte[] data) {
        return ByteConvert.bytesToInt(data);
    }

    //解析所有的cmd指令，返回应该返回的msg类型
    public static int parserCmdMessage(byte[] cmd) {
        int cmdServiceType = ByteConvert.bytesToInt(new byte[]{cmd[4], cmd[5], cmd[6], cmd[7]});
        Log.e("", "=========parserCmdMessage cmdServiceType = " + Util.algorismToHEXString(cmdServiceType, 8));
        if (cmdServiceType == CommonParams.MSG_CMD_HU_PROTOCOL_VERSION) {
            CarlifeProtocolVersionProto.CarlifeProtocolVersion carlifeProtocolVersion = null;
            try {
                carlifeProtocolVersion = CarlifeProtocolVersionProto.CarlifeProtocolVersion.parseFrom(new byte[]{cmd[8], cmd[9], cmd[10], cmd[11]});
                Log.e("", "=======Rec: MajorVersion = " + carlifeProtocolVersion.getMajorVersion() + " , MinorVersion = " + carlifeProtocolVersion.getMinorVersion());
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
            return CommonParams.MSG_CMD_PROTOCOL_VERSION_MATCH_STATUS;
        } else if (CommonParams.MSG_CMD_STATISTIC_INFO == cmdServiceType) {//00018027
            Log.e("", "=========MSG_CMD_STATISTIC_INFO= ");
        } else if (CommonParams.MSG_CMD_HU_INFO == cmdServiceType) {//00018003
            Log.e("", "=========MSG_CMD_HU_INFO= ");
            //收到hu信息 ，返回MD信息
            return CommonParams.MSG_CMD_MD_INFO;
        } else if (CommonParams.MSG_CMD_MODULE_CONTROL == cmdServiceType) {//00018028
            Log.e("", "=========MSG_CMD_MODULE_CONTROL= ");

            //MSG_CMD_MODULE_STATUS  应该回复的类型
            return CommonParams.MSG_CMD_MODULE_STATUS;
        } else if (CommonParams.MSG_CMD_VIDEO_ENCODER_INIT == cmdServiceType) {//00018007
            Log.e("", "=========MSG_CMD_VIDEO_ENCODER_INIT = cmd =  "+Arrays.toString(cmd));
            //CarlifeVideoEncoderInfo: getData  = [8, -128, 16, 16, -128, 12, 24, 30]
            //CarlifeVideoEncoderInfo: getData length  = 8
            //MSG_CMD_VIDEO_ENCODER_INIT = cmd =  [0, 8, 0, 0, 0, 1, -128, 7, 8, -128, 16, 16, -128, 12, 24, 30]
            CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo encoderInfo = null;
            try {
                encoderInfo = CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo.parseFrom(new byte[]{cmd[8], cmd[9], cmd[10], cmd[11],cmd[12], cmd[13], cmd[14], cmd[15]});
                Log.e("", MessageFormat.format("=======Rec: encoderInfo '{' width = {0} , height = {1} , framerate = {2} '}'", encoderInfo.getWidth(), encoderInfo.getHeight(), encoderInfo.getFrameRate()));
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
            return CommonParams.MSG_CMD_VIDEO_ENCODER_INIT_DONE;
        }
        return -1;
    }


    public static int parserVideoMessage(byte[] msg) {
        Log.e("", "=========parserVideoMessage= ");
        return -1;
    }
}


