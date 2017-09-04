import javax.swing.JOptionPane;
import javax.swing.JFrame;

class GuessingGame{
  static int myNumber = (int) Math.round(Math.random() * 100);
  static JFrame frame = new JFrame();

  public static void main(String[] args){
    int x = Integer.parseInt(JOptionPane.showInputDialog(frame, "Type in a number."));
    while(x > myNumber){
      x = Integer.parseInt(JOptionPane.showInputDialog(frame, "Your number is too big. Try again."));
    }
    while(x < myNumber){
      x = Integer.parseInt(JOptionPane.showInputDialog(frame, "Your number is too small. Try again."));
    }
    JOptionPane.showMessageDialog(frame, "You are correct");
    System.exit(0);
  }
}
