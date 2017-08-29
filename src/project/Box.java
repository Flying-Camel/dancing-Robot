package project;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.io.File;

import javax.swing.JComponent;

public class Box extends JComponent implements Runnable {
	private int x,y;
	private Rectangle2D block;
	private BackGround bg;
	private boolean ishit=false;
	private Image img2;
	
	public Box(int x,BackGround bg){
		this.x=x;
		this.y=150;
		this.bg=bg;
	}
	
	public Rectangle2D getBlock(){
		return block;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		
		if(!ishit)
			img2 = Toolkit.getDefaultToolkit().getImage("box.jpg");
		else
			img2 = Toolkit.getDefaultToolkit().getImage("coin.jpg");


		block = new Rectangle2D.Double(x, y, 100, 100);
		g.drawImage(img2, x, y, 100, 100, this);
		g2.draw(block);
		
		
	}
	public void setHit(){
		ishit=true;
	}
	public void hit(){
		
		File coIn =new File("Coin.wav");
		Main.coinSound(coIn);
		
		pause(100,-5);
		pause(100,-2);
		pause(100,-1);
		pause(100,1);
		pause(100,2);
		pause(100,5);
		

	}
	// Àá½Ã¸ØÃã ÇÔ¼ö
	public void pause(int delay, int height) {
		try {
			if (height != 1000)
				y += height;
			bg.repaint();
			Thread.sleep(delay);
		} catch (InterruptedException e) {
		}
	}	
	
	@Override
	public void run() {
		
		while (true) {
			try {
				x++;
				if(x>900)
					x=0;
				if(ishit){
					hit();
					ishit=false;
				}
				bg.repaint();
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}
	
}
