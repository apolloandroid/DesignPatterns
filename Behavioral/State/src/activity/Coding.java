package activity;

public class Coding implements Activity {

    private static Coding instance = null;

    public static Coding getInstance() {
        if (instance == null) instance = new Coding();
        return instance;
    }

    @Override
    public void act() {
        System.out.println("I am coding");
    }
}
