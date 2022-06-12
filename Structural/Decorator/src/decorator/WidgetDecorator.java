package decorator;

import widget.Widget;

public abstract class WidgetDecorator implements Widget {
    private Widget widget;

    public WidgetDecorator(Widget widget) {
        this.widget = widget;
    }

    public void draw() {
        widget.draw();
    }
}
