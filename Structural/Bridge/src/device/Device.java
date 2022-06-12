package device;

public abstract class Device {
    protected boolean isEnabled = false;
    protected int volume = 30;
    protected int channel = 1;

    public boolean checkIsEnabled() {
        return isEnabled;
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else {
            this.volume = Math.max(volume, 0);
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public abstract void printStatus();
}
