package iterator;

import part.WordPart;
import word.Word;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class WordIterator implements Iterator<WordPart> {
    private Word word;
    private int wordPartsCount;

    public WordIterator(Word word) {
        this.word = word;
        this.wordPartsCount = word.getPartCount();
    }

    @Override
    public boolean hasNext() {
        switch (wordPartsCount) {
            case 4:
                return word.hasPrefix() || word.hasRoot() || word.hasSuffix() || word.hasEnding();
            case 3:
                return word.hasPrefix() || word.hasRoot() || word.hasSuffix();
            case 2:
                return word.hasPrefix() || word.hasRoot();
            case 1:
                return word.hasRoot();
        }

        return false;
    }

    @Override
    public WordPart next() throws NoSuchElementException {
        try {
            switch (wordPartsCount) {
                case 4:
                    return word.getEnding();
                case 3:
                    return word.getSuffix();
                case 2:
                    return word.getPrefix();
                case 1:
                    return word.getRoot();
                default:
                    throw new NoSuchElementException("No more elements in this word!");
            }
        } finally {
            wordPartsCount--;
        }
    }
}
