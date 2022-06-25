// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package com.example;

/**
 * Protobuf type {@code com.example.Book}
 */
public  final class Book extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.Book)
    BookOrBuilder {
  // Use Book.newBuilder() to construct.
  private Book(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Book() {
    bookId_ = 0;
    title_ = "";
    price_ = 0F;
    pages_ = 0;
    authorId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Book(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            bookId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            title_ = s;
            break;
          }
          case 29: {

            price_ = input.readFloat();
            break;
          }
          case 32: {

            pages_ = input.readInt32();
            break;
          }
          case 40: {

            authorId_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.Schema.internal_static_com_example_Book_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.Schema.internal_static_com_example_Book_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.Book.class, com.example.Book.Builder.class);
  }

  public static final int BOOK_ID_FIELD_NUMBER = 1;
  private int bookId_;
  /**
   * <code>int32 book_id = 1;</code>
   */
  public int getBookId() {
    return bookId_;
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 2;</code>
   */
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_FIELD_NUMBER = 3;
  private float price_;
  /**
   * <code>float price = 3;</code>
   */
  public float getPrice() {
    return price_;
  }

  public static final int PAGES_FIELD_NUMBER = 4;
  private int pages_;
  /**
   * <code>int32 pages = 4;</code>
   */
  public int getPages() {
    return pages_;
  }

  public static final int AUTHOR_ID_FIELD_NUMBER = 5;
  private int authorId_;
  /**
   * <code>int32 author_id = 5;</code>
   */
  public int getAuthorId() {
    return authorId_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (bookId_ != 0) {
      output.writeInt32(1, bookId_);
    }
    if (!getTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (price_ != 0F) {
      output.writeFloat(3, price_);
    }
    if (pages_ != 0) {
      output.writeInt32(4, pages_);
    }
    if (authorId_ != 0) {
      output.writeInt32(5, authorId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bookId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, bookId_);
    }
    if (!getTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (price_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, price_);
    }
    if (pages_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, pages_);
    }
    if (authorId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, authorId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.Book)) {
      return super.equals(obj);
    }
    com.example.Book other = (com.example.Book) obj;

    boolean result = true;
    result = result && (getBookId()
        == other.getBookId());
    result = result && getTitle()
        .equals(other.getTitle());
    result = result && (
        java.lang.Float.floatToIntBits(getPrice())
        == java.lang.Float.floatToIntBits(
            other.getPrice()));
    result = result && (getPages()
        == other.getPages());
    result = result && (getAuthorId()
        == other.getAuthorId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BOOK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBookId();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPrice());
    hash = (37 * hash) + PAGES_FIELD_NUMBER;
    hash = (53 * hash) + getPages();
    hash = (37 * hash) + AUTHOR_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAuthorId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.Book parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.Book parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.Book parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.Book parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.Book parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.Book parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.Book parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.Book parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.Book parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.Book parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.Book parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.Book parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.Book prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.Book}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.Book)
      com.example.BookOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.Schema.internal_static_com_example_Book_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.Schema.internal_static_com_example_Book_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.Book.class, com.example.Book.Builder.class);
    }

    // Construct using com.example.Book.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      bookId_ = 0;

      title_ = "";

      price_ = 0F;

      pages_ = 0;

      authorId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.Schema.internal_static_com_example_Book_descriptor;
    }

    public com.example.Book getDefaultInstanceForType() {
      return com.example.Book.getDefaultInstance();
    }

    public com.example.Book build() {
      com.example.Book result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.Book buildPartial() {
      com.example.Book result = new com.example.Book(this);
      result.bookId_ = bookId_;
      result.title_ = title_;
      result.price_ = price_;
      result.pages_ = pages_;
      result.authorId_ = authorId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.Book) {
        return mergeFrom((com.example.Book)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.Book other) {
      if (other == com.example.Book.getDefaultInstance()) return this;
      if (other.getBookId() != 0) {
        setBookId(other.getBookId());
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (other.getPrice() != 0F) {
        setPrice(other.getPrice());
      }
      if (other.getPages() != 0) {
        setPages(other.getPages());
      }
      if (other.getAuthorId() != 0) {
        setAuthorId(other.getAuthorId());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.Book parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.Book) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bookId_ ;
    /**
     * <code>int32 book_id = 1;</code>
     */
    public int getBookId() {
      return bookId_;
    }
    /**
     * <code>int32 book_id = 1;</code>
     */
    public Builder setBookId(int value) {
      
      bookId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 book_id = 1;</code>
     */
    public Builder clearBookId() {
      
      bookId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 2;</code>
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private float price_ ;
    /**
     * <code>float price = 3;</code>
     */
    public float getPrice() {
      return price_;
    }
    /**
     * <code>float price = 3;</code>
     */
    public Builder setPrice(float value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float price = 3;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0F;
      onChanged();
      return this;
    }

    private int pages_ ;
    /**
     * <code>int32 pages = 4;</code>
     */
    public int getPages() {
      return pages_;
    }
    /**
     * <code>int32 pages = 4;</code>
     */
    public Builder setPages(int value) {
      
      pages_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pages = 4;</code>
     */
    public Builder clearPages() {
      
      pages_ = 0;
      onChanged();
      return this;
    }

    private int authorId_ ;
    /**
     * <code>int32 author_id = 5;</code>
     */
    public int getAuthorId() {
      return authorId_;
    }
    /**
     * <code>int32 author_id = 5;</code>
     */
    public Builder setAuthorId(int value) {
      
      authorId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 author_id = 5;</code>
     */
    public Builder clearAuthorId() {
      
      authorId_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.example.Book)
  }

  // @@protoc_insertion_point(class_scope:com.example.Book)
  private static final com.example.Book DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.Book();
  }

  public static com.example.Book getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Book>
      PARSER = new com.google.protobuf.AbstractParser<Book>() {
    public Book parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Book(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Book> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Book> getParserForType() {
    return PARSER;
  }

  public com.example.Book getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

