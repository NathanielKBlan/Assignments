import java.util.ArrayList;

public class Shop{

  public static void main(String[] args){

    IDGenerator generator = new IDGenerator();
    Widget w = new Widget(generator.randomID());
    Inventory i = new Inventory(10);
    ArrayList<Widget> cart = new ArrayList<Widget>();

    System.out.println(w.id);
    System.out.println(w.priceUSD);

    i.creatInventory();
    cart = i.extractWidgets(w, "<");

    System.out.print("[ ");

    for(int a = 1; a < cart.size(); a++){
      System.out.print(cart.get(a).priceUSD + " ");
    }

    System.out.print("]");
  }

}
