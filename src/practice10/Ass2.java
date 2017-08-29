package practice10;

import java.awt.Graphics;
import java.util.logging.Logger;
import javax.swing.JComponent;


@SuppressWarnings("serial")
public class Ass2 extends JComponent {
	private int x=0;
	private int y=0;
	private int count=0;
	private double r=0;

	public Ass2(){

	}
	public void click(int x,int y){
		if(count==0){
			this.x=x;
			this.y=y;
			System.out.println(x+"  "+y);
			count++;
		}
		else{
			System.out.println(x+"  "+y);
			r = Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));	
			r+=r;
			repaint();
			count=0;
		}
	}
	public void paint(Graphics g){
		Graphics g2 = (Graphics) g;
		g2.drawOval(x, y, (int)r, (int)r);
		System.out.println(x+"  "+y+"  "+r);
	}
}
