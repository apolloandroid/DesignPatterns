package developer;

import application.AndroidApplication;
import application.Application;
import application.IosApplication;

public class MobileDeveloper {
    public Application createApplication(String applicationType) {
        switch (applicationType) {
            case IosApplication.applicationType:
                return new IosApplication();
            case AndroidApplication.applicationType:
                return new AndroidApplication();
        }
        return null;
    }
}
