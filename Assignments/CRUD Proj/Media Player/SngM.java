import java.util.Scanner;
import java.util.ArrayList;

public class SngM{

  ArrayList<Song> songs = new ArrayList<Song>();
  Boolean exit = false;
  Scanner sc;

  public SngM(){
    sc = new Scanner(System.in);
    Song[] defaultSongs = {new Song("It's Quiet Uptown"), new Song("ABBA", "S.O.S", 1.00), new Song("Crosswords")};
    for(int i = 0; i < defaultSongs.length; i++){
        songs.add(defaultSongs[i]);
    }
  }

  public void alphabeticalSelectionSort(ArrayList<Song> s){
    for(int i = 0; i < s.size(); i++){
      int min = i;

      for(int j = min; j < s.size(); j++){
        if(s.get(min).name.compareToIgnoreCase(s.get(j).name) > 0){
          min = j;
        }
      }

      Song temp = s.get(i);
      s.set(i, s.get(min));
      s.set(min, temp);
    }
  }

  public void displayMenu(){
    alphabeticalSelectionSort(songs);
    System.out.println("-----------------------------");
    System.out.println("1. List Songs");
    System.out.println("2. Add Song");
    System.out.println("3. Delete Song");
    System.out.println("4. Edit Song");
    System.out.println("5. Back to Main Menu");
  }

  public void listSongs(){
    for(int i = 0; i < songs.size(); i++){
      System.out.println(songs.get(i).name);
    }
  }

  public void addSong(){

    System.out.println("Please input the name of the song.");
    String name = sc.nextLine();
    if(!songs.contains(name)){
      System.out.println("Do you know the artist or cost? If you do please type yes");
      String r = sc.nextLine().toUpperCase();
      if(r.equals("YES")){
        int selection = sc.nextInt();
        System.out.println("1. I know both.");
        System.out.println("2. Just the artist.");
        System.out.println("3. Just the cost.");
        if(selection == 1){
          System.out.println("Please input the artist name.");
          //sc.nextLine();
          String artist = sc.nextLine();
          //sc.nextLine();
          System.out.println("Please input the cost in USD");
          Double cost = sc.nextDouble();
          songs.add(new Song(artist, name, cost));
        }
        //sc.nextLine();
        if(selection == 2){
          System.out.println("Please input the artist name.");
          songs.add(new Song(sc.nextLine(), name));
        }
        //sc.nextLine();
        if(selection == 3){
          System.out.println("Please input the cost in USD");
          songs.add(new Song(name, sc.nextDouble()));
        }
      }else{
        songs.add(new Song(name));
      }
    }else{
      System.out.println("You already have that song.");
    }
  }

  public void removeSong(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input the name of the song you want removed.");
    String name = sc.nextLine();
    if(songs.contains(name)){
      songs.remove(songs.indexOf(name));
    }else{
      System.out.println("That song isn't there.");
    }
  }

  public void editSong(){
    boolean foundSong = false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input the name of the song you want to edit.");
    String name = sc.nextLine();
    System.out.println("Which would you like to edit?");
    System.out.println("1. Name");
    System.out.println("2. Artist");
    System.out.println("3. Cost");
    System.out.println("4. All of the above");
    int selection = sc.nextInt();
    sc.nextLine();
    if(selection == 1){
      for(Song s : songs){
        if(s.name.equals(name)){
          int i = songs.indexOf(s);
          String sName = getString("Input the name of the song.");
          songs.set(i, new Song(songs.get(i).artist, sName, songs.get(i).costUSD));
          System.out.println(sName);
          foundSong = true;
          break;
        }
      }
      if(!foundSong){
        System.out.println("That song isn't there. If you want to add a new one type yes.");
        if(sc.next().toUpperCase().equals("YES")){
          addSong();
        }
      }
    }
    if(selection == 2){
      System.out.println("Please type the name of the artist");
      String artist = sc.nextLine();
      if(songs.contains(artist)){
        int i = songs.indexOf(artist);
        System.out.println("Please input the new name of the song.");
        songs.set(i, new Song(sc.nextLine(), songs.get(i).name, songs.get(i).costUSD));
      }else{
        System.out.println("That artist isn't there. If you want to add a new song with the artist type yes.");
        if(sc.next().toUpperCase().equals("YES")){
          addSong();
        }
      }
    }
  }

  public void getUserAction(){
    while(!exit){
      Scanner sc = new Scanner(System.in);
      int s = sc.nextInt();
      if(s == 1){
        listSongs();
        displayMenu();
      }
      if(s == 2){
        addSong();
        displayMenu();
      }
      if(s == 3){
        removeSong();
        displayMenu();
      }
      if(s == 4){
        editSong();
        displayMenu();
      }
      if(s == 5){
        exit = true;
      }
    }

  }

  public String getString(String m) {
    System.out.println(m);
    return sc.nextLine();
  }

    public double getDouble(String m) {
      System.out.println(m);
      return sc.nextDouble();
    }
}
