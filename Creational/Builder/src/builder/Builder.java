package builder;

import application.Application;
import component.DataBase;
import component.OperationSystem;
import component.ProgrammingLanguage;
import component.Type;

public interface Builder {

    void setVersion(double version);

    void setName(String name);

    void setDevelopersQuantity(int developersQuantity);

    void setOperationSystem(OperationSystem operationSystem);

    void setLanguage(ProgrammingLanguage language);

    void setUserInterface(boolean userInterface);

    void setType(Type type);

    void setDataBase(DataBase dataBase);

    Application getResult();
}
