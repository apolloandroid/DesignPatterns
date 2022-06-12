package decorator;

import widget.Widget;

public class BorderDecorator extends WidgetDecorator {
    public BorderDecorator(Widget widget) {
        super(widget);
    }

    public void draw() {
        super.draw();
        System.out.println("BorderDecorator");
    }
}