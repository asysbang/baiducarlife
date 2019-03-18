// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.ebo.carlife.protobuf;

import com.google.protobuf.Message;

public final class CarlifeBTHfpConnectionProto {
  private CarlifeBTHfpConnectionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeBTHfpConnection extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeBTHfpConnection.newBuilder() to construct.
    private CarlifeBTHfpConnection() {}
    
    private static final CarlifeBTHfpConnection defaultInstance = new CarlifeBTHfpConnection();
    public static CarlifeBTHfpConnection getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeBTHfpConnection getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpConnection_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpConnection_fieldAccessorTable;
    }

    // required int32 state = 1;
    public static final int STATE_FIELD_NUMBER = 1;
    private boolean hasState;
    private int state_ = 0;
    public boolean hasState() { return hasState; }
    public int getState() { return state_; }

    // optional string address = 2;
    public static final int ADDRESS_FIELD_NUMBER = 2;
    private boolean hasAddress;
    private java.lang.String address_ = "";
    public boolean hasAddress() { return hasAddress; }
    public java.lang.String getAddress() { return address_; }

    // optional string name = 3;
    public static final int NAME_FIELD_NUMBER = 3;
    private boolean hasName;
    private java.lang.String name_ = "";
    public boolean hasName() { return hasName; }
    public java.lang.String getName() { return name_; }

    public final boolean isInitialized() {
      if (!hasState) return false;
      return true;
    }



    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasState()) {
        output.writeInt32(1, getState());
      }
      if (hasAddress()) {
        output.writeString(2, getAddress());
      }
      if (hasName()) {
        output.writeString(3, getName());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasState()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getState());
      }
      if (hasAddress()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getAddress());
      }
      if (hasName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getName());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection result;

      // Construct using com.baidu.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection();
        return builder;
      }

      protected com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection.getDescriptor();
      }

      public com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection getDefaultInstanceForType() {
        return com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection) {
          return mergeFrom((com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection other) {
        if (other == com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection.getDefaultInstance()) return this;
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasAddress()) {
          setAddress(other.getAddress());
        }
        if (other.hasName()) {
          setName(other.getName());
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
              setState(input.readInt32());
              break;
            }
            case 18: {
              setAddress(input.readString());
              break;
            }
            case 26: {
              setName(input.readString());
              break;
            }
          }
        }
      }


      // required int32 state = 1;
      public boolean hasState() {
        return result.hasState();
      }
      public int getState() {
        return result.getState();
      }
      public Builder setState(int value) {
        result.hasState = true;
        result.state_ = value;
        return this;
      }
      public Builder clearState() {
        result.hasState = false;
        result.state_ = 0;
        return this;
      }

      // optional string address = 2;
      public boolean hasAddress() {
        return result.hasAddress();
      }
      public java.lang.String getAddress() {
        return result.getAddress();
      }
      public Builder setAddress(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasAddress = true;
        result.address_ = value;
        return this;
      }
      public Builder clearAddress() {
        result.hasAddress = false;
        result.address_ = getDefaultInstance().getAddress();
        return this;
      }

      // optional string name = 3;
      public boolean hasName() {
        return result.hasName();
      }
      public java.lang.String getName() {
        return result.getName();
      }
      public Builder setName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasName = true;
        result.name_ = value;
        return this;
      }
      public Builder clearName() {
        result.hasName = false;
        result.name_ = getDefaultInstance().getName();
        return this;
      }
    }

    static {
      com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.getDescriptor();
    }

    static {
      com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.internalForceInit();
    }
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpConnection_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpConnection_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!CarlifeBTHfpConnectionProto.proto\022\032com" +
      ".baidu.carlife.protobuf\"F\n\026CarlifeBTHfpC" +
      "onnection\022\r\n\005state\030\001 \002(\005\022\017\n\007address\030\002 \001(" +
      "\t\022\014\n\004name\030\003 \001(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpConnection_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpConnection_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeBTHfpConnection_descriptor,
              new java.lang.String[] { "State", "Address", "Name", },
              com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection.class,
              com.ebo.carlife.protobuf.CarlifeBTHfpConnectionProto.CarlifeBTHfpConnection.Builder.class);
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