import java.util.ArrayList;
import java.util.Iterator;

public class Inventory{

    private IDGenerator generator = new IDGenerator();

    // int widgetsAmount = (int) (Math.round(Math.random() * 5000) + 4000);

    int widgetsAmount;

    ArrayList<Widget> widgetCollection = new ArrayList<Widget>();

    public Inventory(int widgetsAmount){
      this.widgetsAmount = widgetsAmount;
    }

    public void creatInventory(){
      for(int i = 0; i <= widgetsAmount; i++){
        widgetCollection.add(new Widget(generator.randomID()));
      }
    }

    public ArrayList<Widget> extractWidgets(Widget w, String comparison){
      ArrayList<Widget> match = new ArrayList<Widget>();
      Iterator removalAgent = widgetCollection.iterator();

      if(comparison.equals("=")){
        for(int i = 1; i <= widgetsAmount; i++){
          removalAgent.next();
          if(w.compareTo(widgetCollection.get(i)) == 0){
            match.add(widgetCollection.get(i));
            removalAgent.remove();
            i--;
            widgetsAmount--;
          }
        }
        return match;
      }
      if(comparison.equals(">")){
        for(int i = 1; i <= widgetsAmount; i++){
          removalAgent.next();
          if(w.compareTo(widgetCollection.get(i)) == 1){
            match.add(widgetCollection.get(i));
            removalAgent.remove();
            i--;
            widgetsAmount--;
          }
        }
        return match;
      }
      if(comparison.equals("<")){
        for(int i = 1; i <= widgetsAmount; i++){
          removalAgent.next();
          if(w.compareTo(widgetCollection.get(i)) == -1){
            match.add(widgetCollection.get(i));
            removalAgent.remove();
            i--;
            widgetsAmount--;
          }
        }
        return match;
      }else{
        return null;
      }
    }
}
