public class Main {
    public static void main(String[] args) {
        String firstText = "first\n";
        String secondText = "second\n";
        String thirdText = "third";

        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write(firstText);
        textEditor.write(secondText);

        textEditor.saveCurrentText();

        textEditor.write(thirdText);

        textEditor.revertPreviousText();

        System.out.println(textEditor.getCurrentText().equals(firstText + secondText));
    }
}
