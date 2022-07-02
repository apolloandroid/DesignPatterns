package button;

import command.ButtonClickCommand;
import command.ButtonPressCommand;

public class Button {
    private ButtonClickCommand onClickListener;
    private ButtonPressCommand onPressListener;

    public void setOnClickCommand(ButtonClickCommand onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void setOnPressCommand(ButtonPressCommand onPressListener) {
        this.onPressListener = onPressListener;
    }

    public void click() {
        onClickListener.execute();
    }

    public void press() {
        onPressListener.execute();
    }
}
