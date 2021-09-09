package shad;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class draw_choice extends Applet implements ItemListener {

    Choice choice;
    int c; 
    Label title;
    public void init()
    {
    	title = new Label("SELECT A SHAPE:  ");
        choice = new Choice();
        choice.addItem("SHAPES");
        choice.addItem("RECTANGLE");
        choice.addItem("TRIANGLE");
        choice.addItem("SQUARE");
        choice.addItem("CIRCLE");
        add(title);
        add(choice);
        choice.addItemListener(this);
    }

 public void itemStateChanged (ItemEvent e)
    {
         c= choice.getSelectedIndex();
         repaint();
    }

 public void paint(Graphics g)
	{
         super.paint(g);

         if (c == 1)
         {  
            g.drawString(choice.getItem(1),220,235);
            g.drawRect(150,70,200,150);
            g.fillRect(150,70,200,150);
         }
         if (c == 2)
         {
        	 g.drawString(choice.getItem(2),45,205);
             int[] x={80,160,5};
             int[] y={70,170,170};
             g.drawPolygon(x,y,3);
             g.fillPolygon(x,y,3);
         }
         if (c == 3)
         {
        	 g.drawString(choice.getItem(3),200,265);
        	 g.drawRect(200,200,50,50);
        	 g.fillRect(200,200,50,50);
             
         }
         if (c ==4)
         {
        	 g.drawString(choice.getItem(4),190,290);
             g.drawOval(170,170,90,90);
             g.fillOval(170,170,90,90);
         }
	}
}
/*
<applet code="draw_choice.class" width="500" height="700" border="2">
</applet>
*/