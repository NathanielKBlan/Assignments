
public class Encryptor{

  public Encryptor(){

  }

  public String encrypt(String message){
    String[] characters = message.split("");
    message = "";
    for(int i = 0; i < characters.length; i++){
      if(!(characters[i].equals(" "))){
        int position = determineLetter(characters[i]);
        characters[i] = determineCharacter(position + 3);
      }
      message = message + characters[i];
    }
    return message;
  }

  public String decrypt(String message){
    int vCount = 0;
    int hCount = 0;
    int vFrequency = 0;
    String decrypted = "";


    String[] characters = message.split("");

    for(int i = 0; i < characters.length; i++){
      if(characters[i].equals("v")){
        vCount++;
      }
      if(characters[i].equals("h")){
        hCount++;
      }
      vFrequency = (vCount - hCount) + 1;
    }

    for(int i = 0; i < characters.length; i++){
      if(!(characters[i].equals(" "))){
        int position = determineLetter(characters[i]);
        characters[i] = determineCharacter(position - vFrequency);
      }
      decrypted = decrypted + characters[i];
    }

    return decrypted;
  }

  public int determineLetter(String l){
    if(l.equals("a"))
      return 1;
    if(l.equals("b"))
      return 2;
    if(l.equals("c"))
      return 3;
    if(l.equals("d"))
      return 4;
    if(l.equals("e"))
      return 5;
    if(l.equals("f"))
      return 6;
    if(l.equals("g"))
      return 7;
    if(l.equals("h"))
      return 8;
    if(l.equals("i"))
      return 9;
    if(l.equals("j"))
      return 10;
    if(l.equals("k"))
      return 11;
    if(l.equals("l"))
      return 12;
    if(l.equals("m"))
      return 13;
    if(l.equals("n"))
      return 14;
    if(l.equals("o"))
      return 15;
    if(l.equals("p"))
      return 16;
    if(l.equals("q"))
      return 17;
    if(l.equals("r"))
      return 18;
    if(l.equals("s"))
      return 19;
    if(l.equals("t"))
      return 20;
    if(l.equals("u"))
      return 21;
    if(l.equals("v"))
      return 22;
    if(l.equals("w"))
      return 23;
    if(l.equals("x"))
      return 24;
    if(l.equals("y"))
      return 25;
    if(l.equals("z"))
      return 26;
    else
      return 0;
  }
  public String determineCharacter(int n){
    if(n == 1)
      return "a";
    if(n == 2)
      return "b";
    if(n == 3)
      return "c";
    if(n == 4)
      return "d";
    if(n == 5)
      return "e";
    if(n == 6)
      return "f";
    if(n == 7)
      return "g";
    if(n == 8)
      return "h";
    if(n == 9)
      return "i";
    if(n == 10)
      return "j";
    if(n == 11)
      return "k";
    if(n == 12)
      return "l";
    if(n == 13)
      return "m";
    if(n == 14)
      return "n";
    if(n == 15)
      return "o";
    if(n == 16)
      return "p";
    if(n == 17)
      return "q";
    if(n == 18)
      return "r";
    if(n == 19)
      return "s";
    if(n == 20)
      return "t";
    if(n == 21)
      return "u";
    if(n == 22)
      return "v";
    if(n == 23)
      return "w";
    if(n == 24)
      return "x";
    if(n == 25)
      return "y";
    if(n == 26)
      return "z";
    else
      return null;
  }
}
