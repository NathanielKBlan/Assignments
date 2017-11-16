class FB{
  public static void main(String[] args){
    System.out.println(frontBack("aavJ"));
  }
  public static String frontBack(String str) {
    if(str.length() < 1){
      return str;
    }
    else if(str.length() > 1){
      String original = str;
      str = String.valueOf(str.charAt(str.length() - 1)) + str.substring(1, str.length());
      str = str.substring(0, str.length() - 1 ) + String.valueOf(original.charAt(0));
      return str;
    }
    return str;
  }
}
