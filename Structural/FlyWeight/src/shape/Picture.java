package shape;

import context.DrawingContext;

import java.util.List;

public class Picture implements Shape {
    private List<Shape> children;

    public Picture(List<Shape> shapes) {
        this.children = shapes;
    }

    @Override
    public void draw(DrawingContext context) {
        System.out.println("Drawing picture");
        for (Shape child : children) {
            child.draw(context);
        }
    }
}
