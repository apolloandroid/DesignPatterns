import application.Application;
import builder.ApplicationBuilder;
import builder.Builder;
import component.DataBase;
import component.OperationSystem;
import component.ProgrammingLanguage;
import component.Type;

public class Main {
    public static void main(String[] args) {
        Builder applicationBuilder = new ApplicationBuilder();
        applicationBuilder.setVersion(1.0);
        applicationBuilder.setName("Android application");
        applicationBuilder.setDevelopersQuantity(2);
        applicationBuilder.setOperationSystem(OperationSystem.ANDROID);
        applicationBuilder.setLanguage(ProgrammingLanguage.KOTLIN);
        applicationBuilder.setUserInterface(true);
        applicationBuilder.setType(Type.MOBILE);
        applicationBuilder.setDataBase(DataBase.SQLITE);
        Application application = applicationBuilder.getResult();
        System.out.println(application.toString());
    }
}
