import factory.AppleFactory;
import factory.CompanyFactory;
import notebook.Notebook;
import smartphone.SmartPhone;

public class Main {
    public static void main(String[] args) {
        CompanyFactory factory = new AppleFactory();

        SmartPhone smartPhone = factory.createSmartPhone();
        Notebook noteBook = factory.createNoteBook();

        smartPhone.makeCall();
        smartPhone.declineCall();

        noteBook.turnOn();
        noteBook.turnOff();
    }
}
