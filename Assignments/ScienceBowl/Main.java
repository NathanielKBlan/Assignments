
public class Main{

  public static void main(String[] args) {

    Player aaron = new Player("Aaron", 'M', 120);
    Player jacky = new Player("Jacky", 'M', 70);
    Player tracy = new Player("Tracy", 'F', 80);
    Player john = new Player("John", 'M', 300);
    Player girl = new Player("Girl", 'F', 10);
    Player c = new Player("cee", 'F', 100);
    Player k = new Player("kay", 'm', 120);

    Team a = new Team("Team A");
    Team b = new Team("Team B");

    a.addPlayersToTeam(jacky);
    a.addPlayersToTeam(aaron);
    a.addPlayersToTeam(tracy);
    a.addPlayersToTeam(john);
    a.addPlayersToTeam(girl);
    b.addPlayersToTeam(c);
    b.addPlayersToTeam(k);

    a.displayMembers();
    b.displayMembers();

    System.out.println("Total male players: " + Team.getPlayerCount('M'));
    System.out.println("Total Science Bowl players: " + Player.playerCount);
    System.out.println("Percentage of female players: " + Team.getPercentage('F'));

  }

}
