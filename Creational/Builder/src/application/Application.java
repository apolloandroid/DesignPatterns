package application;

import component.DataBase;
import component.OperationSystem;
import component.ProgrammingLanguage;
import component.Type;

public class Application {
    private double version;
    private String name;
    private int developersQuantity;
    private OperationSystem operationSystem;
    private ProgrammingLanguage language;
    private boolean userInterface;
    private Type type;
    private DataBase dataBase;

    public Application(
            double version,
            String name,
            int developersQuantity,
            OperationSystem operationSystem,
            ProgrammingLanguage language,
            boolean userInterface,
            Type type,
            DataBase dataBase) {
        this.version = version;
        this.name = name;
        this.developersQuantity = developersQuantity;
        this.operationSystem = operationSystem;
        this.language = language;
        this.userInterface = userInterface;
        this.type = type;
        this.dataBase = dataBase;
    }

    @Override
    public String toString() {
        return "version='" + version + '\'' +
                "name='" + name + '\'' +
                "developers quantity='" + developersQuantity + '\'' +
                "OS='" + operationSystem + '\'' +
                "language='" + language + '\'' +
                "UI='" + userInterface + '\'' +
                "type='" + type + '\'' +
                "database=" + dataBase;
    }

    public String getType() {
        return type.name();
    }
}
