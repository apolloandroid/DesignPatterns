import java.util.Arrays;
import java.util.List;

public class Picture implements Drawable {

    private final List<Drawable> children;

    public Picture(Drawable... children) {
        System.out.println("Drawing picture");
        this.children = Arrays.asList(children);
    }

    @Override
    public void draw() {
        for (Drawable child : children) {
            child.draw();
        }
    }

    public void add(Drawable child) {
        children.add(child);
    }

    public void remove(Drawable child) {
        children.remove(child);
    }

    public Drawable getChild(int position) {
        return children.get(position);
    }
}
