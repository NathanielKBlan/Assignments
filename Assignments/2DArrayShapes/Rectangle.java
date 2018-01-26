import java.awt.*;

public class Rectangle extends Square{
  int xCoord;
  int yCoord;
  int width;
  int height;
  Color bRColor;
  Color fRColor;

  public Rectangle(int x, int y, int width, int height, Color bColor, Color fColor){
    super(x, y, width, bColor, fColor);
    this.xCoord = x;
    this.yCoord = y;
    this.height = height;
    this.width = width;
    this.bRColor = bColor;
    this.fRColor = fColor;
  }

  public void draw(Graphics2D g){
    System.out.println("Drawing a rectangle");
    g.drawRect(xCoord, yCoord, width, height);
  }

}
