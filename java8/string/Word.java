package java8.string;

public final class Word {
    private final String word;
    private int length;

    public Word(String word) {
        this.word = word;
        if(word != null) {
            this.length = this.calculateSize();
        }
    }
    
    public char[] toCharArray() {
        if(word == null) {
            throw new NullPointerException();
        }

        char [] tempChar = new char[word.length()];

        for(int i=0; i<word.length(); i++) {
            tempChar[i] = word.charAt(i);
        }
        return tempChar;
    }

    private int calculateSize() {
        return word.length();
    }
    
    public int size() {
        if(word == null) {
            throw new NullPointerException();
        }
        return length;
    }

    public String subWord(int index) {
        if(word == null) {
            throw new NullPointerException();
        }

        if(index < 0 || index > length) {
            throw new IndexOutOfBoundsException();
        }

        return word.substring(index);
    }

}
