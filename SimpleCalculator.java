import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class SimpleCalculator{

  static JFrame frame = new JFrame("SimpleCalculator");
  static JPanel panel = new JPanel();
  static JLabel label = new JLabel("Do your calculations.");
  static JButton add = new JButton("+");
  static JButton sub = new JButton("-");
  static JButton mult = new JButton("x");
  static JButton div =  new JButton("÷");
  static JButton equals = new JButton("=");
  static JButton one = new JButton("1");
  static JButton two = new JButton("2");
  static JButton three = new JButton("3");
  static JButton four = new JButton("4");
  static JButton five = new JButton("5");
  static JButton six = new JButton("6");
  static JButton seven = new JButton("7");
  static JButton eight = new JButton("8");
  static JButton nine = new JButton("9");
  static JButton zero = new JButton("0");
  static int a;
  static int b;
  static int c;
  static double d;
  static double g;
  static double f;
  static int track2 = 0;
  static boolean added = false;
  static boolean subtracted = false;
  static boolean multiplied = false;
  static boolean divided = false;
  static String str;

  public static void main(String[] args){
    panel.setLayout(null);
    label.setBounds(60, 80, 200, 50);
    add.setBounds(190, 250, 50, 20);
    sub.setBounds(190, 280, 50, 20);
    mult.setBounds(190, 310, 50, 20);
    div.setBounds(190, 340, 50, 20);
    equals.setBounds(190, 370, 50, 20);
    one.setBounds(10, 250, 50, 20);
    two.setBounds(70, 250, 50, 20);
    three.setBounds(130, 250, 50, 20);
    four.setBounds(10, 280, 50, 20);
    five.setBounds(70, 280, 50, 20);
    six.setBounds(130, 280, 50, 20);
    seven.setBounds(10, 310, 50, 20);
    eight.setBounds(70, 310, 50, 20);
    nine.setBounds(130, 310, 50, 20);
    zero.setBounds(70, 340, 50, 20);
    panel.add(label);
    panel.add(add);
    panel.add(sub);
    panel.add(mult);
    panel.add(div);
    panel.add(equals);
    panel.add(one);
    panel.add(two);
    panel.add(three);
    panel.add(four);
    panel.add(five);
    panel.add(six);
    panel.add(seven);
    panel.add(eight);
    panel.add(nine);
    panel.add(zero);
    one.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0){
          a = 1;
          track2 = 1;
          str = "";
        }
        else if(track2 == 1){
          b = 1;
          track2 = 0;
          str = "";
        }
      }
    });
    two.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0){
          a = 2;
          track2 = 1;
          str = "";
        }
        else if(track2 == 1){
          b = 2;
          track2 = 0;
          str = "";
        }
      }
    });
    three.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0){
          a = 3;
          track2 = 1;
          str = "";
        }
        else if(track2 == 1){
          b = 3;
          track2 = 0;
          str = "";
        }
      }
    });
    four.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0){
          a = 4;
          track2 = 1;
          str = "";
        }
        else if(track2 == 1){
          b = 4;
          track2 = 0;
          str = "";
        }
      }
    });
    five.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0){
          a = 5;
          track2 = 1;
          str = "";
        }
        else if(track2 == 1){
          b = 5;
          track2 = 0;
          str = "";
        }
      }
    });
    six.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0){
          a = 6;
          track2 = 1;
          str = "";
        }
        else if(track2 == 1){
          b = 6;
          track2 = 0;
          str = "";
        }
      }
    });
    seven.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0){
          a = 7;
          track2 = 1;
          str = "";
        }
        else if(track2 == 1){
          b = 7;
          track2 = 0;
          str = "";
        }
      }
    });
    eight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0){
          a = 8;
          track2 = 1;
          str = "";
        }
        else if(track2 == 1){
          b = 8;
          track2 = 0;
          str = "";
        }
      }
    });
    nine.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0){
          a = 9;
          track2 = 1;
          str = "";
        }
        else if(track2 == 1){
          b = 9;
          track2 = 0;
          str = "";
        }
      }
    });
    zero.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0){
          a = 0;
          track2 = 1;
          str = "";
        }
        else if(track2 == 1){
          b = 0;
          track2 = 0;
          str = "";
        }
      }
    });
    add.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        added = true;
      }
    });
    sub.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        subtracted = true;
      }
    });
    mult.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        multiplied = true;
      }
    });
    div.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        divided = true;
      }
    });
    equals.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(added == true){
          c = a + b;
          str = Integer.toString(c);
          added = false;
        }
        if(subtracted == true){
          c = a - b;
          str = Integer.toString(c);
          subtracted = false;
        }
        if(multiplied == true){
          c = a * b;
          str = Integer.toString(c);
          multiplied = false;
        }
        if(divided == true){
          g = a;
          f = b;
          d = g / f;
          str = Double.toString(d);
          divided = false;
        }
        label.setText(str);
      }
    });
    frame.setVisible(true);
    frame.setSize(250,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
  }


}
