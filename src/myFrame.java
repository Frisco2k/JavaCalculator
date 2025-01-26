import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

public class myFrame extends JFrame {

   myFrame(){   
        this.setSize(800,600);
        this.setVisible(true);
        this.setTitle("Frisco's Very Basic Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit instead of hide on close

        ImageIcon image = new ImageIcon("logo.jpg");
        this.setIconImage(image.getImage()); // change icon of this
        this.getContentPane().setBackground(new Color(25,20,25));
}
}