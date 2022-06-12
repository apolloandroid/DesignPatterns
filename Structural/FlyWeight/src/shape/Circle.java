package shape;

import context.DrawingContext;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(DrawingContext context) {
        System.out.println("Drawing circle " + this.hashCode());
    }
}
