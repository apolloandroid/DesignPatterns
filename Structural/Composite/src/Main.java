public class Main {

    public static void main(String[] args) {
        Drawable line = new Line();
        line.draw();

        Drawable text = new Text();
        text.draw();

        Drawable rectangle = new Rectangle();
        rectangle.draw();

        Drawable picture1 = new Picture(line, text);
        picture1.draw();

        Drawable picture2 = new Picture(picture1, new Line(), new Text(), rectangle);
        picture2.draw();
    }
}
