// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.ebo.carlife.protobuf;

public final class CarlifeTTSInitProto {
  private CarlifeTTSInitProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeTTSInit extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeTTSInit.newBuilder() to construct.
    private CarlifeTTSInit() {}
    
    private static final CarlifeTTSInit defaultInstance = new CarlifeTTSInit();
    public static CarlifeTTSInit getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeTTSInit getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ebo.carlife.protobuf.CarlifeTTSInitProto.internal_static_com_baidu_carlife_protobuf_CarlifeTTSInit_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ebo.carlife.protobuf.CarlifeTTSInitProto.internal_static_com_baidu_carlife_protobuf_CarlifeTTSInit_fieldAccessorTable;
    }

    // required int32 sampleRate = 1;
    public static final int SAMPLERATE_FIELD_NUMBER = 1;
    private boolean hasSampleRate;
    private int sampleRate_ = 0;
    public boolean hasSampleRate() { return hasSampleRate; }
    public int getSampleRate() { return sampleRate_; }

    // required int32 channelConfig = 2;
    public static final int CHANNELCONFIG_FIELD_NUMBER = 2;
    private boolean hasChannelConfig;
    private int channelConfig_ = 0;
    public boolean hasChannelConfig() { return hasChannelConfig; }
    public int getChannelConfig() { return channelConfig_; }

    // required int32 sampleFormat = 3;
    public static final int SAMPLEFORMAT_FIELD_NUMBER = 3;
    private boolean hasSampleFormat;
    private int sampleFormat_ = 0;
    public boolean hasSampleFormat() { return hasSampleFormat; }
    public int getSampleFormat() { return sampleFormat_; }

    public final boolean isInitialized() {
      if (!hasSampleRate) return false;
      if (!hasChannelConfig) return false;
      if (!hasSampleFormat) return false;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasSampleRate()) {
        output.writeInt32(1, getSampleRate());
      }
      if (hasChannelConfig()) {
        output.writeInt32(2, getChannelConfig());
      }
      if (hasSampleFormat()) {
        output.writeInt32(3, getSampleFormat());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasSampleRate()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getSampleRate());
      }
      if (hasChannelConfig()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, getChannelConfig());
      }
      if (hasSampleFormat()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, getSampleFormat());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit result;

      // Construct using com.baidu.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit();
        return builder;
      }

      protected com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit.getDescriptor();
      }

      public com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit getDefaultInstanceForType() {
        return com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit) {
          return mergeFrom((com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit other) {
        if (other == com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit.getDefaultInstance()) return this;
        if (other.hasSampleRate()) {
          setSampleRate(other.getSampleRate());
        }
        if (other.hasChannelConfig()) {
          setChannelConfig(other.getChannelConfig());
        }
        if (other.hasSampleFormat()) {
          setSampleFormat(other.getSampleFormat());
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
              setSampleRate(input.readInt32());
              break;
            }
            case 16: {
              setChannelConfig(input.readInt32());
              break;
            }
            case 24: {
              setSampleFormat(input.readInt32());
              break;
            }
          }
        }
      }


      // required int32 sampleRate = 1;
      public boolean hasSampleRate() {
        return result.hasSampleRate();
      }
      public int getSampleRate() {
        return result.getSampleRate();
      }
      public Builder setSampleRate(int value) {
        result.hasSampleRate = true;
        result.sampleRate_ = value;
        return this;
      }
      public Builder clearSampleRate() {
        result.hasSampleRate = false;
        result.sampleRate_ = 0;
        return this;
      }

      // required int32 channelConfig = 2;
      public boolean hasChannelConfig() {
        return result.hasChannelConfig();
      }
      public int getChannelConfig() {
        return result.getChannelConfig();
      }
      public Builder setChannelConfig(int value) {
        result.hasChannelConfig = true;
        result.channelConfig_ = value;
        return this;
      }
      public Builder clearChannelConfig() {
        result.hasChannelConfig = false;
        result.channelConfig_ = 0;
        return this;
      }

      // required int32 sampleFormat = 3;
      public boolean hasSampleFormat() {
        return result.hasSampleFormat();
      }
      public int getSampleFormat() {
        return result.getSampleFormat();
      }
      public Builder setSampleFormat(int value) {
        result.hasSampleFormat = true;
        result.sampleFormat_ = value;
        return this;
      }
      public Builder clearSampleFormat() {
        result.hasSampleFormat = false;
        result.sampleFormat_ = 0;
        return this;
      }
    }

    static {
      com.ebo.carlife.protobuf.CarlifeTTSInitProto.getDescriptor();
    }

    static {
      com.ebo.carlife.protobuf.CarlifeTTSInitProto.internalForceInit();
    }
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeTTSInit_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeTTSInit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031CarlifeTTSInitProto.proto\022\032com.baidu.c" +
      "arlife.protobuf\"Q\n\016CarlifeTTSInit\022\022\n\nsam" +
      "pleRate\030\001 \002(\005\022\025\n\rchannelConfig\030\002 \002(\005\022\024\n\014" +
      "sampleFormat\030\003 \002(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeTTSInit_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeTTSInit_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeTTSInit_descriptor,
              new java.lang.String[] { "SampleRate", "ChannelConfig", "SampleFormat", },
              com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit.class,
              com.ebo.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit.Builder.class);
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
