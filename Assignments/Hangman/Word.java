import java.util.Random;

public class Word{

  static String[] words = {"word", "calculus", "computers", "database", "science",
  "fallacy", "contradiction", "tutorial", "intel", "extravagant"};
  static int element;
  static String sW;

  public static void main(String[] args){

  }

  static String getRandomWord(){
    element = new Random().nextInt(words.length);
    return sW = words[element];
  }
}
