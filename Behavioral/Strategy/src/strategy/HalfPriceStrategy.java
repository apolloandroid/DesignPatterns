package strategy;

public class HalfPriceStrategy implements PriceStrategy {

    private final double DISCOUNT_VALUE = 0.5;

    @Override
    public double getPrice(double price) {
        return price * DISCOUNT_VALUE;
    }
}
