package ds.stock.trading.system.helper;

public class Stock {
    private String stockId;
    private String stockSymbol;
    private int stockQuantity;
    private double stockPrice;
    private String stockType;
    private String stockTraderId;


    public Stock(String stockId,String stockSymbol,int stockQuantity, double stockPrice, String stockType, String stockTraderId ) {
        this.stockId = stockId;
        this.stockPrice = stockPrice;
        this.stockQuantity = stockQuantity;
        this.stockSymbol = stockSymbol;
        this.stockType = stockType;
        this.stockTraderId = stockTraderId;
    }

    //Getters and setters for Stock
    public void setStockTraderId(String stockTraderId) {
        this.stockTraderId = stockTraderId;
    }
    public void setStockId (String stockId) {
        this.stockId = stockId;
    }
    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }
    public void setStockType(String stockType) {
        this.stockType = stockType;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getStockTraderId() {
        return this.stockTraderId;
    }
    public String getStockId () {
        return this.stockId;
    }
    public double getStockPrice() {
        return this.stockPrice;
    }
    public String getStockType() {
        return this.stockType;
    }
    public int getStockQuantity() {
        return this.stockQuantity;
    }
}
