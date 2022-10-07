
package swingdos;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.*;

public class MyCanvas extends JPanel {
    
    //Point pCar = new Point(Config.WINDOW_W/2, Config.WINDOW_H/2);
    Point pCar = new Point(Config.WINDOW_W/2, Config.WINDOW_H/2);
    
    public MyCanvas(){
        setPreferredSize(new Dimension(Config.WINDOW_W, Config.WINDOW_H));
    }
    
    @Override
    protected void paintComponent (Graphics g){
     super.paintComponent(g);
     PaintBrush paintBrush = new PaintBrush(g);
     
     paintBrush.drawCar(pCar);
    }
    
    
    
}
