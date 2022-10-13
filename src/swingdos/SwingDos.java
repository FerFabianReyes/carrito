
package swingdos;
import javax.swing.*;

public class SwingDos {
    public static void main (String args[]) {
       JFrame window = new JFrame("SwingDos");
       MyCanvas canvas = new MyCanvas();
       
       window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       window.setSize(Config.WINDOW_H, Config.WINDOW_W);
       window.add(canvas);
       window.pack();
       window.setResizable(false); 
       window.setLocationRelativeTo(null); 
       window.setVisible(true);
       
       window.addKeyListener(canvas);
    }
    
}
