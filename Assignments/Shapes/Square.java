import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Square extends JPanel{
  int xCoord;
  int yCoord;
  int side;
  int red;
  int green;
  int blue;

  public Square(int x, int y, int s, int r, int g, int b){
    this.xCoord = x;
    this.yCoord = y;
    this.side = s;
    this.red = r;
    this.green = g;
    this.blue = b;
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    this.setBackground(Color.WHITE);
    g.setColor(new Color(red, green, blue));
    g.fillRect(xCoord, yCoord, side, side);
  }
}
