import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
public class Jframe {
    public static void main(String[] Args){
        JFrame frame = new JFrame();
        frame.setTitle("PUMIS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1150,950);
        frame.setVisible(true); 
        ImageIcon image = new ImageIcon("parul-university9542.jpg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.white);
        
        
    }
}
