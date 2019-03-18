// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.ebo.carlife.protobuf;

public final class CarlifeMediaProgressBarProto {
  private CarlifeMediaProgressBarProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeMediaProgressBar extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeMediaProgressBar.newBuilder() to construct.
    private CarlifeMediaProgressBar() {}
    
    private static final CarlifeMediaProgressBar defaultInstance = new CarlifeMediaProgressBar();
    public static CarlifeMediaProgressBar getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeMediaProgressBar getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.internal_static_com_baidu_carlife_protobuf_CarlifeMediaProgressBar_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.internal_static_com_baidu_carlife_protobuf_CarlifeMediaProgressBar_fieldAccessorTable;
    }

    // required int32 progressBar = 1;
    public static final int PROGRESSBAR_FIELD_NUMBER = 1;
    private boolean hasProgressBar;
    private int progressBar_ = 0;
    public boolean hasProgressBar() { return hasProgressBar; }
    public int getProgressBar() { return progressBar_; }

    public final boolean isInitialized() {
      if (!hasProgressBar) return false;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasProgressBar()) {
        output.writeInt32(1, getProgressBar());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasProgressBar()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getProgressBar());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar result;

      // Construct using com.baidu.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar();
        return builder;
      }

      protected com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar.getDescriptor();
      }

      public com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar getDefaultInstanceForType() {
        return com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar) {
          return mergeFrom((com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar other) {
        if (other == com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar.getDefaultInstance()) return this;
        if (other.hasProgressBar()) {
          setProgressBar(other.getProgressBar());
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
              setProgressBar(input.readInt32());
              break;
            }
          }
        }
      }


      // required int32 progressBar = 1;
      public boolean hasProgressBar() {
        return result.hasProgressBar();
      }
      public int getProgressBar() {
        return result.getProgressBar();
      }
      public Builder setProgressBar(int value) {
        result.hasProgressBar = true;
        result.progressBar_ = value;
        return this;
      }
      public Builder clearProgressBar() {
        result.hasProgressBar = false;
        result.progressBar_ = 0;
        return this;
      }
    }

    static {
      com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.getDescriptor();
    }

    static {
      com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.internalForceInit();
    }
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeMediaProgressBar_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeMediaProgressBar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"CarlifeMediaProgressBarProto.proto\022\032co" +
      "m.baidu.carlife.protobuf\".\n\027CarlifeMedia" +
      "ProgressBar\022\023\n\013progressBar\030\001 \002(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeMediaProgressBar_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeMediaProgressBar_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeMediaProgressBar_descriptor,
              new java.lang.String[] { "ProgressBar", },
              com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar.class,
              com.ebo.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBar.Builder.class);
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
