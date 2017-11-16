class BackAround{
  public static void main(String[] args){
    System.out.println(backAround("word"));
  }
  public static String backAround(String str) {
    char a = str.charAt(str.length() - 1);
    str = a + str + a;
    return str;
  }
}
