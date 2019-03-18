/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.ebo.carlife.protobuf;

public final class CarlifeMdAesKeyRequestProto {
  private CarlifeMdAesKeyRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeMdAesKeyRequest extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeMdAesKeyRequest.newBuilder() to construct.
    private CarlifeMdAesKeyRequest() {}
    
    private static final CarlifeMdAesKeyRequest defaultInstance = new CarlifeMdAesKeyRequest();
    public static CarlifeMdAesKeyRequest getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeMdAesKeyRequest getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CarlifeMdAesKeyRequestProto.internal_static_com_baidu_carlife_protobuf_CarlifeMdAesKeyRequest_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CarlifeMdAesKeyRequestProto.internal_static_com_baidu_carlife_protobuf_CarlifeMdAesKeyRequest_fieldAccessorTable;
    }
    
    // required string aesKey = 1;
    public static final int AESKEY_FIELD_NUMBER = 1;
    private boolean hasAesKey;
    private String aesKey_ = "";
    public boolean hasAesKey() { return hasAesKey; }
    public String getAesKey() { return aesKey_; }
    
    public final boolean isInitialized() {
      if (!hasAesKey) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasAesKey()) {
        output.writeString(1, getAesKey());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasAesKey()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getAesKey());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static CarlifeMdAesKeyRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static CarlifeMdAesKeyRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static CarlifeMdAesKeyRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static CarlifeMdAesKeyRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static CarlifeMdAesKeyRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static CarlifeMdAesKeyRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static CarlifeMdAesKeyRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static CarlifeMdAesKeyRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static CarlifeMdAesKeyRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static CarlifeMdAesKeyRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(CarlifeMdAesKeyRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private CarlifeMdAesKeyRequest result;
      
      // Construct using com.baidu.carlife.protobuf.CarlifeMdAesKeyRequestProto.CarlifeMdAesKeyRequest.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new CarlifeMdAesKeyRequest();
        return builder;
      }
      
      protected CarlifeMdAesKeyRequest internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new CarlifeMdAesKeyRequest();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CarlifeMdAesKeyRequest.getDescriptor();
      }
      
      public CarlifeMdAesKeyRequest getDefaultInstanceForType() {
        return CarlifeMdAesKeyRequest.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public CarlifeMdAesKeyRequest build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private CarlifeMdAesKeyRequest buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public CarlifeMdAesKeyRequest buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        CarlifeMdAesKeyRequest returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof CarlifeMdAesKeyRequest) {
          return mergeFrom((CarlifeMdAesKeyRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(CarlifeMdAesKeyRequest other) {
        if (other == CarlifeMdAesKeyRequest.getDefaultInstance()) return this;
        if (other.hasAesKey()) {
          setAesKey(other.getAesKey());
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
              setAesKey(input.readString());
              break;
            }
          }
        }
      }
      
      
      // required string aesKey = 1;
      public boolean hasAesKey() {
        return result.hasAesKey();
      }
      public String getAesKey() {
        return result.getAesKey();
      }
      public Builder setAesKey(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasAesKey = true;
        result.aesKey_ = value;
        return this;
      }
      public Builder clearAesKey() {
        result.hasAesKey = false;
        result.aesKey_ = getDefaultInstance().getAesKey();
        return this;
      }
    }
    
    static {
      CarlifeMdAesKeyRequestProto.getDescriptor();
    }
    
    static {
      CarlifeMdAesKeyRequestProto.internalForceInit();
    }
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeMdAesKeyRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeMdAesKeyRequest_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n!CarlifeMdAesKeyRequestProto.proto\022\032com" +
      ".baidu.carlife.protobuf\"(\n\026CarlifeMdAesK" +
      "eyRequest\022\016\n\006aesKey\030\001 \002(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeMdAesKeyRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeMdAesKeyRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeMdAesKeyRequest_descriptor,
              new String[] { "AesKey", },
              CarlifeMdAesKeyRequest.class,
              CarlifeMdAesKeyRequest.Builder.class);
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