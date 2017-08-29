package practice7;

import javax.swing.JFrame;

public class Ass5Test {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(300, 400);

		frame.setTitle("Circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Ass5 component = new Ass5();
		frame.add(component);

		frame.setVisible(true);

	}

}
