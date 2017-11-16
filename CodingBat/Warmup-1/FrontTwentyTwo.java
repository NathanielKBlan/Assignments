class FrontTwentyTwo{
  public static void main(String[] args){
    System.out.println(front22("This is a string."));
  }
  public static String front22(String str){
    if(str.length() < 2)
      str = str + str + str;
    else
      str = str.substring(0, 2) + str + str.substring(0, 2);
    return str;
  }
}
