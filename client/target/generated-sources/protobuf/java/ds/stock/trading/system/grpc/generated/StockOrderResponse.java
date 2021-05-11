// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TradingService.proto

package ds.stock.trading.system.grpc.generated;

/**
 * Protobuf type {@code ds.stock.trading.system.grpc.generated.StockOrderResponse}
 */
public final class StockOrderResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ds.stock.trading.system.grpc.generated.StockOrderResponse)
    StockOrderResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StockOrderResponse.newBuilder() to construct.
  private StockOrderResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StockOrderResponse() {
    stockId_ = "";
    stockSymbol_ = "";
    stockType_ = "";
    stockTraderId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StockOrderResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StockOrderResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            stockId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            stockSymbol_ = s;
            break;
          }
          case 24: {

            stockQuantity_ = input.readInt32();
            break;
          }
          case 33: {

            stockPrice_ = input.readDouble();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            stockType_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            stockTraderId_ = s;
            break;
          }
          case 56: {

            status_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ds.stock.trading.system.grpc.generated.TradingService.internal_static_ds_stock_trading_system_grpc_generated_StockOrderResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.stock.trading.system.grpc.generated.TradingService.internal_static_ds_stock_trading_system_grpc_generated_StockOrderResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.stock.trading.system.grpc.generated.StockOrderResponse.class, ds.stock.trading.system.grpc.generated.StockOrderResponse.Builder.class);
  }

  public static final int STOCKID_FIELD_NUMBER = 1;
  private volatile java.lang.Object stockId_;
  /**
   * <code>string stockId = 1;</code>
   * @return The stockId.
   */
  @java.lang.Override
  public java.lang.String getStockId() {
    java.lang.Object ref = stockId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stockId_ = s;
      return s;
    }
  }
  /**
   * <code>string stockId = 1;</code>
   * @return The bytes for stockId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStockIdBytes() {
    java.lang.Object ref = stockId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stockId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STOCKSYMBOL_FIELD_NUMBER = 2;
  private volatile java.lang.Object stockSymbol_;
  /**
   * <code>string stockSymbol = 2;</code>
   * @return The stockSymbol.
   */
  @java.lang.Override
  public java.lang.String getStockSymbol() {
    java.lang.Object ref = stockSymbol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stockSymbol_ = s;
      return s;
    }
  }
  /**
   * <code>string stockSymbol = 2;</code>
   * @return The bytes for stockSymbol.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStockSymbolBytes() {
    java.lang.Object ref = stockSymbol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stockSymbol_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STOCKQUANTITY_FIELD_NUMBER = 3;
  private int stockQuantity_;
  /**
   * <code>int32 stockQuantity = 3;</code>
   * @return The stockQuantity.
   */
  @java.lang.Override
  public int getStockQuantity() {
    return stockQuantity_;
  }

  public static final int STOCKPRICE_FIELD_NUMBER = 4;
  private double stockPrice_;
  /**
   * <code>double stockPrice = 4;</code>
   * @return The stockPrice.
   */
  @java.lang.Override
  public double getStockPrice() {
    return stockPrice_;
  }

  public static final int STOCKTYPE_FIELD_NUMBER = 5;
  private volatile java.lang.Object stockType_;
  /**
   * <code>string stockType = 5;</code>
   * @return The stockType.
   */
  @java.lang.Override
  public java.lang.String getStockType() {
    java.lang.Object ref = stockType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stockType_ = s;
      return s;
    }
  }
  /**
   * <code>string stockType = 5;</code>
   * @return The bytes for stockType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStockTypeBytes() {
    java.lang.Object ref = stockType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stockType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STOCKTRADERID_FIELD_NUMBER = 6;
  private volatile java.lang.Object stockTraderId_;
  /**
   * <code>string stockTraderId = 6;</code>
   * @return The stockTraderId.
   */
  @java.lang.Override
  public java.lang.String getStockTraderId() {
    java.lang.Object ref = stockTraderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stockTraderId_ = s;
      return s;
    }
  }
  /**
   * <code>string stockTraderId = 6;</code>
   * @return The bytes for stockTraderId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStockTraderIdBytes() {
    java.lang.Object ref = stockTraderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stockTraderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 7;
  private boolean status_;
  /**
   * <code>bool status = 7;</code>
   * @return The status.
   */
  @java.lang.Override
  public boolean getStatus() {
    return status_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getStockIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stockId_);
    }
    if (!getStockSymbolBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stockSymbol_);
    }
    if (stockQuantity_ != 0) {
      output.writeInt32(3, stockQuantity_);
    }
    if (stockPrice_ != 0D) {
      output.writeDouble(4, stockPrice_);
    }
    if (!getStockTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, stockType_);
    }
    if (!getStockTraderIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, stockTraderId_);
    }
    if (status_ != false) {
      output.writeBool(7, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getStockIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, stockId_);
    }
    if (!getStockSymbolBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stockSymbol_);
    }
    if (stockQuantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, stockQuantity_);
    }
    if (stockPrice_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, stockPrice_);
    }
    if (!getStockTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, stockType_);
    }
    if (!getStockTraderIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, stockTraderId_);
    }
    if (status_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, status_);
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
    if (!(obj instanceof ds.stock.trading.system.grpc.generated.StockOrderResponse)) {
      return super.equals(obj);
    }
    ds.stock.trading.system.grpc.generated.StockOrderResponse other = (ds.stock.trading.system.grpc.generated.StockOrderResponse) obj;

    if (!getStockId()
        .equals(other.getStockId())) return false;
    if (!getStockSymbol()
        .equals(other.getStockSymbol())) return false;
    if (getStockQuantity()
        != other.getStockQuantity()) return false;
    if (java.lang.Double.doubleToLongBits(getStockPrice())
        != java.lang.Double.doubleToLongBits(
            other.getStockPrice())) return false;
    if (!getStockType()
        .equals(other.getStockType())) return false;
    if (!getStockTraderId()
        .equals(other.getStockTraderId())) return false;
    if (getStatus()
        != other.getStatus()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STOCKID_FIELD_NUMBER;
    hash = (53 * hash) + getStockId().hashCode();
    hash = (37 * hash) + STOCKSYMBOL_FIELD_NUMBER;
    hash = (53 * hash) + getStockSymbol().hashCode();
    hash = (37 * hash) + STOCKQUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getStockQuantity();
    hash = (37 * hash) + STOCKPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getStockPrice()));
    hash = (37 * hash) + STOCKTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getStockType().hashCode();
    hash = (37 * hash) + STOCKTRADERID_FIELD_NUMBER;
    hash = (53 * hash) + getStockTraderId().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getStatus());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.stock.trading.system.grpc.generated.StockOrderResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.stock.trading.system.grpc.generated.StockOrderResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.stock.trading.system.grpc.generated.StockOrderResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.stock.trading.system.grpc.generated.StockOrderResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.stock.trading.system.grpc.generated.StockOrderResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.stock.trading.system.grpc.generated.StockOrderResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.stock.trading.system.grpc.generated.StockOrderResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.stock.trading.system.grpc.generated.StockOrderResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.stock.trading.system.grpc.generated.StockOrderResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.stock.trading.system.grpc.generated.StockOrderResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.stock.trading.system.grpc.generated.StockOrderResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.stock.trading.system.grpc.generated.StockOrderResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ds.stock.trading.system.grpc.generated.StockOrderResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code ds.stock.trading.system.grpc.generated.StockOrderResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ds.stock.trading.system.grpc.generated.StockOrderResponse)
      ds.stock.trading.system.grpc.generated.StockOrderResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.stock.trading.system.grpc.generated.TradingService.internal_static_ds_stock_trading_system_grpc_generated_StockOrderResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.stock.trading.system.grpc.generated.TradingService.internal_static_ds_stock_trading_system_grpc_generated_StockOrderResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.stock.trading.system.grpc.generated.StockOrderResponse.class, ds.stock.trading.system.grpc.generated.StockOrderResponse.Builder.class);
    }

    // Construct using ds.stock.trading.system.grpc.generated.StockOrderResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      stockId_ = "";

      stockSymbol_ = "";

      stockQuantity_ = 0;

      stockPrice_ = 0D;

      stockType_ = "";

      stockTraderId_ = "";

      status_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.stock.trading.system.grpc.generated.TradingService.internal_static_ds_stock_trading_system_grpc_generated_StockOrderResponse_descriptor;
    }

    @java.lang.Override
    public ds.stock.trading.system.grpc.generated.StockOrderResponse getDefaultInstanceForType() {
      return ds.stock.trading.system.grpc.generated.StockOrderResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ds.stock.trading.system.grpc.generated.StockOrderResponse build() {
      ds.stock.trading.system.grpc.generated.StockOrderResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.stock.trading.system.grpc.generated.StockOrderResponse buildPartial() {
      ds.stock.trading.system.grpc.generated.StockOrderResponse result = new ds.stock.trading.system.grpc.generated.StockOrderResponse(this);
      result.stockId_ = stockId_;
      result.stockSymbol_ = stockSymbol_;
      result.stockQuantity_ = stockQuantity_;
      result.stockPrice_ = stockPrice_;
      result.stockType_ = stockType_;
      result.stockTraderId_ = stockTraderId_;
      result.status_ = status_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ds.stock.trading.system.grpc.generated.StockOrderResponse) {
        return mergeFrom((ds.stock.trading.system.grpc.generated.StockOrderResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.stock.trading.system.grpc.generated.StockOrderResponse other) {
      if (other == ds.stock.trading.system.grpc.generated.StockOrderResponse.getDefaultInstance()) return this;
      if (!other.getStockId().isEmpty()) {
        stockId_ = other.stockId_;
        onChanged();
      }
      if (!other.getStockSymbol().isEmpty()) {
        stockSymbol_ = other.stockSymbol_;
        onChanged();
      }
      if (other.getStockQuantity() != 0) {
        setStockQuantity(other.getStockQuantity());
      }
      if (other.getStockPrice() != 0D) {
        setStockPrice(other.getStockPrice());
      }
      if (!other.getStockType().isEmpty()) {
        stockType_ = other.stockType_;
        onChanged();
      }
      if (!other.getStockTraderId().isEmpty()) {
        stockTraderId_ = other.stockTraderId_;
        onChanged();
      }
      if (other.getStatus() != false) {
        setStatus(other.getStatus());
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
      ds.stock.trading.system.grpc.generated.StockOrderResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.stock.trading.system.grpc.generated.StockOrderResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object stockId_ = "";
    /**
     * <code>string stockId = 1;</code>
     * @return The stockId.
     */
    public java.lang.String getStockId() {
      java.lang.Object ref = stockId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stockId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string stockId = 1;</code>
     * @return The bytes for stockId.
     */
    public com.google.protobuf.ByteString
        getStockIdBytes() {
      java.lang.Object ref = stockId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stockId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string stockId = 1;</code>
     * @param value The stockId to set.
     * @return This builder for chaining.
     */
    public Builder setStockId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stockId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string stockId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStockId() {
      
      stockId_ = getDefaultInstance().getStockId();
      onChanged();
      return this;
    }
    /**
     * <code>string stockId = 1;</code>
     * @param value The bytes for stockId to set.
     * @return This builder for chaining.
     */
    public Builder setStockIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stockId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object stockSymbol_ = "";
    /**
     * <code>string stockSymbol = 2;</code>
     * @return The stockSymbol.
     */
    public java.lang.String getStockSymbol() {
      java.lang.Object ref = stockSymbol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stockSymbol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string stockSymbol = 2;</code>
     * @return The bytes for stockSymbol.
     */
    public com.google.protobuf.ByteString
        getStockSymbolBytes() {
      java.lang.Object ref = stockSymbol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stockSymbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string stockSymbol = 2;</code>
     * @param value The stockSymbol to set.
     * @return This builder for chaining.
     */
    public Builder setStockSymbol(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stockSymbol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string stockSymbol = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStockSymbol() {
      
      stockSymbol_ = getDefaultInstance().getStockSymbol();
      onChanged();
      return this;
    }
    /**
     * <code>string stockSymbol = 2;</code>
     * @param value The bytes for stockSymbol to set.
     * @return This builder for chaining.
     */
    public Builder setStockSymbolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stockSymbol_ = value;
      onChanged();
      return this;
    }

    private int stockQuantity_ ;
    /**
     * <code>int32 stockQuantity = 3;</code>
     * @return The stockQuantity.
     */
    @java.lang.Override
    public int getStockQuantity() {
      return stockQuantity_;
    }
    /**
     * <code>int32 stockQuantity = 3;</code>
     * @param value The stockQuantity to set.
     * @return This builder for chaining.
     */
    public Builder setStockQuantity(int value) {
      
      stockQuantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 stockQuantity = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStockQuantity() {
      
      stockQuantity_ = 0;
      onChanged();
      return this;
    }

    private double stockPrice_ ;
    /**
     * <code>double stockPrice = 4;</code>
     * @return The stockPrice.
     */
    @java.lang.Override
    public double getStockPrice() {
      return stockPrice_;
    }
    /**
     * <code>double stockPrice = 4;</code>
     * @param value The stockPrice to set.
     * @return This builder for chaining.
     */
    public Builder setStockPrice(double value) {
      
      stockPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double stockPrice = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStockPrice() {
      
      stockPrice_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object stockType_ = "";
    /**
     * <code>string stockType = 5;</code>
     * @return The stockType.
     */
    public java.lang.String getStockType() {
      java.lang.Object ref = stockType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stockType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string stockType = 5;</code>
     * @return The bytes for stockType.
     */
    public com.google.protobuf.ByteString
        getStockTypeBytes() {
      java.lang.Object ref = stockType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stockType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string stockType = 5;</code>
     * @param value The stockType to set.
     * @return This builder for chaining.
     */
    public Builder setStockType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stockType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string stockType = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearStockType() {
      
      stockType_ = getDefaultInstance().getStockType();
      onChanged();
      return this;
    }
    /**
     * <code>string stockType = 5;</code>
     * @param value The bytes for stockType to set.
     * @return This builder for chaining.
     */
    public Builder setStockTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stockType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object stockTraderId_ = "";
    /**
     * <code>string stockTraderId = 6;</code>
     * @return The stockTraderId.
     */
    public java.lang.String getStockTraderId() {
      java.lang.Object ref = stockTraderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stockTraderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string stockTraderId = 6;</code>
     * @return The bytes for stockTraderId.
     */
    public com.google.protobuf.ByteString
        getStockTraderIdBytes() {
      java.lang.Object ref = stockTraderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stockTraderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string stockTraderId = 6;</code>
     * @param value The stockTraderId to set.
     * @return This builder for chaining.
     */
    public Builder setStockTraderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stockTraderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string stockTraderId = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearStockTraderId() {
      
      stockTraderId_ = getDefaultInstance().getStockTraderId();
      onChanged();
      return this;
    }
    /**
     * <code>string stockTraderId = 6;</code>
     * @param value The bytes for stockTraderId to set.
     * @return This builder for chaining.
     */
    public Builder setStockTraderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stockTraderId_ = value;
      onChanged();
      return this;
    }

    private boolean status_ ;
    /**
     * <code>bool status = 7;</code>
     * @return The status.
     */
    @java.lang.Override
    public boolean getStatus() {
      return status_;
    }
    /**
     * <code>bool status = 7;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(boolean value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool status = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ds.stock.trading.system.grpc.generated.StockOrderResponse)
  }

  // @@protoc_insertion_point(class_scope:ds.stock.trading.system.grpc.generated.StockOrderResponse)
  private static final ds.stock.trading.system.grpc.generated.StockOrderResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.stock.trading.system.grpc.generated.StockOrderResponse();
  }

  public static ds.stock.trading.system.grpc.generated.StockOrderResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StockOrderResponse>
      PARSER = new com.google.protobuf.AbstractParser<StockOrderResponse>() {
    @java.lang.Override
    public StockOrderResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StockOrderResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StockOrderResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StockOrderResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.stock.trading.system.grpc.generated.StockOrderResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

