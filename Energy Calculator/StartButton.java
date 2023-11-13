import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class StartButton extends JFrame implements ActionListener {

  JPanel panel = new JPanel();
  java.awt.Image image1;
  java.awt.Image profile;
  String str = "U S E R - I";

  JLabel name = new JLabel("Full Name:");
  JTextField txtname = new JTextField();
  JLabel add = new JLabel("Full Address:");
  JTextField txtadd = new JTextField();

  JLabel no1 = new JLabel("Do you live in NCR?");
  JCheckBox cb1 = new JCheckBox("Yes");
  JCheckBox cb2 = new JCheckBox("No");

  JLabel no2 = new JLabel("Are you having a hard time saving energy?");
  JCheckBox cb3 = new JCheckBox("Yes");
  JCheckBox cb4 = new JCheckBox("No");

  JLabel no3 = new JLabel("Do you attend online class?");
  JCheckBox cb5 = new JCheckBox("Yes");
  JCheckBox cb6 = new JCheckBox("No");

  JButton submit = new JButton("S U B M I T");

  File file = new File("Recorded.txt");
  FileWriter fw;
  BufferedWriter bw;

  public void paint(Graphics g) {
    super.paint(g);

    ImageIcon ii2 = new ImageIcon("img/profile.png");
    ImageIcon ii1 = new ImageIcon("img/10.jpg");
    image1 = ii1.getImage();
    profile = ii2.getImage();
    g.setFont(new Font("Century Gothic", Font.BOLD, 60));

    g.drawImage(image1, 400, 0, 800, 600, null);

    g.setColor(new Color(38, 73, 92));
    g.fillRect(0, 0, 400, 110);

    g.setColor(new Color(229, 229, 220));
    g.drawString(str, 100, 70);

    g.drawImage(profile, 10, 10, 80, 80, null);
  }
  
  public StartButton() {
    this.setSize(800, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setUndecorated(true);

    this.add(panel);
    panel.setBounds(0, 0, 800, 600);
    panel.setBackground(new Color(229, 229, 220));
    panel.setLayout(null);

    panel.add(name);
    name.setBounds(30, 120, 150, 30);
    name.setFont(new Font("Century Gothic", Font.BOLD, 18));
    panel.add(txtname);
    txtname.setBounds(30, 160, 300, 35);
    txtname.setBackground(new Color(229, 229, 220));
    txtname.setForeground(new Color(38, 73, 92));
    txtname.setFont(new Font("Century Gothic", Font.BOLD, 18));

    panel.add(add);
    add.setBounds(30, 210, 150, 30);
    add.setFont(new Font("Century Gothic", Font.BOLD, 18));
    panel.add(txtadd);
    txtadd.setBounds(30, 250, 300, 35);
    txtadd.setBackground(new Color(229, 229, 220));
    txtadd.setForeground(new Color(38, 73, 92));
    txtadd.setFont(new Font("Century Gothic", Font.BOLD, 18));

    panel.add(no1);
    panel.add(cb1);
    panel.add(cb2);
    no1.setBounds(30, 300, 200, 50);
    no1.setFont(new Font("Century Gothic", Font.BOLD, 16));
    cb1.setBounds(60, 340, 50, 30);
    cb1.setBackground(new Color(229, 229, 220));
    cb1.setFont(new Font("Century Gothic", Font.ITALIC, 15));
    cb2.setBounds(140, 340, 50, 30);
    cb2.setBackground(new Color(229, 229, 220));
    cb2.setFont(new Font("Century Gothic", Font.ITALIC, 15));

    panel.add(no2);
    panel.add(cb3);
    panel.add(cb4);
    no2.setBounds(30, 370, 350, 50);
    no2.setFont(new Font("Century Gothic", Font.BOLD, 16));
    cb3.setBounds(60, 410, 50, 30);
    cb3.setBackground(new Color(229, 229, 220));
    cb3.setFont(new Font("Century Gothic", Font.ITALIC, 15));
    cb4.setBounds(140, 410, 50, 30);
    cb4.setBackground(new Color(229, 229, 220));
    cb4.setFont(new Font("Century Gothic", Font.ITALIC, 15));

    panel.add(no3);
    panel.add(cb5);
    panel.add(cb6);
    no3.setBounds(30, 450, 350, 50);
    no3.setFont(new Font("Century Gothic", Font.BOLD, 16));
    cb5.setBounds(60, 490, 50, 30);
    cb5.setBackground(new Color(229, 229, 220));
    cb5.setFont(new Font("Century Gothic", Font.ITALIC, 15));
    cb6.setBounds(140, 490, 50, 30);
    cb6.setBackground(new Color(229, 229, 220));
    cb6.setFont(new Font("Century Gothic", Font.ITALIC, 15));

    panel.add(submit);
    submit.setBounds(90, 540, 150, 42);
    submit.setBackground(new Color(38, 73, 92));
    submit.setForeground(new Color(229, 229, 220));
    submit.setFont(new Font("Century Gothic", Font.BOLD, 20));
    submit.setFocusable(false);

    submit.addMouseListener(new MouseAdapter() {
      
      public void mouseEntered(MouseEvent e) {
        submit.setBackground(new Color(3, 0, 46));
      }

      public void mouseExited(MouseEvent e) {
        submit.setBackground(new Color(38, 73, 92));
      }
    
    });

    submit.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand() == submit.getActionCommand()) {

      try {
        fw = new FileWriter(file) ;
        bw = new BufferedWriter(fw);

        bw.write("USER INFORMATION\n\n");
        bw.write("Full Name: " + txtname.getText());
        bw.write("\nFull Address: " + txtadd.getText());
        
        bw.write("\n\nCHECKLIST\n");

        if (cb1.isSelected()) {
          bw.write("\n1. Yes");           
        }
        if (cb2.isSelected()) {
          bw.write("1. No");            
        }
        if (cb3.isSelected()) {
          bw.write("\n2. Yes");           
        }
        if (cb4.isSelected()) {
          bw.write("\n2. No");            
        }
        if (cb5.isSelected()) {
          bw.write("\n3. Yes");    
          bw.close();        
        }
        if (cb6.isSelected()) {
          bw.write("\n3. No");
          bw.close();         
        }

        JOptionPane.showMessageDialog(null, "Successfully Recorded");
      }

      catch (Exception ex) { 
        JOptionPane.showMessageDialog(null, ex + "");
      }
    }

    if (e.getSource() == submit) {
      Calculator cl = new Calculator();
      cl.setVisible(true);
      dispose();
    }
  }
}
