import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

class Main{

  public static void main (String [] args) {

    //JFrame frame = new JFrame();

    //String response = JOptionPane.showInputDialog("Type a sentence.");

    //Sentence sent1 = new Sentence(response);

    //String sent = sent1.getSentence();

    Sentence[] sentences = new Sentence[5];

    sentences[0] = new Sentence("This is a sentence");
    sentences[1] = new Sentence("This is the second sentence");
    sentences[2] = new Sentence("This is the third sentence");
    sentences[3] = new Sentence("This is the fourth sentence");
    sentences[4] = new Sentence("This is the fifth sentence");

    for(int i = 0; i <= 4; i++){
      System.out.println(sentences[0].getSentence()); }

    //sent1.getBlankPositions();
    //sent1.countWords();
    //sent1.getWords();

    //String output1 = "" + sent1.getBlankPositions();
    //String output2 = "" + sent1.countWords();
    //String output3 = "";

    //for (String word : sent1.getWords())
    //output3 += word + " ";

    //JOptionPane.showMessageDialog(frame, output3 + " This sentence has " + output2 + " words and spaces located at " + output1);
    //System.exit(0);
  }
}
