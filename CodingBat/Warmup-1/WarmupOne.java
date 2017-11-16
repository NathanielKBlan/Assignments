
class WarmupOne{
  public static void main(String[] args){
    System.out.println("sleepIn is: " + sleepIn(true, false));
  }
  public static boolean sleepIn(boolean weekday, boolean vacation) {
      if(!weekday || vacation){
          return true;
        }
      return false;
  }
}
