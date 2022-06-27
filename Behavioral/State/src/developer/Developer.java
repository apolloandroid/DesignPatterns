package developer;

import activity.*;

public class Developer {

    private Activity activity = Sleeping.getInstance();

    public void act() {
        activity.act();
        this.activity = getNextActivity();
    }

    private Activity getNextActivity() {
        if (activity instanceof Sleeping) {
            return Coding.getInstance();
        } else if (activity instanceof Coding)
            return Eating.getInstance();
        else if (activity instanceof Eating)
            return Training.getInstance();
        else return Sleeping.getInstance();
    }
}
