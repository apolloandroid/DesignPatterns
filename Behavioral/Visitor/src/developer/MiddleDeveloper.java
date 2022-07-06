package developer;

import element.Database;
import element.ProjectClass;
import element.Test;

public class MiddleDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Created good class");
    }

    @Override
    public void create(Database database) {
        System.out.println("Created good database");
    }

    @Override
    public void create(Test test) {
        System.out.println("Created good test");
    }
}
