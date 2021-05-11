// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StockTradingServerService.proto

package ds.stock.trading.system.grpc.generated;

public interface StockOrderResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ds.stock.trading.system.grpc.generated.StockOrderResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string stockId = 1;</code>
   * @return The stockId.
   */
  java.lang.String getStockId();
  /**
   * <code>string stockId = 1;</code>
   * @return The bytes for stockId.
   */
  com.google.protobuf.ByteString
      getStockIdBytes();

  /**
   * <code>string stockSymbol = 2;</code>
   * @return The stockSymbol.
   */
  java.lang.String getStockSymbol();
  /**
   * <code>string stockSymbol = 2;</code>
   * @return The bytes for stockSymbol.
   */
  com.google.protobuf.ByteString
      getStockSymbolBytes();

  /**
   * <code>int32 stockQuantity = 3;</code>
   * @return The stockQuantity.
   */
  int getStockQuantity();

  /**
   * <code>double stockPrice = 4;</code>
   * @return The stockPrice.
   */
  double getStockPrice();

  /**
   * <code>string stockType = 5;</code>
   * @return The stockType.
   */
  java.lang.String getStockType();
  /**
   * <code>string stockType = 5;</code>
   * @return The bytes for stockType.
   */
  com.google.protobuf.ByteString
      getStockTypeBytes();

  /**
   * <code>string stockTraderId = 6;</code>
   * @return The stockTraderId.
   */
  java.lang.String getStockTraderId();
  /**
   * <code>string stockTraderId = 6;</code>
   * @return The bytes for stockTraderId.
   */
  com.google.protobuf.ByteString
      getStockTraderIdBytes();

  /**
   * <code>bool status = 7;</code>
   * @return The status.
   */
  boolean getStatus();
}
