package flagdrawer;


public class RussianFlagDrawer extends StripedFlagDrawer {

    @Override
    protected void drawFirstStripe() {
        System.out.println("White color drawn");
    }

    @Override
    protected void drawSecondStripe() {
        System.out.println("Blue color drawn");
    }

    @Override
    protected void drawThirdStripe() {
        System.out.println("Red color drawn");
    }

    @Override
    protected int getStripesCount() {
        return 3;
    }

    @Override
    protected String getCountryName() {
        return "Russia";
    }
}
