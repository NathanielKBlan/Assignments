
class ParrotTrouble{
  public static void main(String args[]){
    System.out.println("We are in trouble: " + parrotTrouble(true, 15));
  }
  public static boolean parrotTrouble(boolean talking, int hour) {
    if(hour < 7 && talking || hour > 20 && talking){
      return true;
    }else{
      return false;
    }
  }
}
