
import javax.swing.JOptionPane;

public class Counts {

    public static String tens[] = {
      "ten", "twenty", "thirty", "forty", "fifty",
      "sixty", "seventy", "eighty", "ninety"
    };

    public static String digits[] = {
      "one", "two", "three", "four", "five",
      "six", "seven", "eight", "nine"
    };

    public static String specialsTT[] = {
      "eleven", "twelve", "thirteen", "fourteen",
      "fifteen", "sixteen", "seventeen", "eighteen",
      "nineteen"
    };

  public static void main(String args[]){
    String response = JOptionPane.showInputDialog("Enter a number from 1-1000:");
    int r = Integer.parseInt(response);
    String result = convertNumber(r);
    System.out.println(result);
    System.out.println("This is the number of letters: " + result.length());

  }

  public static String convertNumber(int num) {
    //create blank string
    //if it's under 20 return special values
    //if it's between 20 and 99 call method GetTens to generate value between 20 and 99
    //if it's greater, get hundred value and call getTens
    String res = "";
    for(int i = 1; i <= num; i++){
      if(i < 10){
        res += lessThanTen(i);
      }
      if(i == 10){
        res += "ten";
      }
      if (i < 20 && i > 10) {
        res += lessThanTwenty(i);
      } else if (i >= 20 && i <= 99) {
        res += getTens(i);
      }
      if(i % 100 == 0 && i >= 100 && i < 1000){
        res += digits[(i/100) -1] + "hundred";
      }
      else if (i > 100 && i < 1000) {
        int val = i / 100;
        int iSub = i;
        res += digits[val-1] + "hundredand";
        iSub = iSub - (val*100);
        res += getTensForHundereds(iSub);
      } else if (i ==0) {
        res+= "zero";
      } else if (i==1000)
        res+= "onethousand";
      }
        return res;
    }
    public static String lessThanTen(int n){
      String word = digits[n - 1];
      return word;
    }
    public static String lessThanTwenty(int n) {
      String word = specialsTT[n - 11];
      return word;
    }

    public static String getTens(int num) {
      String word = "";
      if(num % 10 == 0){
        word = tens[(num/10) - 1];
      }else{
        word = tens[(num/10) - 1] + digits[(num % 10) - 1];
      }
      return word;
    }

    public static String getTensForHundereds(int num) {
      String word = "";
      int sub = 0;
      if(num % 100 == 0){
        sub = num / 100;
      }
      if((num-100) % 10 == 0){
        word = tens[(num/10) - ((10 * sub) + 1)];
      }
      if(num % 100 < 10){
        word = digits[(num % 100) - 1];
      }
      if(num % 100 > 10 && num % 100 < 20){
        word = specialsTT[(num % 100) - 11];
      }
      if(num % 100 > 20 && num % 10 != 0 && num < 1000){
        word = tens[((num % 100)/10) - 1] + digits[((num % 100) % 10) - 1];
      }
      return word;
    }
}
