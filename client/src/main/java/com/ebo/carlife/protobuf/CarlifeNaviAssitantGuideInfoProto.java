// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.ebo.carlife.protobuf;

public final class CarlifeNaviAssitantGuideInfoProto {
  private CarlifeNaviAssitantGuideInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeNaviAssitantGuideInfo extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeNaviAssitantGuideInfo.newBuilder() to construct.
    private CarlifeNaviAssitantGuideInfo() {}
    
    private static final CarlifeNaviAssitantGuideInfo defaultInstance = new CarlifeNaviAssitantGuideInfo();
    public static CarlifeNaviAssitantGuideInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeNaviAssitantGuideInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.internal_static_com_baidu_carlife_protobuf_CarlifeNaviAssitantGuideInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.internal_static_com_baidu_carlife_protobuf_CarlifeNaviAssitantGuideInfo_fieldAccessorTable;
    }

    // required int32 action = 1;
    public static final int ACTION_FIELD_NUMBER = 1;
    private boolean hasAction;
    private int action_ = 0;
    public boolean hasAction() { return hasAction; }
    public int getAction() { return action_; }

    // required int32 assistantType = 2;
    public static final int ASSISTANTTYPE_FIELD_NUMBER = 2;
    private boolean hasAssistantType;
    private int assistantType_ = 0;
    public boolean hasAssistantType() { return hasAssistantType; }
    public int getAssistantType() { return assistantType_; }

    // required int32 trafficSignType = 3;
    public static final int TRAFFICSIGNTYPE_FIELD_NUMBER = 3;
    private boolean hasTrafficSignType;
    private int trafficSignType_ = 0;
    public boolean hasTrafficSignType() { return hasTrafficSignType; }
    public int getTrafficSignType() { return trafficSignType_; }

    // required int32 totalDistance = 4;
    public static final int TOTALDISTANCE_FIELD_NUMBER = 4;
    private boolean hasTotalDistance;
    private int totalDistance_ = 0;
    public boolean hasTotalDistance() { return hasTotalDistance; }
    public int getTotalDistance() { return totalDistance_; }

    // required int32 remainDistance = 5;
    public static final int REMAINDISTANCE_FIELD_NUMBER = 5;
    private boolean hasRemainDistance;
    private int remainDistance_ = 0;
    public boolean hasRemainDistance() { return hasRemainDistance; }
    public int getRemainDistance() { return remainDistance_; }

    // required int32 cameraSpeed = 6;
    public static final int CAMERASPEED_FIELD_NUMBER = 6;
    private boolean hasCameraSpeed;
    private int cameraSpeed_ = 0;
    public boolean hasCameraSpeed() { return hasCameraSpeed; }
    public int getCameraSpeed() { return cameraSpeed_; }

    public final boolean isInitialized() {
      if (!hasAction) return false;
      if (!hasAssistantType) return false;
      if (!hasTrafficSignType) return false;
      if (!hasTotalDistance) return false;
      if (!hasRemainDistance) return false;
      if (!hasCameraSpeed) return false;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasAction()) {
        output.writeInt32(1, getAction());
      }
      if (hasAssistantType()) {
        output.writeInt32(2, getAssistantType());
      }
      if (hasTrafficSignType()) {
        output.writeInt32(3, getTrafficSignType());
      }
      if (hasTotalDistance()) {
        output.writeInt32(4, getTotalDistance());
      }
      if (hasRemainDistance()) {
        output.writeInt32(5, getRemainDistance());
      }
      if (hasCameraSpeed()) {
        output.writeInt32(6, getCameraSpeed());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasAction()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getAction());
      }
      if (hasAssistantType()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, getAssistantType());
      }
      if (hasTrafficSignType()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, getTrafficSignType());
      }
      if (hasTotalDistance()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, getTotalDistance());
      }
      if (hasRemainDistance()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, getRemainDistance());
      }
      if (hasCameraSpeed()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, getCameraSpeed());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo result;

      // Construct using com.baidu.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo();
        return builder;
      }

      protected com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo.getDescriptor();
      }

      public com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo getDefaultInstanceForType() {
        return com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo) {
          return mergeFrom((com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo other) {
        if (other == com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo.getDefaultInstance()) return this;
        if (other.hasAction()) {
          setAction(other.getAction());
        }
        if (other.hasAssistantType()) {
          setAssistantType(other.getAssistantType());
        }
        if (other.hasTrafficSignType()) {
          setTrafficSignType(other.getTrafficSignType());
        }
        if (other.hasTotalDistance()) {
          setTotalDistance(other.getTotalDistance());
        }
        if (other.hasRemainDistance()) {
          setRemainDistance(other.getRemainDistance());
        }
        if (other.hasCameraSpeed()) {
          setCameraSpeed(other.getCameraSpeed());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setAction(input.readInt32());
              break;
            }
            case 16: {
              setAssistantType(input.readInt32());
              break;
            }
            case 24: {
              setTrafficSignType(input.readInt32());
              break;
            }
            case 32: {
              setTotalDistance(input.readInt32());
              break;
            }
            case 40: {
              setRemainDistance(input.readInt32());
              break;
            }
            case 48: {
              setCameraSpeed(input.readInt32());
              break;
            }
          }
        }
      }


      // required int32 action = 1;
      public boolean hasAction() {
        return result.hasAction();
      }
      public int getAction() {
        return result.getAction();
      }
      public Builder setAction(int value) {
        result.hasAction = true;
        result.action_ = value;
        return this;
      }
      public Builder clearAction() {
        result.hasAction = false;
        result.action_ = 0;
        return this;
      }

      // required int32 assistantType = 2;
      public boolean hasAssistantType() {
        return result.hasAssistantType();
      }
      public int getAssistantType() {
        return result.getAssistantType();
      }
      public Builder setAssistantType(int value) {
        result.hasAssistantType = true;
        result.assistantType_ = value;
        return this;
      }
      public Builder clearAssistantType() {
        result.hasAssistantType = false;
        result.assistantType_ = 0;
        return this;
      }

      // required int32 trafficSignType = 3;
      public boolean hasTrafficSignType() {
        return result.hasTrafficSignType();
      }
      public int getTrafficSignType() {
        return result.getTrafficSignType();
      }
      public Builder setTrafficSignType(int value) {
        result.hasTrafficSignType = true;
        result.trafficSignType_ = value;
        return this;
      }
      public Builder clearTrafficSignType() {
        result.hasTrafficSignType = false;
        result.trafficSignType_ = 0;
        return this;
      }

      // required int32 totalDistance = 4;
      public boolean hasTotalDistance() {
        return result.hasTotalDistance();
      }
      public int getTotalDistance() {
        return result.getTotalDistance();
      }
      public Builder setTotalDistance(int value) {
        result.hasTotalDistance = true;
        result.totalDistance_ = value;
        return this;
      }
      public Builder clearTotalDistance() {
        result.hasTotalDistance = false;
        result.totalDistance_ = 0;
        return this;
      }

      // required int32 remainDistance = 5;
      public boolean hasRemainDistance() {
        return result.hasRemainDistance();
      }
      public int getRemainDistance() {
        return result.getRemainDistance();
      }
      public Builder setRemainDistance(int value) {
        result.hasRemainDistance = true;
        result.remainDistance_ = value;
        return this;
      }
      public Builder clearRemainDistance() {
        result.hasRemainDistance = false;
        result.remainDistance_ = 0;
        return this;
      }

      // required int32 cameraSpeed = 6;
      public boolean hasCameraSpeed() {
        return result.hasCameraSpeed();
      }
      public int getCameraSpeed() {
        return result.getCameraSpeed();
      }
      public Builder setCameraSpeed(int value) {
        result.hasCameraSpeed = true;
        result.cameraSpeed_ = value;
        return this;
      }
      public Builder clearCameraSpeed() {
        result.hasCameraSpeed = false;
        result.cameraSpeed_ = 0;
        return this;
      }
    }

    static {
      com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.getDescriptor();
    }

    static {
      com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.internalForceInit();
    }
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeNaviAssitantGuideInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeNaviAssitantGuideInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'CarlifeNaviAssitantGuideInfoProto.prot" +
      "o\022\032com.baidu.carlife.protobuf\"\242\001\n\034Carlif" +
      "eNaviAssitantGuideInfo\022\016\n\006action\030\001 \002(\005\022\025" +
      "\n\rassistantType\030\002 \002(\005\022\027\n\017trafficSignType" +
      "\030\003 \002(\005\022\025\n\rtotalDistance\030\004 \002(\005\022\026\n\016remainD" +
      "istance\030\005 \002(\005\022\023\n\013cameraSpeed\030\006 \002(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeNaviAssitantGuideInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeNaviAssitantGuideInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeNaviAssitantGuideInfo_descriptor,
              new java.lang.String[] { "Action", "AssistantType", "TrafficSignType", "TotalDistance", "RemainDistance", "CameraSpeed", },
              com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo.class,
              com.ebo.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
}
