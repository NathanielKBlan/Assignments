import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class DeckOCards{
  static String[] suite = {"Diamonds", "Hearts", "Spades", "Clovers"};
  static String[] values = {"Ace", "Two","Three", "Four", "Five","Six", "Seven","Eight","Nine","Ten", "Jack","King","Queen"};
  static List<String> deck = new ArrayList<String>();

  public static void main(String[] agrs){
    createDeck();
    Collections.shuffle(deck);
    System.out.println(deck);
  }

  static void createDeck(){
  for (int i =0: i < suite.length; i++) {
    for (int j=0; j< values.length; j++) {
      deck[count] = 
    }
  }
  }
}
