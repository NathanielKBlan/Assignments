class PositiveNegative{
  public static void main(String[] args){
    System.out.println(posNeg(20, -51, true));
  }
  public static boolean posNeg(int a, int b, boolean negative) {
    return (a < 0 && b > 0 && !negative || a > 0 && b < 0 && !negative || negative && a < 0 && b < 0);
  }
}
