
public class Main{

  public static void main(String[] args) {
    String m = "this is a message";
    Encryptor en = new Encryptor();
    m = en.encrypt(m);
    System.out.println(m);
    m = en.decrypt(m);
    System.out.println(m);
  }

}
