package flagdrawer;


public abstract class StripedFlagDrawer {
    private static final int DEFAULT_STRIPES_COUNT = 2;

    public final void drawFlag() {
        startDrawing();
        drawFlagPole();
        drawFirstStripe();
        drawSecondStripe();
        if (getStripesCount() > DEFAULT_STRIPES_COUNT) {
            drawThirdStripe();
        }
        finishDrawing();
        System.out.println();
    }
    abstract void drawFirstStripe();
    abstract void drawSecondStripe();
    abstract void drawThirdStripe();
    abstract int getStripesCount();
    abstract String getCountryName();

    private void startDrawing() {
        System.out.println("Started drawing flag of " + getCountryName());
    }

    private void drawFlagPole() {
        System.out.println("Flagpole drawn");
    }

    private void finishDrawing() {
        System.out.println("Finished drawing flag of " + getCountryName());
    }
}
