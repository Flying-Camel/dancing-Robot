package practice7;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Ass1 extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics g2 = (Graphics2D) g;
		Rectangle box = new Rectangle(10, 10, 20, 20);
		for (int i = 1; i < 11; i++) {
			box.translate(5, 5);
			box.setRect(10 * i, 10 * i, i * 20, i * 20);
			((Graphics2D) g2).draw(box);
		}
	}
}
