import java.awt.*;

public abstract class Shape{
  int xCoord;
  int yCoord;
  Color bColor;
  Color fColor;
  int value;
  String val;

  public Shape(int x, int y, Color bColor, Color fColor){
    this.xCoord = x;
    this.yCoord = y;
  }

  public void draw(Graphics2D g){}

}
