import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _1JFrame extends JFrame {

  JPanel panel = new JPanel();
  java.awt.Image image;
  
  public void paint(Graphics g) {
    super.paint(g);

    ImageIcon ii = new ImageIcon("img/11.jpg");
    image = ii.getImage();
    g.drawImage(image, -350, 0, 800, 600, null);

    g.setColor(new Color(35, 61, 13));
    g.fillRect(450, 0, 350, 50);
    g.fillRect(450, 570, 350, 50);
  }

  public _1JFrame() {
    this.setSize(800, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setUndecorated(true);
    
    this.add(panel);
    panel.setLayout(null);
    panel.setBackground(new Color(181, 222, 173));

    JPanel start = new JPanel();
    JPanel exit = new JPanel();
    JLabel sButton = new JLabel("S T A R T");
    JLabel eButton = new JLabel("E X I T");

    panel.add(start);
    start.setBounds(490, 300, 270, 45);
    start.setBackground(new Color(44, 95, 45));
    start.addMouseListener(new MouseAdapter() {
      
      public void mouseClicked(MouseEvent me) {
        if (me.getSource() == start) {
          StartButton sb = new StartButton();
          sb.setVisible(true);
          dispose();
        }
      }

      public void mouseEntered(MouseEvent me1) {
        start.setBackground(new Color(19, 42, 19));
      }

      public void mouseExited(MouseEvent me1) {
        start.setBackground(new Color(44, 95, 45));
      }
    });

    start.add(sButton);
    sButton.setForeground(new Color(181, 222, 173));
    sButton.setBounds(150, 36, 20, 30);
    sButton.setFont(new Font("Century Gothic", Font.BOLD, 25));

    panel.add(exit);
    exit.setBounds(520, 420, 210, 35);
    exit.setBackground(new Color(141, 179, 111));
    exit.add(eButton);
    exit.addMouseListener(new MouseAdapter() {

      public void mouseClicked(MouseEvent me1) {
        if (me1.getSource() == exit) {
          if (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
            System.exit(0);
          }
        }
      }

      public void mouseEntered(MouseEvent me1) {
        exit.setBackground(new Color(32, 74, 0));
        eButton.setForeground(new Color(181, 222, 173));
      }

      public void mouseExited(MouseEvent me1) {
        exit.setBackground(new Color(141, 179, 111));
        eButton.setForeground(new Color(48, 64, 36));
      }
    });

    eButton.setForeground(new Color(48, 64, 36));
    eButton.setBounds(150, 36, 20, 30);
    eButton.setFont(new Font("Century Gothic", Font.BOLD, 18));
  }
}
