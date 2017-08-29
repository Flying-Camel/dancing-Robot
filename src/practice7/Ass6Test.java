package practice7;

import javax.swing.JFrame;

public class Ass6Test {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(800, 1000);
		frame.setTitle("saver");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Ass6 compo = new Ass6();

		frame.add(compo);
		frame.setVisible(true);
	}

}
