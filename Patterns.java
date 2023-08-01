import java.applet.*;
import java.awt.*;
public class Patterns extends Applet
{
 public void paint(Graphics g)
 {
  g.drawLine(210,70,100,70);
  g.drawRect(100,265,100,100);
  g.drawOval(50,220,200,200);
  g.drawOval(130,30,50,40);
  g.drawOval(80,70,150,150);
  g.setColor(Color.YELLOW);
  g.fillOval(80,70,150,150);
  g.setColor(Color.BLACK);
  g.fillOval(120,120,15,15);
  g.fillOval(170,120,15,15);
  g.drawArc(130,180,50,20,180,180);
  }
}