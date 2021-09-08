import java.applet.*;
import java.awt.*;
public class myapplet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawLine(20,20,200,20);
        g.setColor(Color.CYAN);
        g.drawRect(20,80,150,150);
        g.setColor(Color.YELLOW);
        g.drawOval(30,400,300,200);
        
    }
}
/*
<applet code="myapplet.class" width="500" height="700" border="2">
</applet>
*/