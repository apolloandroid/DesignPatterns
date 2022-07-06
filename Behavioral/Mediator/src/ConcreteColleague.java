public class ConcreteColleague implements Colleague {

    private boolean status;
    private Mediator mediator;

    public ConcreteColleague(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
        System.out.println("My status is " + this.status);
    }

    @Override
    public void changeStatus() {
        mediator.sendRequestAll(this);
    }
}
