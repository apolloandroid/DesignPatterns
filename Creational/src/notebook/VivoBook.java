package notebook;

public class VivoBook implements Notebook {
    @Override
    public void turnOn() {
        System.out.println("VivoBook in on");
    }

    @Override
    public void turnOff() {
        System.out.println("VivoBook in off");
    }
}
