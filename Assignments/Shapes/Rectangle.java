import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Rectangle extends JPanel{
  int xCoord;
  int yCoord;
  int length;
  int width;
  int red;
  int green;
  int blue;

  public Rectangle(int x, int y, int l, int w, int r, int g, int b){
    this.xCoord = x;
    this.yCoord = y;
    this.length = l;
    this.width = w;
    this.red = r;
    this.green = g;
    this.blue = b;
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    this.setBackground(Color.WHITE);
    g.setColor(new Color(red, green, blue));
    g.fillRect(xCoord, yCoord, length, width);
  }

}
