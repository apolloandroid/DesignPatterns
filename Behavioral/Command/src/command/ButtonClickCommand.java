package command;

import receiver.ButtonClickReceiver;

public class ButtonClickCommand implements ButtonCommand {
    private final ButtonClickReceiver receiver;

    public ButtonClickCommand(ButtonClickReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.onClicked();
    }
}

