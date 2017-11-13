class WM9{
  public static void main(String[] args){
    palindrome("aba");
  }

  static Boolean palindrome(String str){
    String reverseStr = new StringBuilder(str).reverse().toString();
    if(str.equals(reverseStr)){
      System.out.println(reverseStr);
      return true;
    }else{
      return false;
    }
  }
}
