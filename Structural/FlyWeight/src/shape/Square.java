package shape;

import context.DrawingContext;

public class Square implements Shape {
    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public void draw(DrawingContext context) {
        System.out.println("Drawing square " + this.hashCode());
    }
}
