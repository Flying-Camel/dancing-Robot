package practice13;

import java.util.Scanner;

import javax.swing.JFrame;

public class Ass4Test {
	static private Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String message;
		
		System.out.println("Enter the Message");
	//	message = in.nextLine();
		
		message = "as";
		Ass4 compo = new Ass4(message);
		
		JFrame f = new JFrame();
		
		f.setSize(500,500);
		f.add(compo);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
		
	}

}
