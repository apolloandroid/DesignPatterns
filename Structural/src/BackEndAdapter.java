import backend.BackEndLanguage;
import frontend.FrontEndLanguage;

public class BackEndAdapter implements BackEndLanguage {
    private FrontEndLanguage frontEndLanguage;


    public BackEndAdapter(FrontEndLanguage frontEndLanguage) {
        this.frontEndLanguage = frontEndLanguage;
    }


    @Override
    public void writeBackEndCode() {
        frontEndLanguage.writeFrontEndCode();
    }
}
