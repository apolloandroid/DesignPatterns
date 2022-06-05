package factory;

import notebook.Notebook;
import notebook.VivoBook;
import smartphone.SmartPhone;
import smartphone.ZenPhone;

public class AsusFactory implements CompanyFactory {
    @Override
    public Notebook createNoteBook() {
        return new VivoBook();
    }

    @Override
    public SmartPhone createSmartPhone() {
        return new ZenPhone();
    }
}
