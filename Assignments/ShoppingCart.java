import java.util.Scanner;

class ShoppingCart{
  static Scanner s = new Scanner(System.in);
  static int di = 0;
  static String p = "";
  static double q = 0.0;
  static String f = "first";
  static String o = "other";
  static double pr = 0.0;
  static double total = 0.0;
  static double average = 0.0;

  public ShoppingCart(int di) {
    this.di = di;
  }

  public static String getItemName(int n){
    if(n < 1){
      System.out.println("What is the name of the " + f + " item you wish to buy?");
      p = s.nextLine();
    }else{
      System.out.println("What is the name of the " + o + " item you wish to buy?");
      p = s.nextLine();
    }
    getItemPrice(f);
    quality();
    calculateTotal();
    calculateAverage(n);
    return p;
  }

  public static double getItemPrice(String n){
    System.out.println("What is the current price for: " + n + "?");
    pr = pr + s.nextDouble();
    System.out.println("From a scale of 1 - 5, what is the quality for item " + n + "?");
    quality();
    return pr;
  }

  public static double quality(){
    q = s.nextDouble();
    System.out.println("The quality of the item is: " + q);
    return q;
  }

  public static double calculateTotal(){
    total = pr + (pr * .10);
    System.out.println("Your total will be: " + total);
    return total;
  }

  public static double calculateAverage(int n){
    average = total / n;
    System.out.println("The average cost of each item is: " + average);
    return average;
  }

}
