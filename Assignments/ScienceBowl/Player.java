
public class Player{

  private String name;
  private char gender;
  private int points;
  static int playerCount = 0;

  public Player(String name, char gender, int points){
    this.name = name;
    this.gender = gender;
    this.points = points;
    playerCount++;
  }

  public String getName(){
    return name;
  }

  public char getGender(){
    return gender;
  }

  public int getPoints(){
    return points;
  }


}
