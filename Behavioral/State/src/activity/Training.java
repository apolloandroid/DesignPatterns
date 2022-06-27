package activity;

public class Training implements Activity {
    private static Training instance = null;

    private Training() {

    }

    public static Training getInstance() {
        if (instance == null) instance = new Training();
        return instance;
    }

    @Override
    public void act() {
        System.out.println("I am training");
    }
}