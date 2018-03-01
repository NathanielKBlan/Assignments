
public class PopularCollection{

    public static void main(String[] args){

      String[] rpgMods = {"Thomas the Tank Engine", "Lightsabers", "Nathaniel's Epic Quest Line"};
      String[] platformerMods = {"Waluigi's Mod", "Super Bowser Mod"};

      RPG skyrim2 = new RPG("Skyrim2", "Bethestda", "Xbox & PC");
      Platformer marioBrothers = new Platformer("Mario Bros.", "Nintendo", "WiiU");

      skyrim2.setMods(rpgMods);
      skyrim2.setPlayers(51);
      skyrim2.displayWelcomeMessage();
      skyrim2.displayMods();

      marioBrothers.setMods(platformerMods);
      marioBrothers.setPlayers(1);
      marioBrothers.displayWelcomeMessage();
      marioBrothers.displayMods();
    }
}
