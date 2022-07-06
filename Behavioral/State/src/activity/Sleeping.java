package activity;

public class Sleeping implements Activity {

    private static Sleeping instance = null;

    public static Sleeping getInstance() {
        if (instance == null) instance = new Sleeping();
        return instance;
    }

    @Override
    public void act() {
        System.out.println("I am sleeping");
    }
}
