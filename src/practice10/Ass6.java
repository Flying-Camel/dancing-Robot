package practice10;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class Ass6 extends JComponent {
	private int x = 10, y = 100;
	
	public Ass6(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public void move(int di){
		x+=di;
		repaint();
	}
	

	public void paintComponent(Graphics g) {
		super.paintComponent(g); 
		Graphics2D g2 = (Graphics2D) g;
		
		Car car = new Car(x, y);
		car.draw(g2);
				
	}
}
