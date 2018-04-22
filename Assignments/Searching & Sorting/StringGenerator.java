
public class StringGenerator{

  int l = 3;

  public StringGenerator(){

  }

  public String[] generate(){
    int arrLength = 100;
    String[] s = new String[arrLength];
    for(int i = 0; i < arrLength; i++){
      String id = "";
      for(int j = 0; j <= 10; j++){
        int randomCharacter = (int) (Math.round(Math.random() * 25) + 1);
        id = id + determineCharacter(randomCharacter);
      }
      s[i] = id;
    }
    return s;
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
