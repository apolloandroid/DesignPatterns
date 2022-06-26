package flagdrawer;


public class PolandFlagDrawer extends StripedFlagDrawer {

    @Override
    protected void drawFirstStripe() {
        System.out.println("White color drawn");
    }

    @Override
    protected void drawSecondStripe() {
        System.out.println("Red color drawn");
    }

    @Override
    protected void drawThirdStripe() {
        System.out.println("There is no third stripe in " + getCountryName() + " flag");
    }

    @Override
    protected int getStripesCount() {
        return 2;
    }

    @Override
    protected String getCountryName() {
        return "Poland";
    }
}
