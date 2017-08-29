package practice13;

import javax.swing.JFrame;

public class Ass3Test {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		Ass3 compo = new Ass3();
		
		
		f.setSize(500, 500);
		f.add(compo);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
