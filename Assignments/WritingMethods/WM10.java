class WM10{
  public static void main(String[] agrs){
    numOfSpaces("Hello this is a string");
  }

  static int numOfSpaces(String str){
    int count = 0;
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == ' '){
        count++;
      }
    }
    System.out.println(count);
    return count;
  }
}
