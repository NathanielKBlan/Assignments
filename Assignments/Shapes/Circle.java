import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Circle extends JPanel{
  int xCoord;
  int yCoord;
  int radius;
  int red;
  int green;
  int blue;

  public Circle(int x, int y, int rad, int r, int g, int b){
    this.xCoord = x;
    this.yCoord = y;
    this.radius = rad;
    this.red = r;
    this.green = g;
    this.blue = b;
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    this.setBackground(Color.WHITE);
    g.setColor(new Color(red, green, blue));
    g.fillOval(xCoord, yCoord, radius, radius);
  }
}
