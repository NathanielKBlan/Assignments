import javax.swing.*;

public class Main{

  public static void main(String[] args) {

    JFrame frame = new JFrame("Fun with shapes!");

    Rectangle rect = new Rectangle(100, 100, 30, 60, 100, 172, 213);

    for(int i = 0; i < 10; i++){
      for(int j= 0; j < 10; j++){
        rect = new Rectangle(i+40, j+40, 30, 30, 100, 172, 213);
        frame.setContentPane(rect);
      }
    }
    //rect.draw();

    Square sq = new Square(300, 300, 50, 123, 21, 211);
    //sq.draw();

    Circle cl = new Circle(300, 300, 100, 210, 51, 25);
    //c1.draw();
    //GraphicsPanel content = new GraphicsPanel();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setLocation(120,70);
    frame.setVisible(true);

  }

}
