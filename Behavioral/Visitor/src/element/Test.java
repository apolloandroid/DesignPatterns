package element;

import developer.Developer;

public class Test implements ProjectElement{
    @Override
    public void beCreated(Developer developer) {
        developer.create(this);
    }
}
