package remote;

import device.Device;

public class Remote {

    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void power() {
        System.out.println("Remote: power toggle");
        if (device.checkIsEnabled()) device.disable();
        else device.enable();
    }

    public void decreaseVolume() {
        System.out.println("Remote: volume down");
        device.setVolume(device.getVolume() - 10);
    }

    public void increaseVolume() {
        System.out.println("Remote: volume up");
        device.setVolume(device.getVolume() + 10);
    }

    public void decreaseChannel() {
        System.out.println("Remote: previous channel");
        device.setChannel(device.getChannel() - 1);
    }

    public void increaseChannel() {
        System.out.println("Remote: next channel");
        device.setChannel(device.getChannel() + 1);
    }
}
