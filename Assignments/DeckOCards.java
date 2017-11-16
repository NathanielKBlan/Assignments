import java.util.List;
import java.util.ArrayList;


class DeckOCards{
    static String[] suite = {"Diamonds", "Hearts", "Spades", "Clovers"};
    static String[] values = {"Ace", "Two","Three", "Four", "Five","Six", "Seven","Eight","Nine","Ten", "Jack","Queen","King"};
    static List<String> deck = new ArrayList<String>();

    public static void main(String[] args){
        createDeck();
        System.out.println(deck);
        System.out.println(deck.size());
        shuffle();
    }

    public static void createDeck(){
        for(int s = 0; s <= 3; s++){
            for(int i = 0; i < 13; i++){
                deck.add(values[i] + " of " + suite[s]);
            }
        }
    }

    public static void shuffle(){
        for(int i = 0; i < deck.size(); i++){
            int rand = (int) Math.round(Math.random() * 51) + 1;
            String val = deck.get(i);
            deck.set(i, deck.get(rand));
            deck.set(rand, val);
        }
        System.out.println(deck);
    }
}
