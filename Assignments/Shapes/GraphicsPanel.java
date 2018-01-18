import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsPanel extends JPanel{

  public GraphicsPanel() {
    this(null);
  }

  public GraphicsPanel(String messageString) {
      setBackground(Color.BLACK);
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    this.setBackground(Color.WHITE);

    g.setColor(Color.BLUE);
    g.fillRect(20, 20, 200, 150);

    /*
    If RGB is to be used, no values should go beyond 255.
    g.setColor(new Color(R, G, B));
    */

    g.setColor(Color.RED);
    g.drawString("Nathaniel's rectangle", 200, 200);
  }

}
