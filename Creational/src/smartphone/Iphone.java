package smartphone;

public class Iphone implements SmartPhone{
    @Override
    public void makeCall() {
        System.out.println("Making call on Iphone");
    }

    @Override
    public void declineCall() {
        System.out.println("Decline call on Iphone");
    }
}
