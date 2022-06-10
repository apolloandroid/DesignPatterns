import backend.BackEndLanguage;
import frontend.FrontEndLanguage;

public class FrontEndAdapter implements FrontEndLanguage {
    private BackEndLanguage backEndLanguage;

    public FrontEndAdapter(BackEndLanguage backEndLanguage) {
        this.backEndLanguage = backEndLanguage;
    }

    @Override
    public void writeFrontEndCode() {
        backEndLanguage.writeBackEndCode();
    }
}
