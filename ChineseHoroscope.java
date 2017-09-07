import javax.swing.JOptionPane;
import javax.swing.JFrame;

class ChineseHoroscope{

  static int year;

  public static void main(String[] args){
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    String birthYear = JOptionPane.showInputDialog("Enter the year of your birth.");

    year = Integer.parseInt(birthYear);

    String message = "";

    switch (year % 12) {
      case 4:
      message = "You are a rat!";
      break;
      case 5:
      message = "You are an ox!";
      break;
      case 6:
      message = "You are a tiger!";
      break;
      case 7:
      message = "You are a rabbit!";
      break;
      case 8:
      message = "You are a dragon!";
      break;
      case 9:
      message = "You are a snake!";
      break;
      case 10:
      message = "You are a horse!";
      break;
      case 11:
      message = "You are a goat!";
      break;
      case 0:
      message = "You are a monkey!";
      break;
      case 1:
      message = "You are a rooster!";
      break;
      case 2:
      message = "You are a dog!";
      break;
      case 3:
      message = "You are a pig!";
      break;
    }

    JOptionPane.showMessageDialog(frame, message);
    System.exit(0);
  }
}
