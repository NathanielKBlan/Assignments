import java.text.NumberFormat;

class CDCollections1{

  private CD[] collections;
  private int count;
  private double totalCost;

  public CDCollection(){

    collections = new CD[100];
    count = 0;
    totalCost = 0.0;

  }

  public void addCD(String title, String artist, double cost, int tracks){

    if(count == collections.length)
      increaseSize();

    collections[count] = new CD(title, artist, cost, tracks);
    totalCost += cost;
    count++;

  }

  @Override
  public String toString(){

    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    String report = "#############################\n";
    report += "My CD Collections\n\n";
    report += "Number of CDs: " + count + "\n";
    report += "Total cost is " + fmt.format(totalCost) + "\n";
    report += "Average cost is " + fmt.format(totalCost/count);

    report += "\n\nCD List:\n\n";

    for(int cd = 0; cd < count; cd++){
      report += collections[cd].toString() + "\n";
    }

    return report;
  }

  private void increaseSize(){
    CD[] temp = new CD[collection.length * 2];

    for(int cd = 0; cd < collection.length; cd++){
      temp[cd] = collection[cd];
    }

    collection = temp;
  }
}
