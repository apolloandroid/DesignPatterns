package decorator;

import widget.Widget;

public class ScrollDecorator extends WidgetDecorator {
    public ScrollDecorator(Widget widget) {
        super(widget);
    }

    public void draw() {
        super.draw();
        System.out.println("ScrollDecorator");
    }
}