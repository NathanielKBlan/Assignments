import java.awt.*;

public class Square extends Shape{
  int xCoord;
  int yCoord;
  int w;
  Color bSColor;
  Color fSColor;

  public Square(int x, int y, int width, Color bColor, Color fColor){
    super(x, y, bColor, fColor);
    this.xCoord = x;
    this.yCoord = y;
    this.w = width;
    this.bSColor = bColor;
    this.fSColor = fColor;
  }

  public void draw(Graphics2D g){
    System.out.println("Drawing a square");
    g.drawRect(xCoord, yCoord, w, w);
  }

}
