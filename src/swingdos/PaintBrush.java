
package swingdos;
import java.awt.Color;
import java.awt.Graphics;

public class PaintBrush {
    private Graphics g;
    
    public PaintBrush(Graphics g){
        this.g = g;
    }
    
    public void drawCar(Point p){
          g.setColor(Config.RED_MCQUEEN);
          g.fillRect(p.getX(), p.getY(), Config.W_CAR, Config.H_CAR);
          g.fillRect(p.getX()+Config.W_CAR/5, p.getY()-(Config.H_CAR*3)/4, (Config.W_CAR)/2, (Config.H_CAR*3)/4);
          g.setColor(Color.GRAY);
          g.fillOval(p.getX()+(Config.W_CAR*4)/5, p.getY()+Config.H_CAR, Config.W_CAR/5, Config.W_CAR/5);
          g.fillOval(p.getX()+Config.W_CAR/20, p.getY()+Config.H_CAR, Config.W_CAR/5, Config.W_CAR/5);
          g.setColor(Config.GRAY_T);
          g.fillOval((p.getX()+(Config.W_CAR))-Config.W_CAR/7, p.getY()+(Config.H_CAR+ (Config.H_CAR/10)), Config.W_CAR/10, Config.W_CAR/10);
          g.fillOval(p.getX()+Config.W_CAR/10, p.getY()+(Config.H_CAR+ (Config.H_CAR/10)), Config.W_CAR/10, Config.W_CAR/10);
          g.setColor(Config.BLUE);
          g.fillRect(p.getX()+Config.W_CAR/4, p.getY()-(Config.H_CAR*2/3), (Config.W_CAR)/5, (Config.H_CAR*3)/5);
          g.fillRect(p.getX()+Config.W_CAR/2, p.getY()-(Config.H_CAR*2/3), (Config.W_CAR)/6, (Config.H_CAR*3)/5);
          g.setColor(Config.YELLOW);
          g.fillRect((p.getX()+Config.W_CAR)-Config.W_CAR/10, p.getY()+(Config.H_CAR*4)/6, Config.W_CAR/10, Config.H_CAR/10);
          
    }
}
