import component.Cpu;
import component.HardDrive;
import component.Memory;

public class Computer {

    private static volatile Computer instance;
    private int bootAddress = 3;
    private int sectorSize = 4;

    private Cpu cpu = new Cpu();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();

    private Computer() {

    }

    public static Computer getInstance() {
        if (instance != null) return instance;
        synchronized (Computer.class) {
            if (instance == null) instance = new Computer();
            return instance;
        }
    }

    void start() {
        cpu.freeze();
        memory.load(bootAddress, hardDrive.read(sectorSize));
        cpu.jump(bootAddress);
        cpu.execute();
    }
}
