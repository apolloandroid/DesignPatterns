import context.Context;
import strategy.HalfPriceStrategy;

public class Main {

    public static void main(String[] args) {
        double startPrice = 1000;
        Context context = new Context(new HalfPriceStrategy());
        double finalPrice = context.getPrice(startPrice);
        System.out.println(finalPrice);
    }
}
