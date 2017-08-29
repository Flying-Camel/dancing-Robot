package practice7;


import javax.swing.JFrame;

public class Ass4Test
{
	public static void main(String[] args)
	{
		JFrame frame= new JFrame();
		
		frame.setSize(600,600);
		
		frame.setTitle("Rectangles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Ass4 component=new Ass4();
		frame.add(component);
		
		frame.setVisible(true);
		
	}

}
