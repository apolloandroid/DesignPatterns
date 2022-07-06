package activity;

public class Eating implements Activity {

    private static Eating instance = null;

    public static Eating getInstance() {
        if (instance == null) instance = new Eating();
        return instance;
    }

    @Override
    public void act() {
        System.out.println("I am eating");
    }
}