// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.ebo.carlife.protobuf;

public final class CarlifeAuthenResponseProto {
  private CarlifeAuthenResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeAuthenResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeAuthenResponse.newBuilder() to construct.
    private CarlifeAuthenResponse() {}
    
    private static final CarlifeAuthenResponse defaultInstance = new CarlifeAuthenResponse();
    public static CarlifeAuthenResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeAuthenResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.internal_static_com_baidu_carlife_protobuf_CarlifeAuthenResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.internal_static_com_baidu_carlife_protobuf_CarlifeAuthenResponse_fieldAccessorTable;
    }

    // required string encryptValue = 1;
    public static final int ENCRYPTVALUE_FIELD_NUMBER = 1;
    private boolean hasEncryptValue;
    private java.lang.String encryptValue_ = "";
    public boolean hasEncryptValue() { return hasEncryptValue; }
    public java.lang.String getEncryptValue() { return encryptValue_; }

    public final boolean isInitialized() {
      if (!hasEncryptValue) return false;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasEncryptValue()) {
        output.writeString(1, getEncryptValue());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasEncryptValue()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getEncryptValue());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse result;

      // Construct using com.baidu.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse();
        return builder;
      }

      protected com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse.getDescriptor();
      }

      public com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse getDefaultInstanceForType() {
        return com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse) {
          return mergeFrom((com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse other) {
        if (other == com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse.getDefaultInstance()) return this;
        if (other.hasEncryptValue()) {
          setEncryptValue(other.getEncryptValue());
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
            case 10: {
              setEncryptValue(input.readString());
              break;
            }
          }
        }
      }


      // required string encryptValue = 1;
      public boolean hasEncryptValue() {
        return result.hasEncryptValue();
      }
      public java.lang.String getEncryptValue() {
        return result.getEncryptValue();
      }
      public Builder setEncryptValue(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasEncryptValue = true;
        result.encryptValue_ = value;
        return this;
      }
      public Builder clearEncryptValue() {
        result.hasEncryptValue = false;
        result.encryptValue_ = getDefaultInstance().getEncryptValue();
        return this;
      }
    }

    static {
      com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.getDescriptor();
    }

    static {
      com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.internalForceInit();
    }
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeAuthenResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeAuthenResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n CarlifeAuthenResponseProto.proto\022\032com." +
      "baidu.carlife.protobuf\"-\n\025CarlifeAuthenR" +
      "esponse\022\024\n\014encryptValue\030\001 \002(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeAuthenResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeAuthenResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeAuthenResponse_descriptor,
              new java.lang.String[] { "EncryptValue", },
              com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse.class,
              com.ebo.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponse.Builder.class);
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