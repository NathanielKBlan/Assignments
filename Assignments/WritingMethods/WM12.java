class WM12{
  public static void main(String[] args){
    replacement("This is a string", 'i');
  }

  static String replacement(String str, char a){
    String strR = str.replace(String.valueOf(a), "");
    System.out.println(strR);
    return strR;
  }
}
