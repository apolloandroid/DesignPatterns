package widget;

public class TextField implements Widget {
    private int width, height;

    public TextField(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("TextField: " + width + ", " + height);
    }
}
