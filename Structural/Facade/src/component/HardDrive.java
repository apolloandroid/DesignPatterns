package component;

public class HardDrive {
    public byte[] read(int size) {
        System.out.println("component.HardDrive reading " + size + " bytes");
        return new byte[size];
    }
}
