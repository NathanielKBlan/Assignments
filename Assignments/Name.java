import javax.swing.JOptionPane;
import javax.swing.JFrame;

class Name{
  public static void main(String[] args){
    int sL;
    String name;
    String firstName;
    String lastName;
    JFrame frame = new JFrame();

    name = JOptionPane.showInputDialog("Please enter your first and lat name:");
    sL = name.indexOf(" ");
    firstName = name.substring(0, sL);
    lastName = name.substring(sL + 1, name.length());
    JOptionPane.showMessageDialog(frame, "Your first name is " + firstName + " which has " + firstName.length() + " characters." + "\nYour last name is " + lastName + " which has " + lastName.length() + " characters." + "\nYour initials are " + firstName.charAt(0) + lastName.charAt(0));
    System.exit(0);
  }
}
