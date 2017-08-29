package practice7;
import javax.swing.JFrame;

public class Ass2Test {
	public static void main(String[] args){
		JFrame frame= new JFrame();
		
		frame.setSize(300,400);
		
		frame.setTitle("Rectangles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Ass2 component=new Ass2();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
	