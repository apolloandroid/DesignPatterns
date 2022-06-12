package shape;

import context.DrawingContext;

public class Point implements Shape {

    @Override
    public void draw(DrawingContext context) {
        System.out.println("Drawing point " + this.hashCode());
    }
}
