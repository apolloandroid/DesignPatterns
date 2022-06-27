package strategy;

public class FullPriceStrategy implements PriceStrategy {

    @Override
    public double getPrice(double price) {
        return price;
    }
}
