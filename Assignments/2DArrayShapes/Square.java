import java.awt.*;

public class Square extends Shape{
  int xCoord;
  int yCoord;
  int w;
  Color bCColor;
  Color fCColor;
  int value = (int) Math.round(Math.random() * 9) + 1;
  String val = "";

  public Square(int x, int y, int width, Color bColor, Color fColor){
    super(x, y, bColor, fColor);
    this.xCoord = x;
    this.yCoord = y;
    this.w = width;
    this.bCColor = bColor;
    this.fCColor = fColor;
  }

  public void draw(Graphics2D g){
    System.out.println("Drawing a square");
    val = value + "";
    g.setColor(fCColor);
    g.fillRect(xCoord, yCoord, w, w);
    g.setColor(bCColor);
    g.drawRect(xCoord, yCoord, w, w);
    g.drawString(val,xCoord+(w/2) - 5,yCoord+(w/2) + 5);
  }

}
