// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/admin/v1/operation.proto

package com.google.firestore.admin.v1;

/**
 *
 *
 * <pre>
 * Describes the progress of the operation.
 * Unit of work is generic and must be interpreted based on where [Progress][google.firestore.admin.v1.Progress]
 * is used.
 * </pre>
 *
 * Protobuf type {@code google.firestore.admin.v1.Progress}
 */
public final class Progress extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.firestore.admin.v1.Progress)
    ProgressOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Progress.newBuilder() to construct.
  private Progress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Progress() {
    estimatedWork_ = 0L;
    completedWork_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Progress(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              estimatedWork_ = input.readInt64();
              break;
            }
          case 16:
            {
              completedWork_ = input.readInt64();
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.firestore.admin.v1.OperationProto
        .internal_static_google_firestore_admin_v1_Progress_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.admin.v1.OperationProto
        .internal_static_google_firestore_admin_v1_Progress_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.admin.v1.Progress.class,
            com.google.firestore.admin.v1.Progress.Builder.class);
  }

  public static final int ESTIMATED_WORK_FIELD_NUMBER = 1;
  private long estimatedWork_;
  /**
   *
   *
   * <pre>
   * The amount of work estimated.
   * </pre>
   *
   * <code>int64 estimated_work = 1;</code>
   */
  public long getEstimatedWork() {
    return estimatedWork_;
  }

  public static final int COMPLETED_WORK_FIELD_NUMBER = 2;
  private long completedWork_;
  /**
   *
   *
   * <pre>
   * The amount of work completed.
   * </pre>
   *
   * <code>int64 completed_work = 2;</code>
   */
  public long getCompletedWork() {
    return completedWork_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (estimatedWork_ != 0L) {
      output.writeInt64(1, estimatedWork_);
    }
    if (completedWork_ != 0L) {
      output.writeInt64(2, completedWork_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (estimatedWork_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, estimatedWork_);
    }
    if (completedWork_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, completedWork_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.firestore.admin.v1.Progress)) {
      return super.equals(obj);
    }
    com.google.firestore.admin.v1.Progress other = (com.google.firestore.admin.v1.Progress) obj;

    boolean result = true;
    result = result && (getEstimatedWork() == other.getEstimatedWork());
    result = result && (getCompletedWork() == other.getCompletedWork());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ESTIMATED_WORK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getEstimatedWork());
    hash = (37 * hash) + COMPLETED_WORK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getCompletedWork());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.admin.v1.Progress parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.admin.v1.Progress parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.Progress parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.admin.v1.Progress parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.Progress parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.admin.v1.Progress parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.Progress parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.admin.v1.Progress parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.Progress parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.firestore.admin.v1.Progress parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.Progress parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.admin.v1.Progress parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.firestore.admin.v1.Progress prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Describes the progress of the operation.
   * Unit of work is generic and must be interpreted based on where [Progress][google.firestore.admin.v1.Progress]
   * is used.
   * </pre>
   *
   * Protobuf type {@code google.firestore.admin.v1.Progress}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.firestore.admin.v1.Progress)
      com.google.firestore.admin.v1.ProgressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.firestore.admin.v1.OperationProto
          .internal_static_google_firestore_admin_v1_Progress_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.admin.v1.OperationProto
          .internal_static_google_firestore_admin_v1_Progress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.admin.v1.Progress.class,
              com.google.firestore.admin.v1.Progress.Builder.class);
    }

    // Construct using com.google.firestore.admin.v1.Progress.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      estimatedWork_ = 0L;

      completedWork_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.firestore.admin.v1.OperationProto
          .internal_static_google_firestore_admin_v1_Progress_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.admin.v1.Progress getDefaultInstanceForType() {
      return com.google.firestore.admin.v1.Progress.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.admin.v1.Progress build() {
      com.google.firestore.admin.v1.Progress result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.admin.v1.Progress buildPartial() {
      com.google.firestore.admin.v1.Progress result =
          new com.google.firestore.admin.v1.Progress(this);
      result.estimatedWork_ = estimatedWork_;
      result.completedWork_ = completedWork_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.firestore.admin.v1.Progress) {
        return mergeFrom((com.google.firestore.admin.v1.Progress) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.admin.v1.Progress other) {
      if (other == com.google.firestore.admin.v1.Progress.getDefaultInstance()) return this;
      if (other.getEstimatedWork() != 0L) {
        setEstimatedWork(other.getEstimatedWork());
      }
      if (other.getCompletedWork() != 0L) {
        setCompletedWork(other.getCompletedWork());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.firestore.admin.v1.Progress parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.firestore.admin.v1.Progress) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long estimatedWork_;
    /**
     *
     *
     * <pre>
     * The amount of work estimated.
     * </pre>
     *
     * <code>int64 estimated_work = 1;</code>
     */
    public long getEstimatedWork() {
      return estimatedWork_;
    }
    /**
     *
     *
     * <pre>
     * The amount of work estimated.
     * </pre>
     *
     * <code>int64 estimated_work = 1;</code>
     */
    public Builder setEstimatedWork(long value) {

      estimatedWork_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The amount of work estimated.
     * </pre>
     *
     * <code>int64 estimated_work = 1;</code>
     */
    public Builder clearEstimatedWork() {

      estimatedWork_ = 0L;
      onChanged();
      return this;
    }

    private long completedWork_;
    /**
     *
     *
     * <pre>
     * The amount of work completed.
     * </pre>
     *
     * <code>int64 completed_work = 2;</code>
     */
    public long getCompletedWork() {
      return completedWork_;
    }
    /**
     *
     *
     * <pre>
     * The amount of work completed.
     * </pre>
     *
     * <code>int64 completed_work = 2;</code>
     */
    public Builder setCompletedWork(long value) {

      completedWork_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The amount of work completed.
     * </pre>
     *
     * <code>int64 completed_work = 2;</code>
     */
    public Builder clearCompletedWork() {

      completedWork_ = 0L;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.firestore.admin.v1.Progress)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.admin.v1.Progress)
  private static final com.google.firestore.admin.v1.Progress DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.firestore.admin.v1.Progress();
  }

  public static com.google.firestore.admin.v1.Progress getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Progress> PARSER =
      new com.google.protobuf.AbstractParser<Progress>() {
        @java.lang.Override
        public Progress parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Progress(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Progress> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Progress> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.admin.v1.Progress getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
