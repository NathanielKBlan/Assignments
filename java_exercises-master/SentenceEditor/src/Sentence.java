import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sentence {

    private String sentence;

    public Sentence(String sent) {
        this.sentence = sent;
    }

    public int countWords() {
        int spaces =0;
        for (int i=0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ')
                spaces ++;
        }
        return spaces+1;

    }

    public String[] getWords() {
        String [] words = sentence.split(" ");
        return words;
    }

    public ArrayList<Integer> getBlankPositions() {
        ArrayList<Integer> blanks = new ArrayList<>();

        for (int i=0; i < sentence.length(); i ++)
            if (sentence.charAt(i) == ' ')
                blanks.add(i);

        return blanks;

    }
}
