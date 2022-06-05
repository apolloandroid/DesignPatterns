package smartphone;

public class ZenPhone implements SmartPhone {
    @Override
    public void makeCall() {
        System.out.println("Making call on ZenPhone");
    }

    @Override
    public void declineCall() {
        System.out.println("Decline call on ZenPhone");
    }
}
