import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    public List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void sendRequestAll(Colleague colleague) {
        colleague.setStatus(true);
        colleagues.forEach(item -> {
            if (item != colleague) item.setStatus(false);
        });
    }

    public void addColleague(Colleague newColleague) {
        colleagues.add(newColleague);
    }
}
