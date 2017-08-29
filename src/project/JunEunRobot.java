package project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;



import java.io.File;

import javax.swing.JComponent;

public class JunEunRobot extends JComponent implements Dance, Runnable {
	private int x;
	private int y;
	private boolean visible = false;
	private boolean stop = false;
	private boolean bjump = false;
	private BackGround bg;

	private Area cap;
	private int move = 0;

	private int rex = 0, rey = 0;
	private int mx = 0, my = 0;

	private boolean isDragged;

	public JunEunRobot(int x, int y, BackGround bg) {
		this.x = x;
		this.y = y;
		
		this.bg = bg;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		if (!visible) {
			return;
		}

		// ¸ðÀÚ
		GeneralPath drawCap = new GeneralPath();
		drawCap.moveTo(x, y);
		drawCap.lineTo(x, y - 20);
		drawCap.lineTo(x + 10, y - 20);
		drawCap.lineTo(x + 10, y - 40);
		drawCap.lineTo(x + 20, y - 40);
		drawCap.lineTo(x + 20, y - 50);
		drawCap.lineTo(x + 90, y - 50);
		drawCap.lineTo(x + 90, y - 10);
		drawCap.lineTo(x + 150, y - 10);
		drawCap.lineTo(x + 150, y);
		drawCap.lineTo(x, y);
		drawCap.closePath();
		cap = new Area(drawCap);

		g2.setColor(Color.red);
		g2.fill(drawCap);
		g2.draw(drawCap);

		// ¸é»ó
		GeneralPath drawFace = new GeneralPath();
		drawFace.moveTo(x, y);
		drawFace.lineTo(x, y + 50);
		drawFace.lineTo(x, y + 50);
		drawFace.lineTo(x + 100, y + 50);
		drawFace.lineTo(x + 100, y + 20);
		drawFace.lineTo(x + 120, y + 20);
		drawFace.lineTo(x + 120, y + 30);
		drawFace.lineTo(x + 100, y + 30);
		drawFace.lineTo(x + 100, y);
		drawFace.lineTo(x, y);
		cap.add(new Area(drawFace));

		g2.setColor(new Color(255, 200, 200));
		g2.fill(drawFace);
		g2.draw(drawFace);

		g2.setColor(Color.black);
		Ellipse2D eye = new Ellipse2D.Double(x + 80, y + 10, 8.0, 10.0);
		g2.fill(eye);
		g2.draw(eye);

		// ¸öÅë
		GeneralPath drawBody = new GeneralPath();
		drawBody.moveTo(x + 40, y + 50);
		drawBody.lineTo(x + 40, y + 60);
		drawBody.lineTo(x - 10, y + 60);
		drawBody.lineTo(x - 10, y + 120);
		drawBody.lineTo(x + 120, y + 120);
		drawBody.lineTo(x + 120, y + 60);
		drawBody.lineTo(x + 70, y + 60);
		drawBody.lineTo(x + 70, y + 50);
		cap.add(new Area(drawBody));

		g2.setColor(new Color(255, 50, 50));
		g2.fill(drawBody);
		g2.draw(drawBody);

		// ¿Ê
		g2.setColor(new Color(100, 100, 255));
		Rectangle2D cloths1 = new Rectangle2D.Double(x - 10, y + 80, 130, 40);
		Rectangle2D cloths2 = new Rectangle2D.Double(x + 10, y + 60, 30, 40);
		Rectangle2D cloths3 = new Rectangle2D.Double(x + 70, y + 60, 30, 40);

		g2.fill(cloths1);
		g2.fill(cloths2);
		g2.fill(cloths3);
		g2.draw(cloths1);
		g2.draw(cloths2);
		g2.draw(cloths3);

		if (move == 0) {
			// ´Ù¸®
			Rectangle2D leftLeg = new Rectangle2D.Double(x - 10, y + 120, 30,
					60);
			Rectangle2D rightLeg = new Rectangle2D.Double(x + 90, y + 120, 30,
					60);

			g2.fill(leftLeg);
			g2.fill(rightLeg);
			g2.draw(leftLeg);
			g2.draw(rightLeg);
			cap.add(new Area(leftLeg));
			cap.add(new Area(rightLeg));

			// ÆÈ
			g2.setColor(new Color(255, 50, 50));
			Rectangle2D leftArm = new Rectangle2D.Double(x - 80, y + 60, 70, 20);
			Rectangle2D rightArm = new Rectangle2D.Double(x + 120, y + 60, 70,
					20);

			g2.fill(leftArm);
			g2.fill(rightArm);
			g2.draw(leftArm);
			g2.draw(rightArm);
			cap.add(new Area(leftArm));
			cap.add(new Area(rightArm));

		}

		if (move == 1) {
			// ´Ù¸®
			Rectangle2D leftLeg = new Rectangle2D.Double(x - 60, y + 120, 60,
					30);
			Rectangle2D rightLeg = new Rectangle2D.Double(x + 90, y + 120, 30,
					60);

			g2.fill(leftLeg);
			g2.fill(rightLeg);
			g2.draw(leftLeg);
			g2.draw(rightLeg);
			cap.add(new Area(leftLeg));
			cap.add(new Area(rightLeg));

			// ÆÈ
			g2.setColor(new Color(255, 50, 50));
			Rectangle2D leftArm = new Rectangle2D.Double(x - 80, y + 60, 70, 20);
			Rectangle2D rightArm = new Rectangle2D.Double(x + 120, y + 10, 20,
					70);

			g2.fill(leftArm);
			g2.fill(rightArm);
			g2.draw(leftArm);
			g2.draw(rightArm);
			cap.add(new Area(leftArm));
			cap.add(new Area(rightArm));

		}

		if (move == 2) {
			// ´Ù¸®
			Rectangle2D leftLeg = new Rectangle2D.Double(x - 10, y + 120, 30,
					60);
			Rectangle2D rightLeg = new Rectangle2D.Double(x + 90, y + 120, 60,
					30);

			g2.fill(leftLeg);
			g2.fill(rightLeg);
			g2.draw(leftLeg);
			g2.draw(rightLeg);
			cap.add(new Area(leftLeg));
			cap.add(new Area(rightLeg));

			// ÆÈ
			g2.setColor(new Color(255, 50, 50));
			Rectangle2D leftArm = new Rectangle2D.Double(x - 30, y + 10, 20, 70);
			Rectangle2D rightArm = new Rectangle2D.Double(x + 120, y + 60, 70,
					20);

			g2.fill(leftArm);
			g2.fill(rightArm);
			g2.draw(leftArm);
			g2.draw(rightArm);
			cap.add(new Area(leftArm));
			cap.add(new Area(rightArm));

		}

		if (move == 3) {
			// ´Ù¸®
			Rectangle2D leftLeg = new Rectangle2D.Double(x - 10, y + 120, 30,
					60);
			Rectangle2D rightLeg = new Rectangle2D.Double(x + 90, y + 120, 30,
					60);

			g2.fill(leftLeg);
			g2.fill(rightLeg);
			g2.draw(leftLeg);
			g2.draw(rightLeg);
			cap.add(new Area(leftLeg));
			cap.add(new Area(rightLeg));

			// ÆÈ
			g2.setColor(new Color(255, 50, 50));
			Rectangle2D leftArm = new Rectangle2D.Double(x - 30, y + 10, 20, 70);
			Rectangle2D rightArm = new Rectangle2D.Double(x + 120, y + 10, 20,
					70);

			g2.fill(leftArm);
			g2.fill(rightArm);
			g2.draw(leftArm);
			g2.draw(rightArm);
			cap.add(new Area(leftArm));
			cap.add(new Area(rightArm));

		}

		g2.setColor(Color.black);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean getVissible() {
		return visible;
	}

	// µå·¡±×ÇÒ¶§ ÇÊ¿äÇÔ
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Area getArea() {
		return cap;
	}

	public void setVisible() {
		visible = true;
		repaint();
	}

	public void setUnvisible() {
		visible = false;
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

	public void startdancing() {

		if (move == 0) {
			move = 1;
			pause(70, 1000);
			x-=5;
		}
		if (move == 1) {
			move = 2;
			pause(70, 1000);
			x+=5;
		}
		if (move == 2) {
			move = 3;
			pause(70, 1000);
			x+=5;
		}
		if (move == 3) {
			move = 0;
			pause(70, 1000);
			x-=5;
		}

	}

	public void stopdancing() {
		stop = false;
	}

	public void setJump() {
		bjump = true;
	}

	public void setStop() {
		stop = true;
	}

	public void jump() {
		int y = this.y;
		move = 3;
		
		File jum = new File("Jump.wav");
		Main.jumpSound(jum);
		
		pause(70, -100);
		pause(70, -50);
		pause(70, -25);
		pause(70, -12);
		pause(70, -6);
		pause(70, -3);
		pause(70, -1);
		
		pause(70, 1);
		pause(70, 3);
		pause(70, 6);
		pause(70, 12);
		pause(70, 25);
		pause(70, 50);
		pause(70, 100);
		move=0;
		this.y=y;

		
		bjump = false;

	}

	@Override
	public void run() {

		while (true) {
			// ??? ¾øÀ¸¸é ¾ÈµÊ ¤µ¤²;;
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
			}

			while (stop || bjump) {

				try {
					if (bjump)
						jump();
					if (stop)
						startdancing();
					bg.repaint();
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
			}
		}
	}

}
