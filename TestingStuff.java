class TestingStuff{
  public static void main(String[] args) {
    recombine("apple", "pear");
  }
  public static void recombine(String s1, String s2){

      if(s1.length() % 2 == 0 && s2.length() % 2 == 0){

         s1 = s1.substring(0, s1.length()/2) + s2.substring(s1.length()/2, s2.length() - 1);
         System.out.println(s1);

      }else{

         s1 = s1.substring(0, s1.length()/2 - 1) + s2.substring(s1.length()/2 + 1, s2.length() - 1);
         System.out.println(s1);

      }

   }
}
