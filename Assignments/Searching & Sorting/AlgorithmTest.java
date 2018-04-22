import java.util.Arrays;

public class AlgorithmTest{

    static StringGenerator sg = new StringGenerator();

    public static void main(String[] args) {

      int arrLength = (int) Math.round(Math.random() * 250) + 1;
      int[] testArray = new int[250];

      randomFill(testArray);

      selectionSort(testArray);

      int[] testArray2 = testArray;

      sort(testArray2);

      String[] strings = sg.generate();
      String[] testStrings = {"xwy", "axz", "azc"};
      String[] stringsTwo = sg.generate();
      String[] stringsThree = sg.generate();
      String[] stringsFour = sg.generate();

      alphabeticalInsertionSort(strings);
      alphabeticalBubbleSort(stringsTwo);
      alphabeticalArraysSort(stringsThree);
      alphabeticalSelectionSort(stringsFour);

      printStringArray(strings);
      printStringArray(stringsTwo);
      printStringArray(stringsThree);
      printStringArray(stringsFour);

    }

    public static void randomFill(int[] arr){
      for(int i = 0; i < arr.length; i++){
        arr[i] = (int) Math.round(Math.random() * 1000) + 0;
      }
    }

    public static void selectionSort(int[] arr){
      long startTime = System.nanoTime();
      System.out.print("| ");
      for(int i = 0; i < arr.length; i++){
        int min = i;

        for(int j = min; j < arr.length; j++){
          if(arr[min] > arr[j]){
            min = j;
          }
        }

        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
      }
      long endTime = System.nanoTime();
      System.out.println("Selection Sort Time: " + (double) (endTime - startTime)/1000000 + " ms" );
    }

    public static void sort(int[] arr){
        long startTime = System.nanoTime();
        Arrays.sort(arr);
        long endTime = System.nanoTime();
        System.out.println("Sort Method Time: " + (double) (endTime - startTime)/1000000 + " ms" );
    }

    public static void alphabeticalArraysSort(String[] arr){
        long startTime = System.nanoTime();
        Arrays.sort(arr);
        long endTime = System.nanoTime();
        System.out.println("Alphabetical Arrays.Sort Method Time: " + (double) (endTime - startTime)/1000000 + " ms" );
    }

    public static void alphabeticalBubbleSort(String[] arr){
      long startTime = System.nanoTime();
      for(int a = arr.length - 1; a > 1; a--){
        for(int b = 0; b < a; b++){
          if(arr[b].compareToIgnoreCase(arr[b + 1]) > 0){
            String temp = arr[b];
            arr[b] = arr[b + 1];
            arr[b + 1] = temp;
          }
        }
      }
      long endTime = System.nanoTime();
      System.out.println("Alphabetical Bubble Sort Method Time: " + (double) (endTime - startTime)/1000000 + " ms" );
    }

    public static void alphabeticalInsertionSort(String[] arr){
      long startTime = System.nanoTime();
      for(int a = 1; a < arr.length; a++){
        int b = a;
        String insertString = arr[a];

        while((b > 0) && (arr[b - 1].compareToIgnoreCase(insertString) > 0)){
          arr[b] = arr[b - 1];
          b--;
        }

        arr[b] = insertString;
      }
      long endTime = System.nanoTime();
      System.out.println("Alphabetical Insertion Sort Method Time: " + (double) (endTime - startTime)/1000000 + " ms" );
    }

    public static void alphabeticalSelectionSort(String[] arr){
      long startTime = System.nanoTime();
      for(int a = 0; a < arr.length; a++){
        int min = a;

        for(int b = min; b < arr.length; b++){
          if(arr[min].compareToIgnoreCase(arr[b]) > 0){
            min = b;
          }
        }

        String temp = arr[a];
        arr[a] = arr[min];
        arr[min] = temp;
      }
      long endTime = System.nanoTime();
      System.out.println("Alphabetical Selection Sort Method Time: " + (double) (endTime - startTime)/1000000 + " ms" );
    }



    public static void printStringArray(String[] arr){
      System.out.println("\n");
      System.out.print("| ");
      for(int x = 0; x < arr.length; x++){
        System.out.print(arr[x] + " | ");
      }
    }

    public static void alphabeticalMergeSort(String[] arr, int midIndex){
      static int groups = 1;

      if((midIndex + 1) % 2 != 0){

      }
      else{
        midIndex = (int) (midIndex) / 2;
        groups++;
        alphabeticalMergeSort(arr, midIndex);
      }
    }

    public static void alphabeticalMerge(String[] arr){
        for(int i = groups; i > 1; i--){
          
        }
    }
}
