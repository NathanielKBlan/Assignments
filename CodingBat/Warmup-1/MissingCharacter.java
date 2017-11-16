class MissingCharacter{
  public static void main(String args[]){
    System.out.println(missingChar("My name is SHAKE ZULA", 4));
  }
  public static String missingChar(String str, int n){
    str = str.replace(String.valueOf(str.charAt(n)), "");
    return str;
  }
}
