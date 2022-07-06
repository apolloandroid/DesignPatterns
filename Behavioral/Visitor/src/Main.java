import developer.Developer;
import developer.JuniorDeveloper;
import developer.MiddleDeveloper;
import element.Project;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();
        Developer juniorDeveloper = new JuniorDeveloper();
        Developer middleDeveloper = new MiddleDeveloper();

       project.beCreated(juniorDeveloper);
       project.beCreated(middleDeveloper);
    }
}
