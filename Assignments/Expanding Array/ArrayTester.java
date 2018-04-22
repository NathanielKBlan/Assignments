public class ArrayTester{

    static int count = 100;

    public static void main(String[] args){

        ExpandingArray arr = new ExpandingArray();

        for(int i = 0; i < count; i++){
            System.out.println("adding " + i);
            arr.add(i);
        }

        remove(1, arr);
        remove(9, arr);

        for(int i = 0; i < count; i++){
            System.out.println(arr.get(i));
        }
    }

    public static void remove(int index, ExpandingArray arr){
      arr.remove(index);
      count--;
    }
}
