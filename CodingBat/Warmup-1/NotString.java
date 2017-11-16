class NotString{
  public static void main(String[] args){
    System.out.println(notString("a value"));
    System.out.println(value(10, 15) + " This is my value");
  }
  public static String notString(String str) {
    if(str.startsWith("not") || str.startsWith("Not"))
      return str;
    else
      return "Not " + str;
  }
  public static int value(int a, int b){
    return a + b;
  }
}
