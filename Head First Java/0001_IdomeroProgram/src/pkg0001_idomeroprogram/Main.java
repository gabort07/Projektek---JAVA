package pkg0001_idomeroprogram;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Rectangle;

public class Main {

  
    public static void main(String[] args) {
        
        JFrame window = new JFrame();
        window.setSize(640, 480);
        window.setTitle("Időmérő első ablak");
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        drawingComponent DC = new drawingComponent();
        window.add(DC);
    }

}
