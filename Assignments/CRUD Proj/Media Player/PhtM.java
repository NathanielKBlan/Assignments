import java.util.Scanner;
import java.util.ArrayList;

public class PhtM{

  ArrayList<Photo> photos = new ArrayList<Photo>();
  Boolean exit = false;
  Scanner sc;

  public PhtM(){
    sc = new Scanner(System.in);
    Photo[] defaultPhotos = {new Photo("It's Quiet Uptown"), new Photo("ABBA", "S.O.S", 1.00), new Photo("Crosswords")};
    for(int i = 0; i < defaultPhotos.length; i++){
        Photos.add(defaultPhotos[i]);
    }
  }

  public void alphabeticalSelectionSort(ArrayList<Photo> s){
    for(int i = 0; i < s.size(); i++){
      int min = i;

      for(int j = min; j < s.size(); j++){
        if(s.get(min).length.compareToIgnoreCase(s.get(j).length) > 0){
          min = j;
        }
      }

      Photo temp = s.get(i);
      s.set(i, s.get(min));
      s.set(min, temp);
    }
  }

  public void displayMenu(){
    alphabeticalSelectionSort(Photos);
    System.out.println("-----------------------------");
    System.out.println("1. List Photos");
    System.out.println("2. Add Photo");
    System.out.println("3. Delete Photo");
    System.out.println("4. Edit Photo");
    System.out.println("5. Back to Main Menu");
  }

  public void listPhotos(){
    for(int i = 0; i < Photos.size(); i++){
      System.out.println(Photos.get(i).length);
    }
  }

  public void addPhoto(){

    System.out.println("Please input the length of the Photo.");
    String length = sc.nextLine();
    if(!Photos.contains(length)){
      System.out.println("Do you know the width or dimension? If you do please type yes");
      String r = sc.nextLine().toUpperCase();
      if(r.equals("YES")){
        int selection = sc.nextInt();
        System.out.println("1. I know both.");
        System.out.println("2. Just the width.");
        System.out.println("3. Just the dimension.");
        if(selection == 1){
          System.out.println("Please input the width length.");
          //sc.nextLine();
          String width = sc.nextLine();
          //sc.nextLine();
          System.out.println("Please input the dimension in USD");
          Double dimension = sc.nextDouble();
          Photos.add(new Photo(width, length, dimension));
        }
        //sc.nextLine();
        if(selection == 2){
          System.out.println("Please input the width length.");
          Photos.add(new Photo(sc.nextLine(), length));
        }
        //sc.nextLine();
        if(selection == 3){
          System.out.println("Please input the dimension in USD");
          Photos.add(new Photo(length, sc.nextDouble()));
        }
      }else{
        Photos.add(new Photo(length));
      }
    }else{
      System.out.println("You already have that Photo.");
    }
  }

  public void removePhoto(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input the length of the Photo you want removed.");
    String length = sc.nextLine();
    if(Photos.contains(length)){
      Photos.remove(Photos.indexOf(length));
    }else{
      System.out.println("That Photo isn't there.");
    }
  }

  public void editPhoto(){
    boolean foundPhoto = false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input the length of the Photo you want to edit.");
    String length = sc.nextLine();
    System.out.println("Which would you like to edit?");
    System.out.println("1. length");
    System.out.println("2. width");
    System.out.println("3. dimension");
    System.out.println("4. All of the above");
    int selection = sc.nextInt();
    sc.nextLine();
    if(selection == 1){
      for(Photo s : Photos){
        if(s.length.equals(length)){
          int i = Photos.indexOf(s);
          String slength = getString("Input the length of the Photo.");
          Photos.set(i, new Photo(Photos.get(i).width, slength, Photos.get(i).dimensionUSD));
          System.out.println(slength);
          foundPhoto = true;
          break;
        }
      }
      if(!foundPhoto){
        System.out.println("That Photo isn't there. If you want to add a new one type yes.");
        if(sc.next().toUpperCase().equals("YES")){
          addPhoto();
        }
      }
    }
    if(selection == 2){
      System.out.println("Please type the length of the width");
      String width = sc.nextLine();
      if(Photos.contains(width)){
        int i = Photos.indexOf(width);
        System.out.println("Please input the new length of the Photo.");
        Photos.set(i, new Photo(sc.nextLine(), Photos.get(i).length, Photos.get(i).dimensionUSD));
      }else{
        System.out.println("That width isn't there. If you want to add a new Photo with the width type yes.");
        if(sc.next().toUpperCase().equals("YES")){
          addPhoto();
        }
      }
    }
  }

  public void getUserAction(){
    while(!exit){
      Scanner sc = new Scanner(System.in);
      int s = sc.nextInt();
      if(s == 1){
        listPhotos();
        displayMenu();
      }
      if(s == 2){
        addPhoto();
        displayMenu();
      }
      if(s == 3){
        removePhoto();
        displayMenu();
      }
      if(s == 4){
        editPhoto();
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
