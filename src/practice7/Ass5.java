package practice7;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

import java.lang.Math;
 
@SuppressWarnings("serial")
public class Ass5 extends JComponent
{
 
    public void paintComponent(Graphics g)
    {
    	
    	double r=100.0;
    	
    	Graphics2D g2=(Graphics2D) g;
		
    	Ellipse2D ellipse1=new Ellipse2D.Double(0.0, 0.0, r, r);
        g2.drawString("AREA:"+Math.PI*Math.pow(r, 2),0, 120);
        g2.drawString("Diameter:"+2*r, 0, 140);
        g2.drawString("Circumference"+2*Math.PI*r, 0, 160);
        g2.setColor(Color.blue);                 //파란색으로 셋팅
        g2.draw(ellipse1);
       
    }
}
 
