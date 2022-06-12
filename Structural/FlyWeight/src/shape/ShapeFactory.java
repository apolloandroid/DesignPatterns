package shape;

import java.util.HashMap;
import java.util.List;

public class ShapeFactory {
    private static Point point;
    private static final HashMap<Integer, Circle> circles = new HashMap();
    private static final HashMap<Integer, Square> squares = new HashMap();
    ;

    public static Point createPoint() {
        if (point == null) {
            point = new Point();
        }
        return point;
    }

    public static Circle createCircle(int radius) {
        if (!circles.containsKey(radius)) {
            Circle circle = new Circle(radius);
            circles.put(radius, circle);
        }
        return circles.get(radius);
    }

    public static Square createSquare(int width) {
        if (!squares.containsKey(width)) {
            Square square = new Square(width);
            squares.put(width, square);
        }
        return squares.get(width);
    }

    public static Picture createPicture(List<Shape> children) {
        return new Picture(children);
    }
}
