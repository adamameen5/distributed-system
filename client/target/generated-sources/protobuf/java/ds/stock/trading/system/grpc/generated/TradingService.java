// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TradingService.proto

package ds.stock.trading.system.grpc.generated;

public final class TradingService {
  private TradingService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_stock_trading_system_grpc_generated_StockOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_stock_trading_system_grpc_generated_StockOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_stock_trading_system_grpc_generated_StockOrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_stock_trading_system_grpc_generated_StockOrderResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024TradingService.proto\022&ds.stock.trading" +
      ".system.grpc.generated\"\247\001\n\021StockOrderReq" +
      "uest\022\017\n\007stockId\030\001 \001(\t\022\023\n\013stockSymbol\030\002 \001" +
      "(\t\022\025\n\rstockQuantity\030\003 \001(\005\022\022\n\nstockPrice\030" +
      "\004 \001(\001\022\027\n\017isSentByPrimary\030\005 \001(\010\022\021\n\tstockT" +
      "ype\030\006 \001(\t\022\025\n\rstockTraderId\030\007 \001(\t\"\237\001\n\022Sto" +
      "ckOrderResponse\022\017\n\007stockId\030\001 \001(\t\022\023\n\013stoc" +
      "kSymbol\030\002 \001(\t\022\025\n\rstockQuantity\030\003 \001(\005\022\022\n\n" +
      "stockPrice\030\004 \001(\001\022\021\n\tstockType\030\005 \001(\t\022\025\n\rs" +
      "tockTraderId\030\006 \001(\t\022\016\n\006status\030\007 \001(\0102\231\001\n\021S" +
      "tockOrderService\022\203\001\n\nstockOrder\0229.ds.sto" +
      "ck.trading.system.grpc.generated.StockOr" +
      "derRequest\032:.ds.stock.trading.system.grp" +
      "c.generated.StockOrderResponseB\002P\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ds_stock_trading_system_grpc_generated_StockOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ds_stock_trading_system_grpc_generated_StockOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_stock_trading_system_grpc_generated_StockOrderRequest_descriptor,
        new java.lang.String[] { "StockId", "StockSymbol", "StockQuantity", "StockPrice", "IsSentByPrimary", "StockType", "StockTraderId", });
    internal_static_ds_stock_trading_system_grpc_generated_StockOrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ds_stock_trading_system_grpc_generated_StockOrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_stock_trading_system_grpc_generated_StockOrderResponse_descriptor,
        new java.lang.String[] { "StockId", "StockSymbol", "StockQuantity", "StockPrice", "StockType", "StockTraderId", "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}