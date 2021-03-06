// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.ebo.carlife.protobuf;

public final class CarlifeAuthenRequestProto {
  private CarlifeAuthenRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeAuthenRequest extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeAuthenRequest.newBuilder() to construct.
    private CarlifeAuthenRequest() {}
    
    private static final CarlifeAuthenRequest defaultInstance = new CarlifeAuthenRequest();
    public static CarlifeAuthenRequest getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeAuthenRequest getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.internal_static_com_baidu_carlife_protobuf_CarlifeAuthenRequest_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.internal_static_com_baidu_carlife_protobuf_CarlifeAuthenRequest_fieldAccessorTable;
    }

    // required string randomValue = 1;
    public static final int RANDOMVALUE_FIELD_NUMBER = 1;
    private boolean hasRandomValue;
    private java.lang.String randomValue_ = "";
    public boolean hasRandomValue() { return hasRandomValue; }
    public java.lang.String getRandomValue() { return randomValue_; }

    public final boolean isInitialized() {
      if (!hasRandomValue) return false;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasRandomValue()) {
        output.writeString(1, getRandomValue());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasRandomValue()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getRandomValue());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest result;

      // Construct using com.baidu.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest();
        return builder;
      }

      protected com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest.getDescriptor();
      }

      public com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest getDefaultInstanceForType() {
        return com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest) {
          return mergeFrom((com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest other) {
        if (other == com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest.getDefaultInstance()) return this;
        if (other.hasRandomValue()) {
          setRandomValue(other.getRandomValue());
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
              setRandomValue(input.readString());
              break;
            }
          }
        }
      }


      // required string randomValue = 1;
      public boolean hasRandomValue() {
        return result.hasRandomValue();
      }
      public java.lang.String getRandomValue() {
        return result.getRandomValue();
      }
      public Builder setRandomValue(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasRandomValue = true;
        result.randomValue_ = value;
        return this;
      }
      public Builder clearRandomValue() {
        result.hasRandomValue = false;
        result.randomValue_ = getDefaultInstance().getRandomValue();
        return this;
      }
    }

    static {
      com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.getDescriptor();
    }

    static {
      com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.internalForceInit();
    }
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeAuthenRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeAuthenRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037CarlifeAuthenRequestProto.proto\022\032com.b" +
      "aidu.carlife.protobuf\"+\n\024CarlifeAuthenRe" +
      "quest\022\023\n\013randomValue\030\001 \002(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeAuthenRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeAuthenRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeAuthenRequest_descriptor,
              new java.lang.String[] { "RandomValue", },
              com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest.class,
              com.ebo.carlife.protobuf.CarlifeAuthenRequestProto.CarlifeAuthenRequest.Builder.class);
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
