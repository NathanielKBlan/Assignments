import java.util.*;

public class Team{

  private String teamName;
  static int totalMales = 0;
  static int totalFemales = 0;
  static int totalMembers = 0;
  ArrayList<Player> players = new ArrayList<Player>();

  public Team(String teamName){
    this.teamName = teamName;
  }

  public void addPlayersToTeam(Player player){
    players.add(player);
    if(player.getGender() == 'M'){
      totalMales++;
      totalMembers++;
    }else{
      totalFemales++;
      totalMembers++;
    }
  }

  static int getPlayerCount(char gender){
    if(gender == 'M' || gender == 'm'){
      return totalMales;
    }else{
      return totalFemales;
    }
  }

  static double getPercentage(char gender){
    if(gender == 'M' || gender == 'm'){
      return ((double)totalMales / getTotalMembers()) * 100;
    }else{
      return ((double)totalFemales / getTotalMembers()) * 100;
    }
  }

  static int getTotalMembers(){
    return totalMembers;
  }

  public void displayMembers(){
    System.out.print(teamName + ": ");
    for(Player p: players){
      System.out.print(p.getName() + " ");
    }
    System.out.println();
  }
}
