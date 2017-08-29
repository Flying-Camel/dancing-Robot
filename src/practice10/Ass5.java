package practice10;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Ass5 extends JComponent {
	private int x = 10, y = 100;
	
	public void move(){
		x+=10;
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); 
		Graphics2D g2 = (Graphics2D) g;
		
		Car car = new Car(x, y);
		car.draw(g2);
				
	}

}