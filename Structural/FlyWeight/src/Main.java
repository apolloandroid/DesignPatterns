import context.DrawingContext;
import shape.Picture;
import shape.Shape;
import shape.ShapeFactory;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = getShapes();
        Picture picture = ShapeFactory.createPicture(shapes);
        DrawingContext context = new DrawingContext(10, 20, "Blue");
        picture.draw(context);
    }

    private static List<Shape> getShapes() {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(ShapeFactory.createPoint());
        shapes.add(ShapeFactory.createCircle(10));
        shapes.add(ShapeFactory.createSquare(20));
        shapes.add(ShapeFactory.createCircle(20));
        shapes.add(ShapeFactory.createCircle(20));
        shapes.add(ShapeFactory.createPoint());
        shapes.add(ShapeFactory.createSquare(40));
        return shapes;
    }
}
