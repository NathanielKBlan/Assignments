
public class Sorts{

  public static void main(String[] args) {

    int[] numbers = {5, 27, 5, 17, 19 , 35, 79};
    insertionSort(numbers);

    System.out.print("| ");
    for(int i = 0; i < numbers.length; i++){
      System.out.print(numbers[i] + " | ");
    }

  }

  public static void bubbleSort(int[] arr){

      for(int i = arr.length - 1; i > 1; i--){
        for(int j = 0; j < i; j++){
          if(arr[j] > arr[j + 1]){

            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;

          }
        }
      }

      System.out.print("| ");
      for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " | ");
      }
  }

  public static void binarySearchForValue(int val, int[] arr){

    bubbleSort(arr);

    int lowIndex = 0;
    int highIndex = arr.length - 1;

    while(lowIndex <= highIndex){

      int middleIndex = (highIndex + lowIndex) / 2;

      if(arr[middleIndex] < val)
        lowIndex = middleIndex + 1;
      else if(arr[middleIndex] > val)
        highIndex = middleIndex - 1;
      else{
        System.out.println("Found a match for " + val  + " at index " + middleIndex);
        lowIndex = highIndex + 1;
      }
    }
  }

  public static void selectionSort(int[] arr){
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

      System.out.print(arr[i] + " | ");
    }
  }

  public static void insertionSort(int[] arr){
    for(int i = 1; i < arr.length; i++){
      int j = i;
      int toInsert = arr[i];

      while((j > 0) && (arr[j - 1] > toInsert)){
        arr[j] = arr[j - 1];
        j--;
      }

      arr[j] = toInsert;
    }
  }
}
