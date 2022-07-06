public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.addColleague(new ConcreteColleague(mediator));
        mediator.addColleague(new ConcreteColleague(mediator));
        mediator.addColleague(new ConcreteColleague(mediator));

        ConcreteColleague colleague = new ConcreteColleague(mediator);
        mediator.addColleague(colleague);

        colleague.changeStatus();
    }
}
