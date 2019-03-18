// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.ebo.carlife.protobuf;

public final class CarlifeTouchScrollProto {
  private CarlifeTouchScrollProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeTouchScroll extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeTouchScroll.newBuilder() to construct.
    private CarlifeTouchScroll() {}
    
    private static final CarlifeTouchScroll defaultInstance = new CarlifeTouchScroll();
    public static CarlifeTouchScroll getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeTouchScroll getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ebo.carlife.protobuf.CarlifeTouchScrollProto.internal_static_com_baidu_carlife_protobuf_CarlifeTouchScroll_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ebo.carlife.protobuf.CarlifeTouchScrollProto.internal_static_com_baidu_carlife_protobuf_CarlifeTouchScroll_fieldAccessorTable;
    }

    // required int32 x1 = 1;
    public static final int X1_FIELD_NUMBER = 1;
    private boolean hasX1;
    private int x1_ = 0;
    public boolean hasX1() { return hasX1; }
    public int getX1() { return x1_; }

    // required int32 y1 = 2;
    public static final int Y1_FIELD_NUMBER = 2;
    private boolean hasY1;
    private int y1_ = 0;
    public boolean hasY1() { return hasY1; }
    public int getY1() { return y1_; }

    // required int32 x2 = 3;
    public static final int X2_FIELD_NUMBER = 3;
    private boolean hasX2;
    private int x2_ = 0;
    public boolean hasX2() { return hasX2; }
    public int getX2() { return x2_; }

    // required int32 y2 = 4;
    public static final int Y2_FIELD_NUMBER = 4;
    private boolean hasY2;
    private int y2_ = 0;
    public boolean hasY2() { return hasY2; }
    public int getY2() { return y2_; }

    // required float distanceX = 5;
    public static final int DISTANCEX_FIELD_NUMBER = 5;
    private boolean hasDistanceX;
    private float distanceX_ = 0F;
    public boolean hasDistanceX() { return hasDistanceX; }
    public float getDistanceX() { return distanceX_; }

    // required float distanceY = 6;
    public static final int DISTANCEY_FIELD_NUMBER = 6;
    private boolean hasDistanceY;
    private float distanceY_ = 0F;
    public boolean hasDistanceY() { return hasDistanceY; }
    public float getDistanceY() { return distanceY_; }

    public final boolean isInitialized() {
      if (!hasX1) return false;
      if (!hasY1) return false;
      if (!hasX2) return false;
      if (!hasY2) return false;
      if (!hasDistanceX) return false;
      if (!hasDistanceY) return false;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasX1()) {
        output.writeInt32(1, getX1());
      }
      if (hasY1()) {
        output.writeInt32(2, getY1());
      }
      if (hasX2()) {
        output.writeInt32(3, getX2());
      }
      if (hasY2()) {
        output.writeInt32(4, getY2());
      }
      if (hasDistanceX()) {
        output.writeFloat(5, getDistanceX());
      }
      if (hasDistanceY()) {
        output.writeFloat(6, getDistanceY());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasX1()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getX1());
      }
      if (hasY1()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, getY1());
      }
      if (hasX2()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, getX2());
      }
      if (hasY2()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, getY2());
      }
      if (hasDistanceX()) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, getDistanceX());
      }
      if (hasDistanceY()) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(6, getDistanceY());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll result;

      // Construct using com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll();
        return builder;
      }

      protected com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll.getDescriptor();
      }

      public com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll getDefaultInstanceForType() {
        return com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll) {
          return mergeFrom((com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll other) {
        if (other == com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll.getDefaultInstance()) return this;
        if (other.hasX1()) {
          setX1(other.getX1());
        }
        if (other.hasY1()) {
          setY1(other.getY1());
        }
        if (other.hasX2()) {
          setX2(other.getX2());
        }
        if (other.hasY2()) {
          setY2(other.getY2());
        }
        if (other.hasDistanceX()) {
          setDistanceX(other.getDistanceX());
        }
        if (other.hasDistanceY()) {
          setDistanceY(other.getDistanceY());
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
              setX1(input.readInt32());
              break;
            }
            case 16: {
              setY1(input.readInt32());
              break;
            }
            case 24: {
              setX2(input.readInt32());
              break;
            }
            case 32: {
              setY2(input.readInt32());
              break;
            }
            case 45: {
              setDistanceX(input.readFloat());
              break;
            }
            case 53: {
              setDistanceY(input.readFloat());
              break;
            }
          }
        }
      }


      // required int32 x1 = 1;
      public boolean hasX1() {
        return result.hasX1();
      }
      public int getX1() {
        return result.getX1();
      }
      public Builder setX1(int value) {
        result.hasX1 = true;
        result.x1_ = value;
        return this;
      }
      public Builder clearX1() {
        result.hasX1 = false;
        result.x1_ = 0;
        return this;
      }

      // required int32 y1 = 2;
      public boolean hasY1() {
        return result.hasY1();
      }
      public int getY1() {
        return result.getY1();
      }
      public Builder setY1(int value) {
        result.hasY1 = true;
        result.y1_ = value;
        return this;
      }
      public Builder clearY1() {
        result.hasY1 = false;
        result.y1_ = 0;
        return this;
      }

      // required int32 x2 = 3;
      public boolean hasX2() {
        return result.hasX2();
      }
      public int getX2() {
        return result.getX2();
      }
      public Builder setX2(int value) {
        result.hasX2 = true;
        result.x2_ = value;
        return this;
      }
      public Builder clearX2() {
        result.hasX2 = false;
        result.x2_ = 0;
        return this;
      }

      // required int32 y2 = 4;
      public boolean hasY2() {
        return result.hasY2();
      }
      public int getY2() {
        return result.getY2();
      }
      public Builder setY2(int value) {
        result.hasY2 = true;
        result.y2_ = value;
        return this;
      }
      public Builder clearY2() {
        result.hasY2 = false;
        result.y2_ = 0;
        return this;
      }

      // required float distanceX = 5;
      public boolean hasDistanceX() {
        return result.hasDistanceX();
      }
      public float getDistanceX() {
        return result.getDistanceX();
      }
      public Builder setDistanceX(float value) {
        result.hasDistanceX = true;
        result.distanceX_ = value;
        return this;
      }
      public Builder clearDistanceX() {
        result.hasDistanceX = false;
        result.distanceX_ = 0F;
        return this;
      }

      // required float distanceY = 6;
      public boolean hasDistanceY() {
        return result.hasDistanceY();
      }
      public float getDistanceY() {
        return result.getDistanceY();
      }
      public Builder setDistanceY(float value) {
        result.hasDistanceY = true;
        result.distanceY_ = value;
        return this;
      }
      public Builder clearDistanceY() {
        result.hasDistanceY = false;
        result.distanceY_ = 0F;
        return this;
      }
    }

    static {
      com.ebo.carlife.protobuf.CarlifeTouchScrollProto.getDescriptor();
    }

    static {
      com.ebo.carlife.protobuf.CarlifeTouchScrollProto.internalForceInit();
    }
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeTouchScroll_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeTouchScroll_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035CarlifeTouchScrollProto.proto\022\032com.bai" +
      "du.carlife.protobuf\"j\n\022CarlifeTouchScrol" +
      "l\022\n\n\002x1\030\001 \002(\005\022\n\n\002y1\030\002 \002(\005\022\n\n\002x2\030\003 \002(\005\022\n\n" +
      "\002y2\030\004 \002(\005\022\021\n\tdistanceX\030\005 \002(\002\022\021\n\tdistance" +
      "Y\030\006 \002(\002"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeTouchScroll_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeTouchScroll_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeTouchScroll_descriptor,
              new java.lang.String[] { "X1", "Y1", "X2", "Y2", "DistanceX", "DistanceY", },
              com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll.class,
              com.ebo.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScroll.Builder.class);
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