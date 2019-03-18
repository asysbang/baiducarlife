// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.ebo.carlife.protobuf;

public final class CarlifeBTHfpResponseProto {
  private CarlifeBTHfpResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeBTHfpResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeBTHfpResponse.newBuilder() to construct.
    private CarlifeBTHfpResponse() {}
    
    private static final CarlifeBTHfpResponse defaultInstance = new CarlifeBTHfpResponse();
    public static CarlifeBTHfpResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeBTHfpResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpResponse_fieldAccessorTable;
    }

    // required int32 status = 1;
    public static final int STATUS_FIELD_NUMBER = 1;
    private boolean hasStatus;
    private int status_ = 0;
    public boolean hasStatus() { return hasStatus; }
    public int getStatus() { return status_; }

    // required int32 cmd = 2;
    public static final int CMD_FIELD_NUMBER = 2;
    private boolean hasCmd;
    private int cmd_ = 0;
    public boolean hasCmd() { return hasCmd; }
    public int getCmd() { return cmd_; }

    // optional int32 dtmfCode = 3;
    public static final int DTMFCODE_FIELD_NUMBER = 3;
    private boolean hasDtmfCode;
    private int dtmfCode_ = 0;
    public boolean hasDtmfCode() { return hasDtmfCode; }
    public int getDtmfCode() { return dtmfCode_; }

    public final boolean isInitialized() {
      if (!hasStatus) return false;
      if (!hasCmd) return false;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasStatus()) {
        output.writeInt32(1, getStatus());
      }
      if (hasCmd()) {
        output.writeInt32(2, getCmd());
      }
      if (hasDtmfCode()) {
        output.writeInt32(3, getDtmfCode());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasStatus()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getStatus());
      }
      if (hasCmd()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, getCmd());
      }
      if (hasDtmfCode()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, getDtmfCode());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse result;

      // Construct using com.baidu.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse();
        return builder;
      }

      protected com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse.getDescriptor();
      }

      public com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse getDefaultInstanceForType() {
        return com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse) {
          return mergeFrom((com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse other) {
        if (other == com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasCmd()) {
          setCmd(other.getCmd());
        }
        if (other.hasDtmfCode()) {
          setDtmfCode(other.getDtmfCode());
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
              setStatus(input.readInt32());
              break;
            }
            case 16: {
              setCmd(input.readInt32());
              break;
            }
            case 24: {
              setDtmfCode(input.readInt32());
              break;
            }
          }
        }
      }


      // required int32 status = 1;
      public boolean hasStatus() {
        return result.hasStatus();
      }
      public int getStatus() {
        return result.getStatus();
      }
      public Builder setStatus(int value) {
        result.hasStatus = true;
        result.status_ = value;
        return this;
      }
      public Builder clearStatus() {
        result.hasStatus = false;
        result.status_ = 0;
        return this;
      }

      // required int32 cmd = 2;
      public boolean hasCmd() {
        return result.hasCmd();
      }
      public int getCmd() {
        return result.getCmd();
      }
      public Builder setCmd(int value) {
        result.hasCmd = true;
        result.cmd_ = value;
        return this;
      }
      public Builder clearCmd() {
        result.hasCmd = false;
        result.cmd_ = 0;
        return this;
      }

      // optional int32 dtmfCode = 3;
      public boolean hasDtmfCode() {
        return result.hasDtmfCode();
      }
      public int getDtmfCode() {
        return result.getDtmfCode();
      }
      public Builder setDtmfCode(int value) {
        result.hasDtmfCode = true;
        result.dtmfCode_ = value;
        return this;
      }
      public Builder clearDtmfCode() {
        result.hasDtmfCode = false;
        result.dtmfCode_ = 0;
        return this;
      }
    }

    static {
      com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.getDescriptor();
    }

    static {
      com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.internalForceInit();
    }
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037CarlifeBTHfpResponseProto.proto\022\032com.b" +
      "aidu.carlife.protobuf\"E\n\024CarlifeBTHfpRes" +
      "ponse\022\016\n\006status\030\001 \002(\005\022\013\n\003cmd\030\002 \002(\005\022\020\n\010dt" +
      "mfCode\030\003 \001(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpResponse_descriptor,
              new java.lang.String[] { "Status", "Cmd", "DtmfCode", },
              com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse.class,
              com.ebo.carlife.protobuf.CarlifeBTHfpResponseProto.CarlifeBTHfpResponse.Builder.class);
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
