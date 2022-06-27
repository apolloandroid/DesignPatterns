package context;

import strategy.PriceStrategy;

public class Context {

    private PriceStrategy priceStrategy;

    public Context(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public double getPrice(double price) {
        return priceStrategy.getPrice(price);
    }
}
