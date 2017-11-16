class CloseToHundred{
  public static void main(String[] args){
    System.out.println(nearHundred(101));
  }
  public static boolean nearHundred(int n) {
    return ( n >= 90 && n <= 110 || n >= 190 && n <= 210);
  }
}
