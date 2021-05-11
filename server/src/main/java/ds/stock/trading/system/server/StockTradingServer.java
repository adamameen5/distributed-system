package ds.stock.trading.system.server;

import ds.stock.trading.system.helper.Stock;
import ds.stock.trading.system.synchronization.DistributedLock;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.apache.zookeeper.KeeperException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class StockTradingServer {

    private int serverPort;
    private DistributedLock leaderLock;
    private AtomicBoolean isLeader = new AtomicBoolean(false);
    private byte[] leaderData;
    private ArrayList<Stock> orderBook = new ArrayList<>();

    public StockTradingServer(String host, int port) throws InterruptedException, IOException, KeeperException {
        this.serverPort = port;
        leaderLock = new DistributedLock("StockTradingServerTestCluster", buildServerData(host, port));
    }

    public boolean isLeader() {
        return isLeader.get();
    }

    public static String buildServerData(String IP, int port) {
        StringBuilder builder = new StringBuilder();
        builder.append(IP).append(":").append(port);
        return builder.toString();
    }


    public void startServer() throws IOException, InterruptedException, KeeperException {
        Server server = ServerBuilder
                .forPort(serverPort)
                .addService(new StockOrderServiceImpl(this))
                .build();
        server.start();
        System.out.println("StockTradingServer Started and ready to accept requests on port " + serverPort);
        System.out.println("================================================================ ");

        tryToBeLeader();
        server.awaitTermination();
    }


    class LeaderCampaignThread implements Runnable {
        private byte[] currentLeaderData = null;

        @Override
        public void run() {

            System.out.println("\nStarting the leader Campaign");
            System.out.println("---------------------------");
            try {
                boolean leader = leaderLock.tryAcquireLock();
                while (!leader) {
                    byte[] leaderData =
                            leaderLock.getLockHolderData();
                    if (currentLeaderData != leaderData) {
                        currentLeaderData = leaderData;
                        setCurrentLeaderData(currentLeaderData);
                    }
                    Thread.sleep(10000);
                    leader = leaderLock.tryAcquireLock();
                }
                System.out.println("I got the leader lock. Now acting as primary");
                isLeader.set(true);
                currentLeaderData = null;
            } catch (Exception e) {
            }
        }
    }


    private synchronized void setCurrentLeaderData(byte[] leaderData) {
        this.leaderData = leaderData;
    }


    private void tryToBeLeader() throws KeeperException, InterruptedException {
        Thread leaderCampaignThread = new Thread(new LeaderCampaignThread());
        leaderCampaignThread.start();
    }


    public void executeOrder(String stockId, String stockSymbol, int stockQuantity, double stockPrice, String stockType, String stockTraderId) {

        Stock stock = new Stock(stockId,stockSymbol,stockQuantity,stockPrice,stockType,stockTraderId);

        if (stockType.equals("sell")) {
            performSellOrderTransaction(stock);
        } else {
            performBuyOrderTransaction(stock);
        }
    }


    public void performSellOrderTransaction(Stock stock) {
        System.out.println("Checking for any available stocks for sale");
        System.out.println("- - - - - - - - - - - - -");
        orderBook.add(stock);
        boolean transactionPerformed = false;

        //will iterate through each item in the array to see
        // if there are any stocks available with the same price and quantity
        for (Stock orderItem: this.orderBook) {
            if (orderItem.getStockType().equals("buy")) { // check if there is a stock ready to be sold
                // check for only sell orders
                if (orderItem.getStockPrice() == stock.getStockPrice()
                        && orderItem.getStockQuantity() == stock.getStockQuantity()
                        && !orderItem.getStockTraderId().equals(stock.getStockTraderId())) {

                    System.out.println("Match Found - Stock ID:" + orderItem.getStockId());
                    System.out.println("----------------- ");
                    System.out.println("Seller details: Trader ID-" + stock.getStockTraderId());
                    System.out.println("Buyer details: Trader ID-" + orderItem.getStockTraderId());

                    orderBook.remove(orderItem);
                    transactionPerformed = true;
                    System.out.println("Stock sold! Transaction completed.");
                    System.out.println("- - - - - - - - - - - - -");
                    break;
                }
            }
        }

        if (!transactionPerformed) {
            System.out.println("Sorry!\nCurrently there are no buyers to buy the stock.");
            System.out.println("================================================================ ");
        }
    }


    private void performBuyOrderTransaction(Stock stock) {
        System.out.println("Performing buy order request. We are checking for available stocks....");
        orderBook.add(stock);

        boolean transactionPerformed = false;

        for (Stock orderItem: this.orderBook) {
            if (orderItem.getStockType().equals("sell")) { // check if someone is ready to sell

//                System.out.println("== sell order ==");

                // check for only buy orders
                if (orderItem.getStockPrice() == stock.getStockPrice()
                        && orderItem.getStockQuantity() == stock.getStockQuantity()
                        && !orderItem.getStockTraderId().equals(stock.getStockTraderId())) {
                    System.out.println("----------------- ");
                    System.out.println("<< Match Found - Stock ID:" + orderItem.getStockId() + " >>");
                    System.out.println("Buyer details : Trader ID-" + stock.getStockTraderId());
                    System.out.println("Seller details: Trader ID-" + orderItem.getStockTraderId());
                    System.out.println("Stock Details: Stock ID-" + orderItem.getStockId() + " | Stock Quantity-" +orderItem.getStockQuantity() + " | Stock Price-" +orderItem.getStockPrice());
                    System.out.println("Stock bought! Transaction completed.");
                    System.out.println("- - - - - - - - - - - - -");

                    orderBook.remove(orderItem);
                    transactionPerformed = true;
                    break;
                }
            }
        }

        if (!transactionPerformed) {
            System.out.println("Sorry!\nCurrently there are no matching stocks to buy");
            System.out.println("================================================================ ");
        }
    }


    public List<String[]> getOthersData() throws KeeperException, InterruptedException {
        List<String[]> result = new ArrayList<>();
        List<byte[]> othersData = leaderLock.getOthersData();
        for (byte[] data : othersData) {
            String[] dataStrings = new
                    String(data).split(":");
            result.add(dataStrings);
        }
        return result;
    }


    public synchronized String[] getCurrentLeaderData() {
        return new String(leaderData).split(":");
    }


    public static void main(String[] args) throws Exception {
        DistributedLock.setZooKeeperURL("localhost:2181");

        if (args.length != 1) {
            System.out.println("Usage executable-name <port>");
        }

        int serverPort = Integer.parseInt(args[0]);

        StockTradingServer server = new StockTradingServer("localhost", serverPort);
        server.startServer();
    }

}
