package practice7;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JComponent;



@SuppressWarnings("serial")
public class Ass4 extends JComponent
{
	public void paintComponent(Graphics g)
	{
		
		Graphics2D g2=(Graphics2D) g;
		Random r=new Random();
		
		
		
		for(int i=0;i<6;i++)
		{
			g2.setStroke(new BasicStroke(r.nextInt(10)));// ¼± ±½±â ¼³Á¤
			Rectangle box=new Rectangle(r.nextInt(100)+10,r.nextInt(150)+20,r.nextInt(50)+10,r.nextInt(100)+10);
			g.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
		//	box.translate(r.nextInt(100)+100, r.nextInt(200)+100);
	    	g2.draw(box);
		
		
		}
		
		
	}

}
