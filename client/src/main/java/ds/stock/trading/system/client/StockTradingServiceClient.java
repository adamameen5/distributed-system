package ds.stock.trading.system.client;

import ds.stock.trading.system.grpc.generated.StockOrderRequest;
import ds.stock.trading.system.grpc.generated.StockOrderResponse;
import ds.stock.trading.system.grpc.generated.StockOrderServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class StockTradingServiceClient {

    private ManagedChannel channel = null;
    StockOrderServiceGrpc.StockOrderServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public StockTradingServiceClient (String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initializeConnection () {
        System.out.println("Initializing Connecting to server at " + host + ":" + port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = StockOrderServiceGrpc.newBlockingStub(channel);
    }
    public void closeConnection() {
        channel.shutdown();
    }

    public void processUserRequests() throws InterruptedException {
        while (true) {
            Scanner userInput = new Scanner(System.in);

            System.out.println("\nEnter StockId, StockQuantity,StockPrice,StockType, StockTraderId :");
            String input[] = userInput.nextLine().trim().split(",");

            String stockId = input[0];
            String stockSymbol = "stock";
            int stockQuantity= Integer.parseInt(input[1]);
            double stockPrice= Double.parseDouble(input[2]);
            String stockType= input[3];
            String stockTraderId= input[4];

            System.out.println("Requesting server perform stock order");
            StockOrderRequest request = StockOrderRequest
                    .newBuilder()
                    .setStockId(stockId)
                    .setStockSymbol(stockSymbol)
                    .setStockQuantity(stockQuantity)
                    .setStockPrice(stockPrice)
                    .setStockType(stockType)
                    .setStockTraderId(stockTraderId)
                    .build();

            StockOrderResponse response = clientStub.stockOrder(request);
            System.out.printf("Trade order processed for " + response.getStockTraderId() + " request");
            Thread.sleep(1000);
        }
    }
}
