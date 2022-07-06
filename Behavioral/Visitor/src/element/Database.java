package element;

import developer.Developer;

public class Database implements ProjectElement{
    @Override
    public void beCreated(Developer developer) {
        developer.create(this);
    }
}
