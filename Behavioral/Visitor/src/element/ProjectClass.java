package element;

import developer.Developer;

public class ProjectClass implements ProjectElement {
    @Override
    public void beCreated(Developer developer) {
        developer.create(this);
    }
}
