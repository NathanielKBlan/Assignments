import java.awt.*;

public class Circle extends Shape{
  int radius;
  int xCoord;
  int yCoord;
  Color bCColor;
  Color fCColor;
  int value = (int) Math.round(Math.random() * 9) + 1;
  String val = "";


  public Circle(int x, int y, int radius, Color bColor, Color fColor){
    super(x, y, bColor, fColor);
    this.xCoord = x;
    this.yCoord = y;
    this.radius = radius;
    this.bCColor = bColor;
    this.fCColor = fColor;
  }

  public void draw(Graphics2D g){
    val = value + "";
    System.out.println("Drawing a circle");
    g.setColor(fCColor);
    g.fillOval(xCoord, yCoord, radius, radius);
    g.setColor(bCColor);
    g.drawOval(xCoord, yCoord, radius, radius);
    g.drawString(val,xCoord+(radius/2) - 5,yCoord+(radius/2) + 5);
  }
}
