package observer;

public class Child implements Observer<Integer> {

    private final String name;

    public Child(String name) {
        this.name = name;
    }

    @Override
    public void onValueChanged(Integer newValue) {
        if(newValue > 25) System.out.println("Child " + name + " it is warm outside!");
        else System.out.println("Child " + name + " it is cold outside!");
    }
}
