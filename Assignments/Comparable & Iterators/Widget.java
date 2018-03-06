
public class Widget implements Comparable{

  String id;
  double priceUSD = Math.round(((Math.random() * 99) + 1) * 100.0) / 100.0;

  public Widget(String id){
    this.id = id;
  }

  public double retrievePrice(){
    return priceUSD;
  }

  public int compareTo(Object alternate){
    Widget w1 = (Widget) alternate;

    if(retrievePrice() > w1.retrievePrice())
      return 1;
    if(retrievePrice() < w1.retrievePrice())
      return -1;
    else
      return 0;
  }

}
