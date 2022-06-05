package factory;

import notebook.MacBook;
import notebook.Notebook;
import smartphone.Iphone;
import smartphone.SmartPhone;

public class AppleFactory implements CompanyFactory {
    @Override
    public Notebook createNoteBook() {
        return new MacBook();
    }

    @Override
    public SmartPhone createSmartPhone() {
        return new Iphone();
    }
}
