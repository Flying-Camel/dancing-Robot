package practice10;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent {
	private static final int BOX_X = 100;
	private static final int BOX_Y = 100;
	private static final int BOX_WIDTH = 20;
	private static final int BOX_HEIGHT = 30;
	private Rectangle box;
	private int rex=0,rey=0;

	public RectangleComponent() {
		// The rectangle that the paintComponent method draws
		box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		g2.draw(box);
	}

	public void moveBy(int dx, int dy) {
		
		if(box.getX()>250)
			rex=1;
		if(box.getX()<0)
			rex=0;
		if(box.getY()>350)
			rey=1;
		if(box.getY()<0)
			rey=0;
			
		if(rex==1)
			dx=-dx;
		if(rey==1)
			dy=-dy;
		
		box.translate(dx, dy);
		repaint();
	}
}
