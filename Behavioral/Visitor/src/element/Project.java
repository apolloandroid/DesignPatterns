package element;

import developer.Developer;

import java.util.ArrayList;
import java.util.List;

public class Project implements ProjectElement {
    private List<ProjectElement> elements = new ArrayList<>();

    public Project() {
        this.elements = new ArrayList<>();
        elements.add(new Test());
        elements.add(new ProjectClass());
        elements.add(new Database());
    }

    @Override
    public void beCreated(Developer developer) {
        elements.forEach(element -> {
            element.beCreated(developer);
        });
    }
}
