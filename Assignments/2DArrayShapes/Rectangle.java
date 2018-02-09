import java.awt.*;

public class Rectangle extends Square{
  int xCoord;
  int yCoord;
  int width;
  int height;
  int value = (int) Math.round(Math.random() * 9) + 1;
  String val = "";
  Color bCColor;
  Color fCColor;

  public Rectangle(int x, int y, int width, int height, Color bColor, Color fColor){
    super(x, y, width, bColor, fColor);
    this.xCoord = x;
    this.yCoord = y;
    this.height = height;
    this.width = width;
    this.bCColor = bColor;
    this.fCColor = fColor;
  }

  public void draw(Graphics2D g){
    val = value + "";
    System.out.println("Drawing a rectangle");
    g.setColor(fCColor);
    g.fillRect(xCoord, yCoord, width, height);
    g.setColor(bCColor);
    g.drawRect(xCoord, yCoord, width, height);
    g.drawString(val,xCoord+(width/2) - 5,yCoord+(height/2) + 5);
  }

}
