class WM2{
  public static void main(String[] args){
    fullName("Nathaniel", "Blanquel");
  }

  static String fullName(String firstName, String lastName){
    System.out.println(firstName + " " + lastName);
    return firstName = firstName + " " + lastName;
  }
}
