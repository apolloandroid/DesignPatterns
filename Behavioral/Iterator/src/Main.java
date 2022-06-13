import part.*;
import word.Word;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Prefix prefix = new Prefix("раз");
        Root root = new Root("работ");
        Suffix suffix = new Suffix("к");
        Ending ending = new Ending("a");

        Word word = new Word(root, prefix, suffix, ending);

        Iterator<WordPart> wordIterator = word.iterator();
        while (wordIterator.hasNext()) {
            WordPart part = wordIterator.next();
            System.out.println(part.getClass() + ": " + part.getName());
        }
    }
}
