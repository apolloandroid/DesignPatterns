package component;

public class Cpu {
    public void freeze() {
        System.out.println("CPU freeze");
    }

    public void jump(int position) {
        System.out.println("CPU jump on " + position);
    }

    public void execute() {
        System.out.println("CPU execute");
    }
}
