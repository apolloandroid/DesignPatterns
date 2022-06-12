import device.Device;
import device.Radio;
import device.Tv;
import remote.AdvancedRemote;
import remote.BasicRemote;

public class Main {

    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new Tv());
    }

    private static void testDevice(Device device) {
        testDeviceInBasicMode(device);
        testDeviceInAdvancedMode(device);
    }

    private static void testDeviceInBasicMode(Device device) {
        System.out.println("Tests device with basic mode.");
        BasicRemote remote = new BasicRemote(device);
        remote.power();
        device.printStatus();
    }

    private static void testDeviceInAdvancedMode(Device device) {
        System.out.println("Tests device with advanced mode.");
        AdvancedRemote remote = new AdvancedRemote(device);
        remote.power();
        remote.mute();
        device.printStatus();
    }
}
