class WM11{
  public static void main(String[] args){
    occurences("This be my string", 'i');
  }

  static int occurences(String str, char a){
    int count = 0;
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == a){
        count++;
      }
    }
    System.out.println(count);
    return count;
  }
}
