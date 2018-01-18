import javax.swing.*;

public class Main{

  public static void main(String[] args) {

    JFrame frame = new JFrame("Fun with shapes!");

    Rectangle rect = new Rectangle(100, 100, 150, 200, 100, 172, 213);

    Square sq = new Square(300, 300, 50, 123, 21, 211);

    Circle cl = new Circle(300, 300, 100, 210, 51, 25);
    //GraphicsPanel content = new GraphicsPanel();

    frame.setContentPane(cl);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setLocation(120,70);
    frame.setVisible(true);

  }

}
