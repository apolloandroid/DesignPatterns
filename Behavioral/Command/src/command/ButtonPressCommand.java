package command;

import receiver.ButtonPressReceiver;

public class ButtonPressCommand implements ButtonCommand {
    private final ButtonPressReceiver receiver;

    public ButtonPressCommand(ButtonPressReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.onPressed();
    }
}
