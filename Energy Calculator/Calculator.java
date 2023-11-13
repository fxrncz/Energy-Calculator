import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

  JLabel app = new JLabel("Appliances: ");
  JLabel watts = new JLabel("Power(Watts): ");
  JLabel use = new JLabel("Hours of use: ");
  JLabel numofApp = new JLabel("No. of App.:");
  JTextField appTF = new JTextField();
  JTextField wattsTF = new JTextField();
  JTextField useTF = new JTextField();
  JTextField noTf = new JTextField();

  JLabel p1 = new JLabel("watts");
  JLabel p2 = new JLabel("watts");
  JLabel p3 = new JLabel("watts");

  JLabel c1 = new JLabel("peso");
  JLabel c2 = new JLabel("peso");
  JLabel c3 = new JLabel("peso");

  JLabel pd = new JLabel("Energy consume per day: ");
  JLabel pm = new JLabel("Energy consume per month: ");
  JLabel py = new JLabel("Energy consume per year: ");
  JTextField pdTF = new JTextField();
  JTextField pmTF = new JTextField();
  JTextField pyTF = new JTextField();

  JLabel cD = new JLabel("Electricity bill per day: ");
  JLabel cM = new JLabel("Electricity bill per month: ");
  JLabel cY = new JLabel("Electricity bill per year: ");
  JTextField cDTF = new JTextField();
  JTextField cMTF = new JTextField();
  JTextField cYTF = new JTextField();

  JButton calculate = new JButton("Calculate");
  JButton clear = new JButton("Clear");
  JButton exit = new JButton("E X I T");

  JPanel panel = new JPanel();
  String str = "E - CALCULATOR";

  String[] apps = {"Air Conditioner", "Clothes Dryer", "Clothes Iron", "Fan", "Desktop Computer", "Refrigerator", "Sterio", "Television", "Washing Machine"};

  JComboBox<String> appliances = new JComboBox<>(apps);

  java.awt.Image image;

  public void paint(Graphics g) {
    super.paint(g);
    ImageIcon ii = new ImageIcon("img/8.jpg");
    image = ii.getImage();

    g.drawImage(image, -400, 0, 800, 800, null);

    g.setColor(new Color(148, 156, 82));
    g.fillRect(400, 0, 400, 50);

    g.setColor(Color.WHITE);
    g.setFont(new Font("Century Gothic", Font.BOLD, 50));
    g.drawString(str, 402, 40);

    setLayout(null);
    add(exit);
    exit.setBounds(120, 640, 130, 35);
    exit.setFont(new Font("Century Gothic", Font.BOLD, 19));
    exit.setFocusable(false);
    exit.setBackground(new Color(191, 201, 101));
    exit.setForeground(new Color(77, 84, 17));

    exit.addMouseListener(new MouseAdapter() {
      
      public void mouseEntered(MouseEvent me) {
        exit.setBackground(new Color(77, 84, 17));
        exit.setForeground(Color.white);
      }

      public void mouseExited(MouseEvent me) {
        exit.setBackground(new Color(191, 201, 101));
        exit.setForeground(new Color(77, 84, 17));    
      }
    });
  }

  public Calculator() {
    this.setSize(800, 800);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setUndecorated(true);
    
    this.add(panel);
    panel.setLayout(null);
    panel.setBounds(0, 0, 800, 700);
    panel.setBackground(Color.white);

    panel.add(app);
    app.setBounds(430, 70, 130, 20);
    app.setFont(new Font("Century Gothic", Font.BOLD, 18));
    panel.add(appliances);
    appliances.setBounds(560, 65, 200, 28);
    appliances.setFont(new Font("Century Gothic", Font.BOLD, 18));

    panel.add(watts);
    watts.setBounds(430, 120, 130, 20);
    watts.setFont(new Font("Century Gothic", Font.BOLD, 18));
    panel.add(wattsTF);
    wattsTF.setBounds(560, 115, 200, 28);
    wattsTF.setFont(new Font("Century Gothic", Font.BOLD, 18));

    panel.add(use);
    use.setBounds(430, 170, 130, 20);
    use.setFont(new Font("Century Gothic", Font.BOLD, 18));
    panel.add(useTF);
    useTF.setBounds(560, 165, 200, 28);
    useTF.setFont(new Font("Century Gothic", Font.BOLD, 18));

    panel.add(numofApp);
    numofApp.setBounds(430, 220, 130, 20);
    numofApp.setFont(new Font("Century Gothic", Font.BOLD, 18));
    panel.add(noTf);
    noTf.setBounds(560, 215, 200, 28);
    noTf.setFont(new Font("Century Gothic", Font.BOLD, 18));

    panel.add(calculate);
    calculate.setBounds(455, 260, 130, 35);
    calculate.setBackground(Color.BLACK); 
    calculate.setForeground(Color.WHITE);
    calculate.setFont(new Font("Century Gothic", Font.ITALIC, 15));
    calculate.setFocusable(false);

    calculate.addMouseListener(new MouseAdapter() {
    
      public void mouseEntered(MouseEvent me) {
        calculate.setBackground(Color.YELLOW);
        calculate.setForeground(Color.black);
      }

      public void mouseExited(MouseEvent me) {
        calculate.setBackground(Color.BLACK);
        calculate.setForeground(Color.WHITE);
      }
    });

    panel.add(clear);
    clear.setBounds(600, 260, 130, 35);
    clear.setBackground(Color.BLACK); 
    clear.setForeground(Color.WHITE);
    clear.setFont(new Font("Century Gothic", Font.ITALIC, 15));
    clear.setFocusable(false);

    clear.addMouseListener(new MouseAdapter() {
      
      public void mouseEntered(MouseEvent me) {
        clear.setBackground(Color.YELLOW);
        clear.setForeground(Color.black);
      }

      public void mouseExited(MouseEvent me) {
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
      }
   
    });

    panel.add(pd);
    pd.setBounds(430, 310, 300, 20);
    pd.setFont(new Font("Century Gothic", Font.ITALIC, 15));
    panel.add(pdTF);
    pdTF.setBounds(430, 340, 200, 30);
    pdTF.setFont(new Font("Century Gothic", Font.BOLD, 18));
    pdTF.setForeground(Color.BLACK);
    pdTF.setEnabled(true);
    pdTF.setEditable(false);
    panel.add(p1);
    p1.setBounds(640, 340, 200, 30);
    p1.setFont(new Font("Century Gothic", Font.BOLD, 18));
    p1.setForeground(Color.BLACK);
    
    panel.add(pm);
    pm.setBounds(430, 380, 300, 20);
    pm.setFont(new Font("Century Gothic", Font.ITALIC, 15));
    panel.add(pmTF);
    pmTF.setBounds(430, 410, 200, 30);
    pmTF.setFont(new Font("Century Gothic", Font.BOLD, 18));
    pmTF.setForeground(Color.BLACK);
    pmTF.setEnabled(true);
    pmTF.setEditable(false);
    panel.add(p2);
    p2.setBounds(640, 410, 200, 30);
    p2.setFont(new Font("Century Gothic", Font.BOLD, 18));
    p2.setForeground(Color.BLACK);
    
    panel.add(py);
    py.setBounds(430, 450, 300, 20);
    py.setFont(new Font("Century Gothic", Font.ITALIC, 15));
    panel.add(pyTF);
    pyTF.setBounds(430, 480, 200, 30);
    pyTF.setFont(new Font("Century Gothic", Font.BOLD, 18));
    pyTF.setForeground(Color.BLACK);
    pyTF.setEnabled(true);
    pyTF.setEditable(false);
    panel.add(p3);
    p3.setBounds(640, 480, 200, 30);
    p3.setFont(new Font("Century Gothic", Font.BOLD, 18));
    p3.setForeground(Color.BLACK);

    panel.add(cD);
    cD.setBounds(430, 520, 300, 20);
    cD.setFont(new Font("Century Gothic", Font.ITALIC, 15));
    panel.add(cDTF);
    cDTF.setBounds(430, 550, 200, 30);
    cDTF.setFont(new Font("Century Gothic", Font.BOLD, 18));
    cDTF.setForeground(Color.BLACK);
    cDTF.setEnabled(true);
    cDTF.setEditable(false);
    panel.add(c1);
    c1.setBounds(640, 550, 200, 30);
    c1.setFont(new Font("Century Gothic", Font.BOLD, 18));
    c1.setForeground(Color.BLACK);
 
    panel.add(cM);
    cM.setBounds(430, 590, 300, 20);
    cM.setFont(new Font("Century Gothic", Font.ITALIC, 15));
    panel.add(cMTF);
    cMTF.setBounds(430, 620, 200, 30);
    cMTF.setFont(new Font("Century Gothic", Font.BOLD, 18));
    cMTF.setForeground(Color.BLACK);
    cMTF.setEnabled(true);
    cMTF.setEditable(false);
    panel.add(c2);
    c2.setBounds(640, 620, 200, 30);
    c2.setFont(new Font("Century Gothic", Font.BOLD, 18));
    c2.setForeground(Color.BLACK);

    panel.add(cY);
    cY.setBounds(430, 660, 300, 20);
    cY.setFont(new Font("Century Gothic", Font.ITALIC, 15));
    panel.add(cYTF);
    cYTF.setBounds(430, 690, 200, 30);
    cYTF.setFont(new Font("Century Gothic", Font.BOLD, 18));
    cYTF.setForeground(Color.BLACK);
    cYTF.setEnabled(true);
    cYTF.setEditable(false);
    panel.add(c3);
    c3.setBounds(640, 690, 200, 30);
    c3.setFont(new Font("Century Gothic", Font.BOLD, 18));
    c3.setForeground(Color.BLACK);

    JPanel hpb = new JPanel();
    JLabel hp = new JLabel("HP");

    panel.add(hpb);
    hpb.setBounds(730, 680, 38, 38);
    hpb.setBackground(Color.BLACK);
    hpb.add(hp);
    
    hpb.addMouseListener(new MouseAdapter() {

      public void mouseClicked(MouseEvent me1) {
        if (me1.getSource() == hpb) {
          Converter cvn = new Converter();
          cvn.setVisible(true);
        }
      }

      public void mouseEntered(MouseEvent me1) {
        hpb.setBackground(Color.yellow);
        hp.setForeground(Color.black);
      }

      public void mouseExited(MouseEvent me1) {
        hpb.setBackground(Color.BLACK);
        hp.setForeground(Color.white);
      }
    });

    hp.setForeground(Color.white);
    hp.setFont(new Font("Century Gothic", Font.ITALIC, 20));

    JLabel label1 = new JLabel("HP Converter");

    panel.add(label1);
    label1.setBounds(708, 642, 100, 50);
    label1.setForeground(Color.BLACK);
    label1.setFont(new Font("Century Gothic", Font.ITALIC, 13));

    calculate.addActionListener(this);
    clear.addActionListener(this);
    exit.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == exit) {
      if (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
        System.exit(0);
      }
    }

    if (e.getSource() == clear) {
      appTF.setText(null);
      wattsTF.setText(null);
      useTF.setText(null);
      noTf.setText(null);
      pdTF.setText(null);
      pmTF.setText(null);
      pyTF.setText(null);
      cDTF.setText(null);
      cMTF.setText(null);
      cYTF.setText(null);
    }

    if (e.getSource() == calculate) {

      double noofapp = Double.parseDouble(noTf.getText());

      if (noTf.getText().length() <= 0 || noofapp == 0) {
        JOptionPane.showMessageDialog(null, "Set the value of No. of Apps", "WARNING", JOptionPane.YES_NO_OPTION);
      }    

      double powercon = Double.parseDouble(wattsTF.getText());
      double hoursofuse = Double.parseDouble(useTF.getText());
      double day = (powercon * hoursofuse / 1000);

      double power = day * noofapp;

      double month = power * 30;
      double year = power * 365;

      double cDay = power * 12 / 100;
      double cMonth = power * 12 / 100 * 30;
      double cYear = power * 12 / 100 * 365;

      double costDay = cDay * 48.25;
      double costMonth = cMonth * 48.25;
      double costYear = cYear * 48.25;

      pdTF.setText(power + "");
      pmTF.setText(month + "");
      pyTF.setText(year + "");

      cDTF.setText(costDay + "");
      cMTF.setText(costMonth + "");
      cYTF.setText(costYear + "");
    }
  }
}
