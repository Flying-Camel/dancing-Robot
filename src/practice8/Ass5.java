package practice8;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ass5 implements ActionListener
{
	JTextField jf2=new JTextField(10);
	JTextField jf1=new JTextField(10);
	JTextField jf=new JTextField(10);
	double mile,gas;
	String result;


	public Ass5()
	{
		
		JFrame f = new JFrame("week9");
		f.setLayout(new BorderLayout(3,1));
		
		
		
		JPanel jp1=new JPanel();
		jp1.add(new JLabel("Enter the Mile and Gas"));
		f.add(jp1, BorderLayout.NORTH);
		
		
		JPanel jp2=new JPanel();
		jp2.setLayout(new GridLayout(2,2,20,20));
		
		jp2.add(new JLabel("mile:"));
		jp2.add(jf1);
		jp2.add(new JLabel("gas:"));
		jp2.add(jf2);
	    f.add(jp2, BorderLayout.CENTER);
		
		JPanel jp3=new JPanel();
		JButton b=new JButton("Calculate");
		jp3.add(b);
		b.addActionListener(this);
		f.add(jp3, BorderLayout.EAST);
		
		JPanel jp4=new JPanel();
		jp4.add(jf);
		f.add(jp4, BorderLayout.SOUTH);
		
		f.setTitle("GAS");
		f.setSize(500,500);
		f.setVisible(true);
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		Double F;
	    mile=Double.parseDouble(jf1.getText());
	    gas=Double.parseDouble(jf2.getText());
	    F=mile/gas;
		result="MPG:"+F;
		jf.setText(result);
	}
	public static void main(String[] args)
	{
		new Ass5();
	}
}