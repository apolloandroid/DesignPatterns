package receiver;

public class ViewModel implements ButtonClickReceiver, ButtonPressReceiver {
    @Override
    public void onClicked() {
        System.out.println("Button clicked!");
    }

    @Override
    public void onPressed() {
        System.out.println("Button pressed!");
    }
}
