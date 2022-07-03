package observer;

public class OldMan implements Observer<Integer> {

    private final String name;

    public OldMan(String name) {
        this.name = name;
    }

    @Override
    public void onValueChanged(Integer newValue) {
        if (newValue > 25) System.out.println("Old man " + name + " it is warm outside!");
        else System.out.println("Old man " + name + " it is cold outside!");

    }
}
