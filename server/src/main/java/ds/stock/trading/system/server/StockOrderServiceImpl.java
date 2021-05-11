package ds.stock.trading.system.server;

import ds.stock.trading.system.grpc.generated.StockOrderRequest;
import ds.stock.trading.system.grpc.generated.StockOrderResponse;
import ds.stock.trading.system.grpc.generated.StockOrderServiceGrpc;
import ds.stock.trading.system.helper.Stock;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.apache.zookeeper.KeeperException;

import java.util.List;
import java.util.Locale;

public class StockOrderServiceImpl extends StockOrderServiceGrpc.StockOrderServiceImplBase {

    private ManagedChannel channel = null;
    StockOrderServiceGrpc.StockOrderServiceBlockingStub clientStub = null;
    private StockTradingServer server;


    public StockOrderServiceImpl(StockTradingServer server) {
        this.server = server;
    }


    @Override
    public void stockOrder(StockOrderRequest request, StreamObserver<StockOrderResponse> responseObserver) {

        String stockId = request.getStockId();
        String stockSymbol = "Stock";
        int stockQuantity = request.getStockQuantity();
        double stockPrice = request.getStockPrice();
        String stockType = request.getStockType();
        String stockTraderId = request.getStockTraderId();
        boolean status = false;

        if (server.isLeader()) {
            // Act as primary
            try {
                System.out.println("Accessing the Services as Primary");
                processLogic(stockId,stockSymbol,stockQuantity,stockPrice,stockType,stockTraderId);
                updateSecondaryServers(stockId,stockSymbol,stockQuantity,stockPrice,stockType,stockTraderId);
                status = true;
            } catch (Exception e) {
                System.out.println("Error while updating the order book" + e.getMessage());
                e.printStackTrace();
            }
        } else {
            // Act As Secondary
            if (request.getIsSentByPrimary()) {
                System.out.println("Accessing the Services as Secondary, on Primary's command");
                processLogic(stockId,stockSymbol,stockQuantity,stockPrice,stockType,stockTraderId);
            } else {
                StockOrderResponse response = callPrimary(stockId,stockSymbol,stockQuantity,stockPrice,stockType,stockTraderId);
                if (response.getStatus()) {
                    status = true;
                }
            }
        }
        StockOrderResponse response = StockOrderResponse
                .newBuilder()
                .setStatus(status)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    private void processLogic(String stockId, String stockSymbol, int stockQuantity, double stockPrice, String stockType, String stockTraderId) {
        System.out.println("---NEW " +stockType.toUpperCase() + " ORDER REQUEST CREATED---");
        System.out.println("Trader ID: " + stockTraderId + " placed a " + stockType + " order.");
        server.executeOrder(stockId,stockSymbol, stockQuantity, stockPrice, stockType, stockTraderId);

    }


    private StockOrderResponse callServer(String stockId, String stockSymbol, int stockQuantity, double stockPrice, String stockType, String stockTraderId, boolean isSentByPrimary, String IPAddress, int port) {
        System.out.println("-Calling Server " + IPAddress + ":" + port);
        channel = ManagedChannelBuilder.forAddress(IPAddress, port)
                .usePlaintext()
                .build();

        clientStub = StockOrderServiceGrpc.newBlockingStub(channel);
        StockOrderRequest request = StockOrderRequest.newBuilder()
                .setStockId(stockId)
                .setStockPrice(stockPrice)
                .setStockSymbol(stockSymbol)
                .setStockQuantity(stockQuantity)
                .setStockType(stockType)
                .setStockTraderId(stockTraderId)
                .setIsSentByPrimary(isSentByPrimary)
                .build();
        StockOrderResponse response = clientStub.stockOrder(request);
        return response;
    }


    private StockOrderResponse callPrimary(String stockId, String stockSymbol, int stockQuantity, double stockPrice, String stockType, String stockTraderId) {
        System.out.println("Calling Primary server");
        String[] currentLeaderData = server.getCurrentLeaderData();
        String IPAddress = currentLeaderData[0];
        int port = Integer.parseInt(currentLeaderData[1]);
        return callServer(stockId, stockSymbol, stockQuantity, stockPrice, stockType, stockTraderId, false, IPAddress, port);
    }


    private void updateSecondaryServers(String stockId, String stockSymbol, int stockQuantity, double stockPrice, String stockType, String stockTraderId) throws KeeperException, InterruptedException {
        System.out.println("Updating secondary servers");
        List<String[]> othersData = server.getOthersData();

        for (String[] data : othersData) {
            String IPAddress = data[0];
            int port = Integer.parseInt(data[1]);
            callServer(stockId,stockSymbol,stockQuantity,stockPrice,stockType,stockTraderId,true, IPAddress, port);
        }
    }

}
