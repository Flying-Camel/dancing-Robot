package practice7;
import javax.swing.JFrame;

public class Ass1Test {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		
		frame.setSize(500,500);
		frame.setTitle("Rectangles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Ass1 component = new Ass1();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
	