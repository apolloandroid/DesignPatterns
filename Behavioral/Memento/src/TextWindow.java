public class TextWindow {
    private StringBuilder text;

    public TextWindow() {
        this.text = new StringBuilder();
    }

    public String getText() {
        return text.toString();
    }

    public void addText(String text) {
        this.text.append(text);
    }

    public void revertPreviousText(TextWindowStateHolder stateHolder) {
        text = new StringBuilder(stateHolder.getSavedText());
    }
}
