package main.java;

/**
 * Created with IntelliJ IDEA.
 * User: Alan Derrick
 * Date: 10/13/12
 * Time: 5:53 PM
 */
public class Stock {
    private String symbol;
    private String stockName;
    private String price;

    /**
     *
     * @param symbol This is the symbol on the stock exchange
     * @param name   This is the actual name of the company
     * @param price  This is the price of a share of the stock
     */
    public Stock(String symbol, String name, String price) {
        this.symbol = symbol;
        this.stockName = name;
        this.price = price;
    }

    // getter & setter methods
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getStockName(){
        return stockName;
    }
    public void setStockName(String name) {
        this.stockName = name;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}
