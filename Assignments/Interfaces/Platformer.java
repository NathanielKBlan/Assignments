
public class Platformer extends Game implements Moddable, Multiplayer{

  private int lives = 2;
  private int players;
  private final int requiredPlayers = 2;
  private String[] mods;

  public Platformer(String name, String studio, String platform){
    super.name = name;
    super.studio = studio;
    super.platform = platform;
  }

  public void setMods(String[] mods){
    this.mods = mods;
  }

  public void displayMods(){
    System.out.println("----- " + super.name + " Mods -----");
    for(int i = 0; i <= mods.length - 1; i++){
      System.out.println(mods[i]);
    }
    System.out.println("----------------");
  }

  public void setPlayers(int p){
    players = p;
  }

  public int getPlayers(){
    return players;
  }

  public void displayWelcomeMessage(){
    if(players < requiredPlayers){
      System.out.println("==========================================================================");
      System.out.println("In order to play multiplayer, you must have at least " + requiredPlayers + " players logged on.");
      System.out.println("==========================================================================");
    }else{
      System.out.println("==========================================================================");
      System.out.println("Welcome to Nate's server!");
      System.out.println("==========================================================================");
    }
  }
  public void collectLife(){
    lives++;
  }

}
