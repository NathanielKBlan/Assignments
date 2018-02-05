import java.util.*;

public class CheckInput{

   static int num1;

   static int num2;

   static double answer;

   static Scanner sc = new Scanner(System.in);

   public static void main(String[] args){

      checkForIntegerException();

   }

   public static void checkForIntegerException(){

            System.out.println("Please type in a number.");

            try{


                 num1 = sc.nextInt();

                 System.out.println("Plase type your second number.");

                 num2 = sc.nextInt();


                 answer = checkForArithmeticException(num1, num2);

                 System.out.println(answer);


            } catch (InputMismatchException e){

              System.out.println("You didn't type in a number. Try it again.");

            }

            //checkForIntegerException();

   }

   public static double checkForArithmeticException(int a, int b){
         double i = 1;

         try{

              i = (double) a/b;


         } catch (ArithmeticException e){

               System.out.println("Can't divide by 0.");

         }

         return i;

   }

}
