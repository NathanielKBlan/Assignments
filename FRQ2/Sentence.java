import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Sentence{
   /** The sentence to manipulate */

  private static String sentence;

  public Sentence(String sentence) {
  this.sentence = sentence;

  }

  /** @return an ArrayList of integer positions containing a
  *   blank in this sentence. If there are no blanks in the
  *   sentence, returns an empty list.
  */

  public static List<Integer> getBlankPositions(){
    List<Integer> blanks = new ArrayList<Integer>();
    for(int i = 0; i <= sentence.length() - 1; i++){
      if(String.valueOf(sentence.charAt(i)).equals(" ")){
        blanks.add(i);
      }
    }
    Integer[] pos = new Integer[blanks.size()];
    pos = blanks.toArray(pos);
    System.out.println(Arrays.toString(pos));
    return blanks;
  }

  /** @return the number of words in this sentence
  *   Precondition: Sentence contains at least one word.
  */

  public static int countWords(){
    int count = 0;
    for(int i = 0; i < sentence.length(); i++){
      if(String.valueOf(sentence.charAt(i)).equals(" ")){
        count++;
      }
      else if(String.valueOf(sentence.charAt(i)).equals(".") || String.valueOf(sentence.charAt(i)).equals("?") || String.valueOf(sentence.charAt(i)).equals("!")){
        count++;
      }
    }
    System.out.println(count);
    return count;
  }

  /** @return the array of words in this sentence
   * Precondition:
   *  - Any two words in the sentence are separated by one blank.
   *  - The sentence contains at least one word.
   * Precondition: String[] returned containing the words in
   *               this sentence.
   */

  public static String[] getWords(){
    String[] str;
    ArrayList<String> words = new ArrayList<String>();
    str = sentence.split("\\s+", -1);
    int size = str.length;
    for(int i  = 0; i < size; i++){
      words.add(str[i]);
    }
    str = words.toArray(str);
    System.out.println(Arrays.toString(str));
    return str;
  }
}
