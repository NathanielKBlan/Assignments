import java.awt.*;
import javax.swing.JPanel;


public class GraphicsPanel extends JPanel {
    Rectangle[][] rects = new Rectangle[10][10];
    Square[][] sqrs = new Square[10][10];
    Circle[][] crcls = new Circle[10][10];
    Graphics2D g2;
    //int value = Shape.value;


    public GraphicsPanel() {
        this(null);  // Call the other constructor, with parameter null.
    }

    public GraphicsPanel(String messageString) {

        setBackground(Color.BLACK);

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);  // Call the paintComponent method from the
                                  // superclass, JPanel.  This simply fills the
                                  // entire panel with the background color, black.

        g2 = (Graphics2D)g;  // (To make the text smoother.)

        int width = getWidth();
        int height = getHeight();

        createArray();
        displayArray();
    } // end
    public void createArray(){
      g2.setColor(Color.RED);
      for(int r = 0; r < crcls.length; r++){
        for(int c = 0; c < crcls[r].length; c++){
          crcls[r][c] = new Circle(52 * r, 52 * c, 50, Color.BLUE, Color.RED);
          System.out.println(r + " : " + c);
        }
      }
    }
    public void displayArray(){
      for(int r = 0; r < crcls.length; r++){
        for(int c = 0; c < crcls[r].length; c++){

          crcls[r][c].draw(g2);
        }
      }
    }
} // end paintComponent()
