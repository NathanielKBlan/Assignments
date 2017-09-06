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
  static boolean calculate = false;
  static String str;
  static String answer;

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
        if(track2 == 0 && added == false && subtracted == false && multiplied == false && divided == false){
          str = "";
          a = 1;
          track2 = 1;
          label.setText(Integer.toString(a));
        }
        if(track2 == 0 && added == true || track2 == 0 && subtracted == true || track2 == 0 && multiplied == true || track2 == 0 && divided == true){
          str = "";
          b = 1;
          track2 = 1;
          label.setText(Integer.toString(b));
        }
        if(track2 == 1 && added == false && subtracted == false && multiplied == false && divided == false){
            str = str + "" + 1;
            a = Integer.parseInt(str);
            System.out.println(a);
            label.setText(str);
        }
        if(track2 == 1 && added == true || track2 == 1 && subtracted == true || track2 == 1 && multiplied == true || track2 == 1 && divided == true){
            str = str + "" + 1;
            b = Integer.parseInt(str);
            System.out.println(b);
            label.setText(str);
        }
      }
    });
    two.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0 && added == false && subtracted == false && multiplied == false && divided == false){
          str = "";
          a = 2;
          track2 = 1;
          label.setText(Integer.toString(a));
        }
        if(track2 == 0 && added == true || track2 == 0 && subtracted == true || track2 == 0 && multiplied == true || track2 == 0 && divided == true){
          str = "";
          b = 2;
          track2 = 1;
          label.setText(Integer.toString(b));
        }
        if(track2 == 1 && added == false && subtracted == false && multiplied == false && divided == false){
            str = str + "" + 2;
            a = Integer.parseInt(str);
            System.out.println(a);
            label.setText(str);
        }
        if(track2 == 1 && added == true || track2 == 1 && subtracted == true || track2 == 1 && multiplied == true || track2 == 1 && divided == true){
            str = str + "" + 2;
            b = Integer.parseInt(str);
            System.out.println(b);
            label.setText(str);
        }
      }
    });
    three.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0 && added == false && subtracted == false && multiplied == false && divided == false){
          str = "";
          a = 3;
          track2 = 1;
          label.setText(Integer.toString(a));
        }
        if(track2 == 0 && added == true || track2 == 0 && subtracted == true || track2 == 0 && multiplied == true || track2 == 0 && divided == true){
          str = "";
          b = 3;
          track2 = 1;
          label.setText(Integer.toString(b));
        }
        if(track2 == 1 && added == false && subtracted == false && multiplied == false && divided == false){
            str = str + "" + 3;
            a = Integer.parseInt(str);
            System.out.println(a);
            label.setText(str);
        }
        if(track2 == 1 && added == true || track2 == 1 && subtracted == true || track2 == 1 && multiplied == true || track2 == 1 && divided == true){
            str = str + "" + 3;
            b = Integer.parseInt(str);
            System.out.println(b);
            label.setText(str);
        }
      }
    });
    four.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0 && added == false && subtracted == false && multiplied == false && divided == false){
          str = "";
          a = 4;
          track2 = 1;
          label.setText(Integer.toString(a));
        }
        if(track2 == 0 && added == true || track2 == 0 && subtracted == true || track2 == 0 && multiplied == true || track2 == 0 && divided == true){
          str = "";
          b = 4;
          track2 = 1;
          label.setText(Integer.toString(b));
        }
        if(track2 == 1 && added == false && subtracted == false && multiplied == false && divided == false){
            str = str + "" + 4;
            a = Integer.parseInt(str);
            System.out.println(a);
            label.setText(str);
        }
        if(track2 == 1 && added == true || track2 == 1 && subtracted == true || track2 == 1 && multiplied == true || track2 == 1 && divided == true){
            str = str + "" + 4;
            b = Integer.parseInt(str);
            System.out.println(b);
            label.setText(str);
        }
      }
    });
    five.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0 && added == false && subtracted == false && multiplied == false && divided == false){
          str = "";
          a = 5;
          track2 = 1;
          label.setText(Integer.toString(a));
        }
        if(track2 == 0 && added == true || track2 == 0 && subtracted == true || track2 == 0 && multiplied == true || track2 == 0 && divided == true){
          str = "";
          b = 5;
          track2 = 1;
          label.setText(Integer.toString(b));
        }
        if(track2 == 1 && added == false && subtracted == false && multiplied == false && divided == false){
            str = str + "" + 5;
            a = Integer.parseInt(str);
            System.out.println(a);
            label.setText(str);
        }
        if(track2 == 1 && added == true || track2 == 1 && subtracted == true || track2 == 1 && multiplied == true || track2 == 1 && divided == true){
            str = str + "" + 5;
            b = Integer.parseInt(str);
            System.out.println(b);
            label.setText(str);
        }
      }
    });
    six.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0 && added == false && subtracted == false && multiplied == false && divided == false){
          str = "";
          a = 6;
          track2 = 1;
          label.setText(Integer.toString(a));
        }
        if(track2 == 0 && added == true || track2 == 0 && subtracted == true || track2 == 0 && multiplied == true || track2 == 0 && divided == true){
          str = "";
          b = 6;
          track2 = 1;
          label.setText(Integer.toString(b));
        }
        if(track2 == 1 && added == false && subtracted == false && multiplied == false && divided == false){
            str = str + "" + 6;
            a = Integer.parseInt(str);
            System.out.println(a);
            label.setText(str);
        }
        if(track2 == 1 && added == true || track2 == 1 && subtracted == true || track2 == 1 && multiplied == true || track2 == 1 && divided == true){
            str = str + "" + 6;
            b = Integer.parseInt(str);
            System.out.println(b);
            label.setText(str);
        }
      }
    });
    seven.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0 && added == false && subtracted == false && multiplied == false && divided == false){
          str = "";
          a = 7;
          track2 = 1;
          label.setText(Integer.toString(a));
        }
        if(track2 == 0 && added == true || track2 == 0 && subtracted == true || track2 == 0 && multiplied == true || track2 == 0 && divided == true){
          str = "";
          b = 7;
          track2 = 1;
          label.setText(Integer.toString(b));
        }
        if(track2 == 1 && added == false && subtracted == false && multiplied == false && divided == false){
            str = str + "" + 7;
            a = Integer.parseInt(str);
            System.out.println(a);
            label.setText(str);
        }
        if(track2 == 1 && added == true || track2 == 1 && subtracted == true || track2 == 1 && multiplied == true || track2 == 1 && divided == true){
            str = str + "" + 7;
            b = Integer.parseInt(str);
            System.out.println(b);
            label.setText(str);
        }
      }
    });
    eight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0 && added == false && subtracted == false && multiplied == false && divided == false){
          str = "";
          a = 8;
          track2 = 1;
          label.setText(Integer.toString(a));
        }
        if(track2 == 0 && added == true || track2 == 0 && subtracted == true || track2 == 0 && multiplied == true || track2 == 0 && divided == true){
          str = "";
          b = 8;
          track2 = 1;
          label.setText(Integer.toString(b));
        }
        if(track2 == 1 && added == false && subtracted == false && multiplied == false && divided == false){
            str = str + "" + 8;
            a = Integer.parseInt(str);
            System.out.println(a);
            label.setText(str);
        }
        if(track2 == 1 && added == true || track2 == 1 && subtracted == true || track2 == 1 && multiplied == true || track2 == 1 && divided == true){
            str = str + "" + 8;
            b = Integer.parseInt(str);
            System.out.println(b);
            label.setText(str);
        }
      }
    });
    nine.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0 && added == false && subtracted == false && multiplied == false && divided == false){
          str = "";
          a = 9;
          track2 = 1;
          label.setText(Integer.toString(a));
        }
        if(track2 == 0 && added == true || track2 == 0 && subtracted == true || track2 == 0 && multiplied == true || track2 == 0 && divided == true){
          str = "";
          b = 9;
          track2 = 1;
          label.setText(Integer.toString(b));
        }
        if(track2 == 1 && added == false && subtracted == false && multiplied == false && divided == false){
            str = str + "" + 9;
            a = Integer.parseInt(str);
            System.out.println(a);
            label.setText(str);
        }
        if(track2 == 1 && added == true || track2 == 1 && subtracted == true || track2 == 1 && multiplied == true || track2 == 1 && divided == true){
            str = str + "" + 9;
            b = Integer.parseInt(str);
            System.out.println(b);
            label.setText(str);
        }
      }
    });
    zero.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(track2 == 0 && added == false && subtracted == false && multiplied == false && divided == false){
          str = "";
          a = 0;
          track2 = 1;
          label.setText(Integer.toString(a));
        }
        if(track2 == 0 && added == true || track2 == 0 && subtracted == true || track2 == 0 && multiplied == true || track2 == 0 && divided == true){
          str = "";
          b = 0;
          track2 = 1;
          label.setText(Integer.toString(b));
        }
        if(track2 == 1 && added == false && subtracted == false && multiplied == false && divided == false){
            str = str + "" + 0;
            a = Integer.parseInt(str);
            System.out.println(a);
            label.setText(str);
        }
        if(track2 == 1 && added == true || track2 == 1 && subtracted == true || track2 == 1 && multiplied == true || track2 == 1 && divided == true){
            str = str + "" + 0;
            b = Integer.parseInt(str);
            System.out.println(b);
            label.setText(str);
        }
      }
    });
    add.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        added = true;
        track2 = 0;
      }
    });
    sub.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        subtracted = true;
        track2 = 0;
      }
    });
    mult.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        multiplied = true;
        track2 = 0;
      }
    });
    div.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        divided = true;
        track2 = 0;
      }
    });
    equals.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        calculate = true;
        if(added == true){
          c = a + b;
          answer = "" + c;
          System.out.println(answer);
          added = false;
          calculate = false;
          track2 = 0;
        }
        if(subtracted == true){
          c = a - b;
          answer = "" + c;
          subtracted = false;
          calculate = false;
          track2 = 0;
        }
        if(multiplied == true){
          c = a * b;
          answer = "" + c;
          multiplied = false;
          calculate = false;
          track2 = 0;
        }
        if(divided == true){
          g = a;
          f = b;
          d = g / f;
          answer = "" + d;
          divided = false;
          calculate = false;
          track2 = 0;
        }
        label.setText(answer);
      }
    });
    frame.setVisible(true);
    frame.setSize(250,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
  }


}
