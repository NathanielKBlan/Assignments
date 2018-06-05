import java.util.Scanner;
import java.util.ArrayList;

public class VidM{

  ArrayList<Video> Videos = new ArrayList<Video>();
  Boolean exit = false;
  Scanner sc;

  public VidM(){
    sc = new Scanner(System.in);
    Video[] defaultVideos = {new Video("It's Quiet Uptown"), new Video("ABBA", "S.O.S", 1.00), new Video("Crosswords")};
    for(int i = 0; i < defaultVideos.length; i++){
        Videos.add(defaultVideos[i]);
    }
  }

  public void alphabeticalSelectionSort(ArrayList<Video> s){
    for(int i = 0; i < s.size(); i++){
      int min = i;

      for(int j = min; j < s.size(); j++){
        if(s.get(min).title.compareToIgnoreCase(s.get(j).title) > 0){
          min = j;
        }
      }

      Video temp = s.get(i);
      s.set(i, s.get(min));
      s.set(min, temp);
    }
  }

  public void displayMenu(){
    alphabeticalSelectionSort(Videos);
    System.out.println("-----------------------------");
    System.out.println("1. List Videos");
    System.out.println("2. Add Video");
    System.out.println("3. Delete Video");
    System.out.println("4. Edit Video");
    System.out.println("5. Back to Main Menu");
  }

  public void listVideos(){
    for(int i = 0; i < Videos.size(); i++){
      System.out.println(Videos.get(i).title);
    }
  }

  public void addVideo(){

    System.out.println("Please input the title of the Video.");
    String title = sc.nextLine();
    if(!Videos.contains(title)){
      System.out.println("Do you know the producer or cost? If you do please type yes");
      String r = sc.nextLine().toUpperCase();
      if(r.equals("YES")){
        int selection = sc.nextInt();
        System.out.println("1. I know both.");
        System.out.println("2. Just the producer.");
        System.out.println("3. Just the cost.");
        if(selection == 1){
          System.out.println("Please input the producer title.");
          //sc.nextLine();
          String producer = sc.nextLine();
          //sc.nextLine();
          System.out.println("Please input the cost in USD");
          Double cost = sc.nextDouble();
          Videos.add(new Video(producer, title, cost));
        }
        //sc.nextLine();
        if(selection == 2){
          System.out.println("Please input the producer title.");
          Videos.add(new Video(sc.nextLine(), title));
        }
        //sc.nextLine();
        if(selection == 3){
          System.out.println("Please input the cost in USD");
          Videos.add(new Video(title, sc.nextDouble()));
        }
      }else{
        Videos.add(new Video(title));
      }
    }else{
      System.out.println("You already have that Video.");
    }
  }

  public void removeVideo(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input the title of the Video you want removed.");
    String title = sc.nextLine();
    if(Videos.contains(title)){
      Videos.remove(Videos.indexOf(title));
    }else{
      System.out.println("That Video isn't there.");
    }
  }

  public void editVideo(){
    boolean foundVideo = false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input the title of the Video you want to edit.");
    String title = sc.nextLine();
    System.out.println("Which would you like to edit?");
    System.out.println("1. title");
    System.out.println("2. producer");
    System.out.println("3. Cost");
    System.out.println("4. All of the above");
    int selection = sc.nextInt();
    sc.nextLine();
    if(selection == 1){
      for(Video s : Videos){
        if(s.title.equals(title)){
          int i = Videos.indexOf(s);
          String stitle = getString("Input the title of the Video.");
          Videos.set(i, new Video(Videos.get(i).producer, stitle, Videos.get(i).costUSD));
          System.out.println(stitle);
          foundVideo = true;
          break;
        }
      }
      if(!foundVideo){
        System.out.println("That Video isn't there. If you want to add a new one type yes.");
        if(sc.next().toUpperCase().equals("YES")){
          addVideo();
        }
      }
    }
    if(selection == 2){
      System.out.println("Please type the title of the producer");
      String producer = sc.nextLine();
      if(Videos.contains(producer)){
        int i = Videos.indexOf(producer);
        System.out.println("Please input the new title of the Video.");
        Videos.set(i, new Video(sc.nextLine(), Videos.get(i).title, Videos.get(i).costUSD));
      }else{
        System.out.println("That producer isn't there. If you want to add a new Video with the producer type yes.");
        if(sc.next().toUpperCase().equals("YES")){
          addVideo();
        }
      }
    }
  }

  public void getUserAction(){
    while(!exit){
      Scanner sc = new Scanner(System.in);
      int s = sc.nextInt();
      if(s == 1){
        listVideos();
        displayMenu();
      }
      if(s == 2){
        addVideo();
        displayMenu();
      }
      if(s == 3){
        removeVideo();
        displayMenu();
      }
      if(s == 4){
        editVideo();
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
