import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

class MTME{
  public static void main(String[] args) throws Exception{
    int measures;
    String cleff;
    String bpm;
    String note;
    String key;
    Boolean trebble = false;
    Boolean bass = false;
    Boolean alto = false;
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    ImageIcon icon = new ImageIcon("lines.png");
    ImageIcon qn = new ImageIcon("quarter.png");
    JLabel sl = new JLabel(icon, JLabel.CENTER);
    File lIm = new File("lines.png");
    File qIm = new File("quarter.png");
    File t = new File("tc.png");
    File b = new File("bc.png");
    File a = new File("ac.png");
    BufferedImage l = ImageIO.read(lIm);
    BufferedImage q = ImageIO.read(qIm);
    BufferedImage tc = ImageIO.read(t);
    BufferedImage bc = ImageIO.read(b);
    BufferedImage ac = ImageIO.read(a);
    BufferedImage c = new BufferedImage(l.getWidth(), l.getHeight(), BufferedImage.TYPE_INT_ARGB);

    measures = Integer.parseInt(JOptionPane.showInputDialog("Welcome to Music To My Ears" + "\nPlease input the number of measures:"));
    cleff = JOptionPane.showInputDialog("Please enter your cleff:");

    if(cleff.equals("trebble") || cleff.equals("Trebble")){
      trebble = true;
      bass = false;
      alto = false;
    }
    if(cleff.equals("bass") || cleff.equals("Bass")){
      bass = true;
      trebble = false;
      alto = false;
    }
    if(cleff.equals("alto") || cleff.equals("Alto")){
      alto = true;
      bass = false;
      trebble = false;
    }
    bpm = JOptionPane.showInputDialog("Please enter the beats per measure as shown." + "\nExample: 4");

    Graphics2D g = c.createGraphics();
    g.drawImage(l,0,0,null);
    if(trebble == true){
      g.drawImage(tc,30,90,null);
    }
    if(bass == true){
      g.drawImage(bc,30,100,null);
    }
    if(alto == true){
      g.drawImage(ac,30,100,null);
    }
    g.dispose();

    Runnable r = new Runnable() {

      @Override
      public void run() {
        panel.add(new JLabel(new ImageIcon(c)));
        JOptionPane.showMessageDialog(null, panel);
      }

    };
    SwingUtilities.invokeLater(r);

    frame.setVisible(false);
    frame.setSize(500, 500);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
