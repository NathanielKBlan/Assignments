import javax.swing.*;
import java.util.ArrayList;

public class SentenceEditor {

    public static void main(String[] args) {
        String text = getString();
        Sentence sent1 = new Sentence(text);
        showString("There are " + sent1.countWords() + " words" + "\n" +
                "The words are:\n" + generateStringFromArray(sent1.getWords()) +
                "The position of the blanks are:" + generateStringFromIntArrayList(sent1.getBlankPositions()));
    }

    public static String getString() {
        return JOptionPane.showInputDialog("Enter a sentence: ");
    }

    public static void showString(String s) {
        JOptionPane.showMessageDialog(null, s);
    }

    public static String generateStringFromArray(String[] arr) {
        String str = "";
        for (String word : arr)
            str += word + "\n";

        return str;

    }

    public static String generateStringFromIntArrayList(ArrayList<Integer> blanks) {

        String str = "[ ";
        for (int i = 0; i < blanks.size(); i++) {
            str += blanks.get(i) + " ";
        }
        str += "]";
        return str;
    }
}
