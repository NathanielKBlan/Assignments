import java.util.Scanner;

class Main extends Word{
  static Word w = new Word();
  static String str;
  static Scanner s = new Scanner(System.in);
  static String input;
  static String guessedC;
  static int guess = 0;
  static int wrongGuess = 0;
  static String guessedLetters;
  static String bW = "";
  static boolean letterFound;

  public static void main(String[] args){
    for(int i = 0; i < bW.length(); i++){
      System.out.print(bW.substring(i,i+1) + " " );
      System.out.print("\n");
    }
    str = w.getRandomWord();
    System.out.println("Welcome to the hanging of the man! (Not associated w/ violence.)");
    System.out.println("The word has " + str.length() + " letters.");
    for(int i = 0; i < str.length(); i++){
      bW += "_";
    }
    while(guess < str.length()){
      letterFound = false;
      input = s.next();
      input = input.toLowerCase();
      guessedC = input;
      guessedLetters = "";
      guessedLetters += guessedC;
      for (int i=0; i < str.length(); i ++)  {
        String currentLetter = str.substring(i, i+1);
        if(currentLetter.equals(guessedC)){
          bW = bW.substring(0,i) + guessedC + bW.substring(i + 1);
          System.out.println(bW);
          letterFound = true;
        }
      }

      if(letterFound){
        System.out.println("You are correct!");
        guess++;
      }else{
        System.out.println("You are wrong...");
        wrongGuess++;
      }

      if (wrongGuess >= 1)
        System.out.println("\n");

      if (wrongGuess >= 2)
        System.out.println("----|");
      if (wrongGuess >= 3)
        System.out.println("|    o");
      if (wrongGuess >= 4)
        System.out.println("|    /|\\");
      if (wrongGuess >= 5){
        System.out.println("|    / \\");
        System.out.println("You lost");
        guess += 100;
      }
    }

  }
}
