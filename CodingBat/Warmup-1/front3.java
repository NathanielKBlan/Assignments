class front3{
  public static void main(String[] args){
    System.out.println(front3("String"));
  }
  public static String front3(String str){
    if (str.length() < 3)
      str = str + str + str;
    else
      str = str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
    return str;
  }
}
