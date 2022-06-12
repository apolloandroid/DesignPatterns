import decorator.BorderDecorator;
import decorator.ScrollDecorator;
import widget.TextField;
import widget.Widget;


public class Main {

    public static void main(String[] args) {
        Widget widget = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(80, 24))));
        widget.draw();
    }
}
