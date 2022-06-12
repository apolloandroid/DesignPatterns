package device;

public class Radio extends Device {

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm radio.");
        System.out.println("| I'm " + (isEnabled ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume);
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
