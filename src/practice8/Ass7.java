package practice8;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class Ass7 {

	public static void main(String[] args) {
		@SuppressWarnings("serial")
		class RandomRec extends JComponent {
			private int n;

			public RandomRec(int n) {
				this.n = n;
			}

			public void paintComponent(Graphics g) {
				Random rd = new Random();

				Graphics2D g2 = (Graphics2D) g;

				for (int i = 0; i < n; i++) {
					Rectangle box = new Rectangle(rd.nextInt(300),
							rd.nextInt(300), rd.nextInt(300), rd.nextInt(300));
					Color col = new Color(rd.nextInt(255), rd.nextInt(255),
							rd.nextInt(255));
					g2.setColor(col);
					g2.setStroke(new BasicStroke(rd.nextInt(5)));
					g2.draw(box);

				}
			}
		}

		String s;
		int n;
		s = JOptionPane.showInputDialog("how ractangle");
		n = Integer.parseInt(s);

		JFrame frame = new JFrame();

		frame.setSize(700, 700);
		frame.setTitle("");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RandomRec rr = new RandomRec(n);

		frame.add(rr);
		frame.setVisible(true);
	}

}
