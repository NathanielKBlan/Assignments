import java.util.Scanner;
import java.util.InputMismatchException;

public class MainMenu{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Boolean exit = false;

    displayMainMenu();

    while(!exit){

      int selection = sc.nextInt();

      if(selection == 1){
        PhtM pm = new PhtM();
        pm.displayMenu();
      }

      if(selection == 2){
        SngM sg = new SngM();
        sg.displayMenu();
        sg.getUserAction();
        displayMainMenu();
      }

      if(selection == 3){
        VidM vm = new VidM();
        vm.displayMenu();
      }

      if(selection == 4){
        exit = true;
      }else{
        System.out.println("Please type in a number of any of the displayed options.");
      }
    }
  }

  public static void displayMainMenu(){
    System.out.println("What do you want to do?");
    System.out.println("1. Photos");
    System.out.println("2. Songs");
    System.out.println("3. Videos");
    System.out.println("4. Exit");
  }
}
