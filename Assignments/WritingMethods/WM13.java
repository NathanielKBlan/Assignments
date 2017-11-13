class WM13{
  public static void main(String[] args){
    upperCase("String", false);
  }

  static String upperCase(String str, Boolean uc){
    if(uc){
      str = str.toUpperCase();
      System.out.println(str);
      return str;
    }else{
      str = str.toLowerCase();
      System.out.println(str);
      return str;
    }
  }
}
