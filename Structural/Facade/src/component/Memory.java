package component;

import java.util.Arrays;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("component.Memory loading " + Arrays.toString(data) + " from " + position + " position");
    }
}
