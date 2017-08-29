package practice7;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;
import java.awt.Color;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Ass3 extends JComponent {

	public void paintComponent(Graphics g) {

		Random r = new Random();

		Graphics2D g2 = (Graphics2D) g;

		for (int i = 0; i < 6; i++) {
			g2.setStroke(new BasicStroke(r.nextInt(10)));// ¼± ±½±â ¼³Á¤
			Line2D.Double line1 = new Line2D.Double(r.nextDouble()
					* (r.nextInt(100) + 100), r.nextDouble()
					* (r.nextInt(100) + 100), r.nextDouble()
					* (r.nextInt(100) + 100), r.nextDouble()
					* (r.nextInt(100) + 100));
			g.setColor(new Color((int) (Math.random() * 255), (int) (Math
					.random() * 255), (int) (Math.random() * 255)));
			g2.draw(line1);
		}

	}
}