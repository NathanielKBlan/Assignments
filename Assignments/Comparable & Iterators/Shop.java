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
    sortByAscending(cart);

    System.out.print("[ ");

    for(int a = 1; a < cart.size(); a++){
      System.out.print(cart.get(a).id + "  |||  ");
    }

    System.out.print("]");
  }

  public static void sortByAscending(ArrayList<Widget> widgets){
    for(int i = widgets.size() - 1; i > 1; i--){
      for(int j = 0; j < i; j++){
        if(widgets.get(j).priceUSD > widgets.get(j + 1).priceUSD){
          Widget wid = widgets.get(j);
          widgets.set(j, widgets.get(j + 1));
          widgets.set(j + 1, wid);
        }
      }
    }
  }

}
