import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class Converter extends JFrame {

  JPanel mpanel = new JPanel();
  
  JLabel horsepower = new JLabel("HorsePower");
  JLabel watts = new JLabel("Watts");

  JTextField hptxt = new JTextField();
  JTextField wattstxt = new JTextField();

  JPanel convert = new JPanel();
  JLabel label = new JLabel("Convert");

  public Converter() {

    this.setSize(300, 400);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    
    this.add(mpanel);
    mpanel.setLayout(null);
    mpanel.setBounds(0, 0, 300, 400);
    mpanel.setBackground(new Color(255, 226, 189));

    mpanel.add(horsepower);
    horsepower.setBounds(30, 50, 100, 30);
    horsepower.setForeground(Color.black);
    horsepower.setFont(new Font("Century Gothic", Font.ITALIC, 15));
    mpanel.add(hptxt);
    hptxt.setBounds(30, 90, 200, 30);
    hptxt.setFont(new Font("Century Gothic", Font.BOLD, 15));

    mpanel.add(watts);
    watts.setBounds(30, 140, 100, 30);
    watts.setForeground(Color.black);
    watts.setFont(new Font("Century Gothic", Font.ITALIC, 15));
    mpanel.add(wattstxt);
    wattstxt.setBounds(30, 180, 200, 30);
    wattstxt.setFont(new Font("Century Gothic", Font.BOLD, 15));
    wattstxt.setEnabled(true);
    wattstxt.setEditable(false);

    mpanel.add(convert);
    convert.setBounds(60, 230, 100, 30);
    convert.setBackground(new Color(196, 145, 96));
    convert.add(label);

    convert.addMouseListener(new MouseAdapter() {

      public void mouseClicked(MouseEvent me) {
        if (me.getSource() == convert) {
      
          double hp = Double.parseDouble(hptxt.getText());
          double calculation = (hp * 745.7);
    
          wattstxt.setText(calculation + "");
        }
      }

      public void mouseEntered(MouseEvent me) {
        convert.setBackground(new Color(230, 151, 5));
        label.setForeground(Color.white);
      }

      public void mouseExited(MouseEvent me) {
        convert.setBackground(new Color(196, 145, 96));
        label.setForeground(new Color(0, 0, 0));
      }
    });

    label.setForeground(Color.black);
    label.setFont(new Font("Century Gothic", Font.BOLD, 14));
  }
}
