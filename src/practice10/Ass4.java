package practice10;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ass4 extends JPanel {
	static long currentSecond;
	static long currentMin;
	static long currentHours;

	public Ass4() {
		long milli = System.currentTimeMillis();
		long seconds = milli / 1000;
		currentSecond = seconds % 60;
		long minutes = seconds / 60;
		currentMin = minutes % 60;
		long hours = currentMin / 60;
		currentHours = hours % 24;
	}

	public void paintComponent(Graphics g) {
		Graphics g2 = (Graphics2D) g;
		Font f = new Font("Roman", Font.ITALIC, 30);
		g2.setFont(f);

		super.paintComponent(g);

		long milli = System.currentTimeMillis();
		long seconds = milli / 1000;
		currentSecond = seconds % 60;
		long minutes = seconds / 60;
		currentMin = minutes % 60;
		long hours = currentMin / 60;
		currentHours = hours % 24;
		g2.drawString(currentHours + "Ω√ " + currentMin + "∫– " + currentSecond
				+ "√ ", 0, 100);
		
		repaint();

	}
}
