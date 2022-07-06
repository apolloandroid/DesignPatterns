package developer;

import element.Database;
import element.ProjectClass;
import element.Test;

public interface Developer {
    public void create(ProjectClass projectClass);
    public void create(Database database);
    public void create(Test test);
}
