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
        numberButtonPress(1);
      }
    });
    two.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        numberButtonPress(2);
      }
    });
    three.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        numberButtonPress(3);
      }
    });
    four.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        numberButtonPress(4);
      }
    });
    five.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        numberButtonPress(5);
      }
    });
    six.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        numberButtonPress(6);
      }
    });
    seven.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        numberButtonPress(7);
      }
    });
    eight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        numberButtonPress(8);
      }
    });
    nine.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        numberButtonPress(9);
      }
    });
    zero.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        numberButtonPress(0);
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

        if(added){
          equalsPressed("add");
        }
        if(subtracted){
          equalsPressed("subtract");
        }
        if(multiplied){
          equalsPressed("multiply");
        }
        if(divided){
          equalsPressed("divide");
        }
        label.setText(answer);
      }
    });
    frame.setVisible(true);
    frame.setSize(250,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
  }

  public static void equalsPressed(String operation) {
     if (operation == "add") {
       c = a + b;
       added = false;
     }
     if (operation == "subtract") {
       c = a - b;
       subtracted = false;
     }
     if (operation == "multiply") {
       c = a * b;
       multiplied = false;
     }
     if (operation == "divide") {
       c = a / b;
       divided = false;
     }

     answer = "" + c;
     System.out.println(answer);
     calculate = false;
     track2 = 0;
  }

  public static void numberButtonPress(int i){
    if(track2 == 0 && !added && !subtracted && !multiplied && !divided){
      a = i;
      str = "";
      track2 = 1;
      label.setText(Integer.toString(a));
    }
    if(track2 == 0 && added || track2 == 0 && subtracted || track2 == 0 && multiplied || track2 == 0 && divided ){
      b = i;
      str = "";
      track2 = 1;
      label.setText(Integer.toString(b));
    }
    if(track2 == 1 && !added && !subtracted && !multiplied && !divided){
        str = str + "" + i;
        a = Integer.parseInt(str);
        System.out.println(a);
        label.setText(str);
    }
    if(track2 == 1 && added || track2 == 1 && subtracted || track2 == 1 && multiplied || track2 == 1 && divided ){
        str = str + "" + i;
        b = Integer.parseInt(str);
        System.out.println(b);
        label.setText(str);
    }
  }
}
