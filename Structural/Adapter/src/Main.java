import backend.BackEndLanguage;
import backend.Java;
import frontend.FrontEndLanguage;
import frontend.JavaScript;

public class Main {

    public static void main(String[] args) {
        FrontEndLanguage frontEndLanguage = new FrontEndAdapter(new Java());
        frontEndLanguage.writeFrontEndCode();

        BackEndLanguage backEndLanguage = new BackEndAdapter(new JavaScript());
        backEndLanguage.writeBackEndCode();
    }
}
