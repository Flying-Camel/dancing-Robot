package project;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JComponent;

public class BackGround extends JComponent implements MouseListener,
		MouseMotionListener {
	private JunEunRobot r1 = null;
	private DohyunRobot r2 = null;
	private Box b1 = new Box(180,this);
	private Box b2 = new Box(620,this);
	
	
	private boolean stop = false;
	private boolean isDragged1 = false;
	private boolean isDragged2 = false;
	private boolean isGame = false;
	private int mx = 0, my = 0;
	private int y=150;
	private int marioHit=0;
	private int luigiHit=0;
	
	private Thread rt1 = null;
	private Thread rt2 = null;
	private Thread bt1 = new Thread(b1);
	private Thread bt2 = new Thread(b2);

	
	public JunEunRobot getRobot1() {
		return r1;
	}

	public DohyunRobot getRobot2() {
		return r2;
	}
	
	public void r1Start(){
		rt1.start();
	}
	public void r2Start(){
		rt2.start();
	}
	
	public void setGame(){
		isGame=true;
	}

	public BackGround() {
		Random ran = new Random();
		r1 = new JunEunRobot(ran.nextInt(800), ran.nextInt(100) + 430, this);
		r2 = new DohyunRobot(ran.nextInt(800), ran.nextInt(100) + 430, this);

		rt1 = new Thread(r1);
		rt2 = new Thread(r2);

		bt1.start();
		bt2.start();
		
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Image img = Toolkit.getDefaultToolkit().getImage("mario.png");
		g.drawImage(img, 0, 0, 1024, 700, this);

		Graphics2D g2 = (Graphics2D) g;
		r1.paintComponent(g2);
		r2.paintComponent(g2);

		b1.paintComponent(g2);
		b2.paintComponent(g2);
		
		
		Font f = new Font("Roman",100,50);
		g.setFont(f);
		
		g.drawString("Mario Hit : "+Integer.toString(marioHit), 30, 70);
		g.drawString("Luigi Hit : "+Integer.toString(luigiHit), 700, 70);

		if (r1.getVissible() && (r1.getArea().intersects(b2.getBlock())||r1.getArea().intersects(b1.getBlock()))) {
			r1.setY(350); //이걸 해줘야 머리가 박스에 붙어있는다.
			
			if(r1.getArea().intersects(b1.getBlock()))
				b1.setHit();
			
			if(r1.getArea().intersects(b2.getBlock()))
				b2.setHit();
			
			if(isGame)
				marioHit++;
			
			repaint();
		}
		
		if (r2.getVissible() && (r2.getArea().intersects(b2.getBlock())||r2.getArea().intersects(b1.getBlock()))) {
			r2.setY(300); //이걸 해줘야 머리가 박스에 붙어있는다.
			
			if(r2.getArea().intersects(b1.getBlock()))
				b1.setHit();
			
			if(r2.getArea().intersects(b2.getBlock()))
				b2.setHit();
			
			if(isGame)
				luigiHit++;
			
			repaint();
		}
	}
	

	public void stop() {
		marioHit=0;
		luigiHit=0;
		isGame=false;
		
		r1.stopdancing();
		r2.stopdancing();
	}

	public boolean r1Visible() {
		r1.setVisible();
		repaint();
		return true;
	}

	public void r1UnVisible() {
		r1.setUnvisible();
		repaint();
	}

	public boolean r2Visible() {
		r2.setVisible();
		repaint();
		return true;
	}

	@Override
	public void mouseClicked(MouseEvent m) {
	}

	@Override
	public void mouseEntered(MouseEvent m) {
	}

	@Override
	public void mouseExited(MouseEvent m) {
	}

	@Override
	public void mousePressed(MouseEvent m) {
		if (r1.getVissible() && r1.getArea().contains(m.getX(), m.getY())) {
			mx = m.getX() - r1.getX();
			my = m.getY() - r1.getY();
			isDragged1 = true;
		}
		if (r2.getVissible() && r2.getArea().contains(m.getX(), m.getY())) {
			mx = m.getX() - r2.getX();
			my = m.getY() - r2.getY();
			isDragged2 = true;
		}
	}

	@Override
	public void mouseReleased(MouseEvent m) {
		isDragged1 = false;
		isDragged2 = false;
	}

	@Override
	public void mouseDragged(MouseEvent m) {
		if (isDragged1) {
			r1.setX(m.getX() - mx);
			r1.setY(m.getY() - my);
		}
		if (isDragged2) {
			r2.setX(m.getX() - mx);
			r2.setY(m.getY() - my);
		}

		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent m) {
	}

}
