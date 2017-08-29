package practice8;

import java.util.Scanner;

import javax.swing.JFrame;

public class Ass3Test {
	static public void main(String[] args){
		String str;
		
		Scanner sc=new Scanner(System.in);
		JFrame frame= new JFrame();
		
		frame.setSize(300,400);
		
		frame.setTitle("week9");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.print("Please enter your name:");
		str=sc.nextLine();
		
		Ass3 component=new Ass3(str);
		frame.add(component);
		frame.setVisible(true);
	}
}
