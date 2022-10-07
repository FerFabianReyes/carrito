
package swingdos;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.*;

public class MyCanvas extends JPanel implements KeyListener, ActionListener{
    
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

 
     @Override
    public void keyPressed(KeyEvent event){
        int key = event.getKeyCode();
        
        if(key == KeyEvent.VK_UP){
            pCar.setY(pCar.getY()-Config.CAR_STEP);
        }
        
        if(key == KeyEvent.VK_DOWN){
            pCar.setY(pCar.getY()+Config.CAR_STEP);
        }
        
        if(key == KeyEvent.VK_RIGHT){
            pCar.setY(pCar.getX()+Config.CAR_STEP);
        }
        
        if(key == KeyEvent.VK_LEFT){
            pCar.setY(pCar.getX()-Config.CAR_STEP);
        }
        
        repaint();
    }
    
    
    
 @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    
    
}
