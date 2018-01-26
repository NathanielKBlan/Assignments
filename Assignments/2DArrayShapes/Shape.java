import java.awt.*;

public class Shape{
  int xCoord;
  int yCoord;
  Color bColor;
  Color fColor;
  int value;

  public Shape(int x, int y, Color bColor, Color fColor){
    this.xCoord = x;
    this.yCoord = y;
    this.value = (int) Math.round(Math.random() * 9) + 1;
  }

}
