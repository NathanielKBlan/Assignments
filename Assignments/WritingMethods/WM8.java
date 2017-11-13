class WM8{
  public static void main(String[] args){
    output("this is string 1", "string 2");
  }

  static void output(String str1, String str2){
    if(str1.length() > str2.length()){
      System.out.println(str1 + " is longer than: " + str2);
    }
    if(str2.length() > str1.length()){
      System.out.println(str2 + " is longer than: " + str1);
    }
    if(str1.length() == str2.length()){
      System.out.println(str1 + " and " + str2 + " are equal in length.");
    }
  }
}
