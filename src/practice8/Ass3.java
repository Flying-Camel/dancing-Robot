package practice8;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Ass3 extends JComponent {
	private String name;

	public Ass3(String name) {
		this.name = name;
	}

	public void paintComponent(Graphics g) {

		Font f = new Font("Roman", Font.ITALIC, 30);
		g.setFont(f);
		g.drawString("Good Day!:" + name, 30, 30);

	}
}
