package observer;

public class Man implements Observer<Integer> {
    private final String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void onValueChanged(Integer newValue) {
        if(newValue > 20) System.out.println("Man " + name + " it is warm outside!");
        else System.out.println("Man " + name + " it is cold outside!");
    }
}
