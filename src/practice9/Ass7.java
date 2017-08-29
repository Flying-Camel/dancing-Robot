package practice9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ass7 implements ActionListener {
	String x;
	String y;
	String r;
	JFrame f = new JFrame();
	JButton button = new JButton("Draw Circle!");

	static public void main (String[] args){
		new Ass7();
	}
	
	public Ass7(){
		x = JOptionPane.showInputDialog("x축을 입력하세요");
		y = JOptionPane.showInputDialog("y축을 입력하세요");
		r = JOptionPane.showInputDialog("반지름의 길이를 입력하세요");
		f.setLayout(new BorderLayout());
		f.add(button,BorderLayout.SOUTH);
		button.addActionListener(this);
		f.setTitle("JPanel");
		f.setSize(500,500);
		f.setVisible(true);	
		
	}
	public void actionPerformed(ActionEvent e) {
		double x=Double.parseDouble(this.x);
		double y=Double.parseDouble(this.y);
		double r=Double.parseDouble(this.r);
		
		Paint p = new Paint(x,y,r);
		f.add(p,BorderLayout.CENTER);
		f.setVisible(true);	
	}
	@SuppressWarnings("serial")
	public class Paint extends JComponent {
		double x,y,r;
		public Paint(double x,double y, double r){
			this.x=x;
			this.y=y;
			this.r=r;
		}
		public void paintComponent(Graphics g) { 	
	    	Graphics2D g2=(Graphics2D) g;
	    	Ellipse2D ellipse1=new Ellipse2D.Double(x, y, r, r);
	    	g2.setColor(Color.blue);               
	        g2.draw(ellipse1);		
		}
	}
}
