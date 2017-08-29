package practice7;

import javax.swing.JFrame;

public class Ass3Test {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(400, 400);

		frame.setTitle("Rectangles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Ass3 component = new Ass3();
		frame.add(component);

		frame.setVisible(true);

	}

}