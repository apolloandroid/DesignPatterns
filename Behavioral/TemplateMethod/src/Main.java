import flagdrawer.PolandFlagDrawer;
import flagdrawer.RussianFlagDrawer;
import flagdrawer.StripedFlagDrawer;

public class Main {

    public static void main(String[] args) {
        StripedFlagDrawer russianFlagDrawer = new RussianFlagDrawer();
        StripedFlagDrawer polandFlagDrawer = new PolandFlagDrawer();

        drawFlag(russianFlagDrawer);
        drawFlag(polandFlagDrawer);
    }

    private static void drawFlag(StripedFlagDrawer drawer) {
        drawer.drawFlag();
    }
}
