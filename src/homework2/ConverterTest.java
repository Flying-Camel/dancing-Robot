package homework2;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.plaf.BorderUIResource;

public class ConverterTest {
	static public void main(String[] args){
		Converter convert = new Converter();
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setLayout(new BorderLayout());
		frame.setTitle("¿Âµµ°è");
		frame.add(convert);
		frame.add(convert.compo(),BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
