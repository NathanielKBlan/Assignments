import java.awt.*;

public class Circle extends Shape{
  int radius;
  int xCoord;
  int yCoord;
  Color bCColor;
  Color fCColor;

  public Circle(int x, int y, int radius, Color bColor, Color fColor){
    super(x, y, bColor, fColor);
    this.xCoord = x;
    this.yCoord = y;
    this.radius = radius;
    this.bCColor = bColor;
    this.fCColor = fColor;
  }

  public void draw(Graphics2D g){
    System.out.println("Drawing a circle");
    g.setColor(fCColor);
    g.fillOval(xCoord, yCoord, radius, radius);
    g.drawOval(xCoord, yCoord, radius, radius);
  }
}
