import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class navbar extends JLabel {

    navbar() {


        Border border = BorderFactory.createLineBorder(Color.pink, 3);
        ImageIcon calculator = new ImageIcon("calculator.png");
        this.setText("Welcome to the calculator application, developed by Frisco2k");
        this.setIcon(calculator);
        this.setHorizontalTextPosition(JLabel.RIGHT); // options are CENTER, LEFT, RIGHT of imageicon
        this.setVerticalTextPosition(JLabel.CENTER); //TOP CENTER OR BOTTOM
        this.setForeground(new Color(255, 255, 255));
        this.setIconTextGap(0);
        this.setVerticalAlignment(JLabel.TOP);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setFont(new Font("Sans-Serif", Font.BOLD, 18));
        this.setBorder(border);
        this.setBounds(0, 0, 785, 100);
    }
}
