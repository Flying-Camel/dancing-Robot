package practice7;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;
import java.awt.*;

@SuppressWarnings("serial")
public class Ass6 extends JComponent
{
	public void paintComponent(Graphics g)
	{
		int i =0;
		int[] number = new int[10];
		int[] thick = new int[5];
		

		Graphics2D g2 = (Graphics2D)g;
		Random r = new Random();
		
		for(i=0; i<5; i++)
		{
			number[i] = r.nextInt(255);
			thick[i] = r.nextInt(7);
		}
		
		for(i=0; i<5; i++)
		{
			Line2D.Double segment = new Line2D.Double(number[i], number[i+1],number[i+2],number[i+3]);
			Color color = new Color(number[i], number[i+1],number[i+2],number[i+3]);
			
			g2.draw(segment);
			g2.setColor(color);
			g2.setStroke(new BasicStroke(thick[i],BasicStroke.CAP_ROUND,0));
			repaint();
			try {
				Thread.sleep(50); //  ¸ØÃã
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
