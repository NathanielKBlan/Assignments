import javax.swing.JOptionPane;
import javax.swing.JFrame;

class ChineseHoroscope{

  static int year;

  public static void main(String[] args){
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    String birthYear = JOptionPane.showInputDialog("Enter the year of your birth.");

    year = Integer.parseInt(birthYear);

    if(year % 12 == 4){
      JOptionPane.showMessageDialog(frame, "You are a rat!");
    }
    if(year % 12 == 5){
      JOptionPane.showMessageDialog(frame, "You are an ox!");
    }
    if(year % 12 == 6){
      JOptionPane.showMessageDialog(frame, "You are a tiger!");
    }
    if(year % 12 == 7){
      JOptionPane.showMessageDialog(frame, "You are a rabbit!");
    }
    if(year % 12 == 8){
      JOptionPane.showMessageDialog(frame, "You are a dragon!");
    }
    if(year % 12 == 9){
      JOptionPane.showMessageDialog(frame, "You are a snake!");
    }
    if(year % 12 == 10){
      JOptionPane.showMessageDialog(frame, "You are a horse!");
    }
    if(year % 12 == 11){
      JOptionPane.showMessageDialog(frame, "You are a goat!");
    }
    if(year % 12 == 0){
      JOptionPane.showMessageDialog(frame, "You are a monkey!");
    }
    if(year % 12 == 1){
      JOptionPane.showMessageDialog(frame, "You are a rooster!");
    }
    if(year % 12 == 2){
      JOptionPane.showMessageDialog(frame, "You are a dog!");
    }
    if(year % 12 == 3){
      JOptionPane.showMessageDialog(frame, "You are a pig!");
    }

    System.exit(0);
  }
}
