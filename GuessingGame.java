import javax.swing.JOptionPane;
import javax.swing.JFrame;

class GuessingGame{
  static int myNumber = (int) Math.round(Math.random() * 100);
  static JFrame frame = new JFrame();

  public static void main(String[] args){
    System.out.println(myNumber);
    int x = Integer.parseInt(JOptionPane.showInputDialog(frame, "Type in a number."));
    System.out.println(x);
    while(x != myNumber){
      if(x > myNumber){
        x = Integer.parseInt(JOptionPane.showInputDialog(frame, "Your number is too big. Try again."));
        System.out.println(x);
      }
      if(x < myNumber){
        x = Integer.parseInt(JOptionPane.showInputDialog(frame, "Your number is too small. Try again."));
        System.out.println(x);
      }
    }
    JOptionPane.showMessageDialog(frame, "You are correct");
    System.exit(0);
  }
}
