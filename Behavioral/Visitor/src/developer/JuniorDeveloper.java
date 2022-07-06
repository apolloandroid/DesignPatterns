package developer;

import element.Database;
import element.ProjectClass;
import element.Test;

public class JuniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Created poor class");
    }

    @Override
    public void create(Database database) {
        System.out.println("Created poor database");
    }

    @Override
    public void create(Test test) {
        System.out.println("Created poor test");
    }
}
