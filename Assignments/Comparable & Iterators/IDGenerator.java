import java.util.ArrayList;

public class IDGenerator{

  public IDGenerator(){

  }

  public String randomID(){
    String id = "";
    ArrayList<String> takenIds = new ArrayList<String>();
    int randomLength = (int) (Math.round(Math.random() * 1000) + 1);

    for(int i = 0; i <= randomLength; i++){
      int randomCharacter = (int) (Math.round(Math.random() * 25) + 1);
      id = id + determineCharacter(randomCharacter);
    }

    if(takenIds.contains(id)){
      return randomID();
    }else{
      takenIds.add(id);
      alphabeticalSelectionSort(takenIds);
      return id;
    }

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

  public void alphabeticalSelectionSort(ArrayList<String> widgetIds){
    for(int i = 1; i < widgetIds.size(); i++){
      int min = i;

      for(int j = min; j < widgetIds.size(); j++){
        if(widgetIds.get(min).compareToIgnoreCase(widgetIds.get(j)) > 0){
          min = j;
        }
      }

      String temp = widgetIds.get(i);
      widgetIds.set(i, widgetIds.get(min));
      widgetIds.set(min, temp);
    }
  }
}
