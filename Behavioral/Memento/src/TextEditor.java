public class TextEditor {
    private TextWindow textWindow;
    private TextWindowStateHolder textWindowStateHolder;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void write(String text) {
        textWindow.addText(text);
    }

    public String getCurrentText() {
        return textWindow.getText();
    }

    public void saveCurrentText() {
        textWindowStateHolder = new TextWindowStateHolder(textWindow.getText());
    }

    public void revertPreviousText() {
        textWindow.revertPreviousText(textWindowStateHolder);
    }
}
