package notebook;

public class MacBook implements Notebook {
    @Override
    public void turnOn() {
        System.out.println("MacBook in on");
    }

    @Override
    public void turnOff() {
        System.out.println("MacBook in off");
    }
}
