/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import javax.swing.JPanel;

public class GraphicsPanel extends JPanel {

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
        
        Graphics2D g2 = (Graphics2D)g;  // (To make the text smoother.)
       
        int width = getWidth();
        int height = getHeight();
        
        
        Square s1 = new Square(50, 10, 10, Color.BLUE, Color.RED);
        s1.draw(g2);
        
        Circle c1 = new Circle(50, 50, 50, Color.BLUE, Color.RED);
        c1.draw(g2);
        
        Rectangle r1 = new Rectangle(50,150, 250, 250, Color.BLUE, Color.RED);
        r1.draw(g2);

        } // end 

    } // end paintComponent()
