package practice13;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.Timer;

public class Ass4 extends JComponent implements ActionListener {
	private String message = "";
	private Timer timer;
	
	private int x;
	private int y;
	private int size;
	private int r;
	private int gg;
	private int b;
	
	
	public Ass4(String message){
		this.message = message;
				
		timer = new Timer(100, this);
		timer.start();
	}
	

	public void paintComponent(Graphics g){
		
		g.setColor(Color.black);
		g.fillRect(0, 0, 500, 500);
		Font f = new Font("Roman",100,size);
		g.setFont(f);
		g.setColor(new Color(r, gg, b));
		g.drawString(message, x, y);
		
		repaint();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random ran = new Random();

		x=ran.nextInt(500);
		y=ran.nextInt(500);
		size = ran.nextInt(100)+50;
		r=ran.nextInt(255);
		gg=ran.nextInt(255);
		b=ran.nextInt(255);
	}
	
}
