public class Main {
    public static void main(String[] args) {
        String firstText = "The Memento Design Pattern\n";
        String secondText = "The Memento Design Pattern\n";
        String thirdText = "The Memento Design Pattern\n";

        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write(firstText);
        textEditor.write(secondText);

        textEditor.saveCurrentText();

        textEditor.write(thirdText);

        textEditor.revertPreviousText();

        System.out.println(textEditor.getCurrentText().equals(firstText + secondText));
    }
}
