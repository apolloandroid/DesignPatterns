package factory;

import notebook.Notebook;
import smartphone.SmartPhone;

public interface CompanyFactory {
    Notebook createNoteBook();

    SmartPhone createSmartPhone();
}
