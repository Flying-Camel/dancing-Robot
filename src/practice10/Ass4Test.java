package practice10;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Ass4Test {
	static public void main(String[] args){
		Ass4 timer = new Ass4();
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setLayout(new BorderLayout());
		frame.setTitle("TIME");
		frame.add(timer);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
