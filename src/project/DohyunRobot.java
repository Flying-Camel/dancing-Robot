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

public class DohyunRobot extends JComponent implements Dance, Runnable {
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

	public DohyunRobot(int x, int y, BackGround bg) {
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

		GeneralPath drawCap = new GeneralPath();
		drawCap.moveTo(x, y);
		drawCap.lineTo(x, y + 15);
		drawCap.lineTo(x - 15, y + 15);
		drawCap.lineTo(x - 15, y + 30);
		drawCap.lineTo(x - 30, y + 30);
		drawCap.lineTo(x - 30, y + 40);
		drawCap.lineTo(x - 40, y + 40);
		drawCap.lineTo(x - 40, y + 55);
		drawCap.lineTo(x + 100, y + 55);
		drawCap.lineTo(x + 100, y + 40);
		drawCap.lineTo(x + 90, y + 40);
		drawCap.lineTo(x + 90, y + 30);
		drawCap.lineTo(x + 75, y + 30);
		drawCap.lineTo(x + 75, y + 15);
		drawCap.lineTo(x + 60, y + 15);
		drawCap.lineTo(x + 60, y);
		drawCap.lineTo(x, y);
		drawCap.closePath();
		cap = new Area(drawCap);

		g2.setColor(Color.GREEN);
		g2.fill(drawCap);
		g2.draw(drawCap);

		g2.setColor(Color.white);
		Ellipse2D c1 = new Ellipse2D.Double(x + 10, y + 12, 40.0, 30.0);

		g2.fill(c1);
		g2.draw(c1);

		// ¸é»ó
		GeneralPath drawFace = new GeneralPath();

		drawFace.moveTo(x - 10, y + 55);
		drawFace.lineTo(x - 10, y + 90);
		drawFace.lineTo(x - 20, y + 100);
		drawFace.lineTo(x - 25, y + 115);
		drawFace.lineTo(x - 20, y + 125);
		drawFace.lineTo(x - 10, y + 135);
		drawFace.lineTo(x + 70, y + 135);
		drawFace.lineTo(x + 80, y + 125);
		drawFace.lineTo(x + 85, y + 115);
		drawFace.lineTo(x + 80, y + 100);
		drawFace.lineTo(x + 70, y + 90);
		drawFace.lineTo(x + 70, y + 55);
		drawFace.lineTo(x - 10, y + 55);
		drawFace.closePath();
		cap.add(new Area(drawFace));

		Rectangle2D neck = new Rectangle2D.Double(x + 20, y + 135, 20.0, 7.0);

		g2.setColor(new Color(255, 200, 200));
		g2.fill(drawFace);
		g2.fill(neck);
		g2.draw(drawFace);
		g2.draw(neck);

		g2.setColor(Color.white);
		Ellipse2D lefteye = new Ellipse2D.Double(x + 5, y + 65, 25.0, 30.0);
		Ellipse2D righteye = new Ellipse2D.Double(x + 30, y + 65, 25.0, 30.0);
		g2.fill(lefteye);
		g2.fill(righteye);
		g2.draw(lefteye);
		g2.draw(righteye);

		g2.setColor(Color.BLACK);
		Ellipse2D lefteye2 = new Ellipse2D.Double(x + 15, y + 72, 10.0, 15.0);
		Ellipse2D righteye2 = new Ellipse2D.Double(x + 35, y + 72, 10.0, 15.0);
		g2.fill(lefteye2);
		g2.fill(righteye2);
		g2.draw(lefteye2);
		g2.draw(righteye2);

		// ¿Ê
		g2.setColor(new Color(100, 100, 255));
		Rectangle2D cloths1 = new Rectangle2D.Double(x - 25, y + 155, 110, 60);
		g2.fill(cloths1);
		g2.draw(cloths1);

		g2.setColor(Color.GREEN);
		Rectangle2D cloths2 = new Rectangle2D.Double(x + 5, y + 145, 50, 40);
		g2.fill(cloths2);
		g2.draw(cloths2);

		g2.setColor(Color.YELLOW);
		Ellipse2D cloths3 = new Ellipse2D.Double(x - 20, y + 190, 20, 20);
		Ellipse2D cloths4 = new Ellipse2D.Double(x + 60, y + 190, 20, 20);
		g2.fill(cloths3);
		g2.fill(cloths4);
		g2.draw(cloths3);
		g2.draw(cloths4);
		
		cap.add(new Area(cloths3));
		cap.add(new Area(cloths4));
		cap.add(new Area(cloths1));
		cap.add(new Area(cloths2));


		if (move == 0) {
			// ´Ù¸®

			Rectangle2D leftLeg = new Rectangle2D.Double(x - 20, y + 215, 30,
					60);
			Rectangle2D rightLeg = new Rectangle2D.Double(x + 50, y + 215, 30,
					60);
			g2.setColor(new Color(100, 100, 255));
			g2.fill(leftLeg);
			g2.fill(rightLeg);
			g2.draw(leftLeg);
			g2.draw(rightLeg);
			cap.add(new Area(leftLeg));
			cap.add(new Area(rightLeg));

			// ÆÈ
			g2.setColor(Color.GREEN);
			Rectangle2D leftArm = new Rectangle2D.Double(x - 45, y + 160, 20,
					70);
			Rectangle2D rightArm = new Rectangle2D.Double(x + 85, y + 160, 20,
					70);

			g2.fill(leftArm);
			g2.fill(rightArm);
			g2.draw(leftArm);
			g2.draw(rightArm);
			cap.add(new Area(leftArm));
			cap.add(new Area(rightArm));
		}

		if (move == 1) {
			// ´Ù¸®
			Rectangle2D leftLeg = new Rectangle2D.Double(x - 20, y + 215, 30,
					60);
			Rectangle2D rightLeg = new Rectangle2D.Double(x + 50, y + 215, 60,
					30);
			g2.setColor(new Color(100, 100, 255));
			g2.fill(leftLeg);
			g2.fill(rightLeg);
			g2.draw(leftLeg);
			g2.draw(rightLeg);
			cap.add(new Area(leftLeg));
			cap.add(new Area(rightLeg));

			// ÆÈ
			g2.setColor(Color.GREEN);
			Rectangle2D leftArm = new Rectangle2D.Double(x - 95, y + 160, 70,
					20);
			Rectangle2D rightArm = new Rectangle2D.Double(x + 85, y + 160, 70,
					20);

			g2.fill(leftArm);
			g2.fill(rightArm);
			g2.draw(leftArm);
			g2.draw(rightArm);
			cap.add(new Area(leftArm));
			cap.add(new Area(rightArm));
		}

		if (move == 2) {
			// ´Ù¸®
			Rectangle2D leftLeg = new Rectangle2D.Double(x - 20, y + 215, 30,
					60);
			Rectangle2D rightLeg = new Rectangle2D.Double(x + 50, y + 215, 60,
					30);
			g2.setColor(new Color(100, 100, 255));
			g2.fill(leftLeg);
			g2.fill(rightLeg);
			g2.draw(leftLeg);
			g2.draw(rightLeg);
			cap.add(new Area(leftLeg));
			cap.add(new Area(rightLeg));

			// ÆÈ
			g2.setColor(Color.GREEN);
			Rectangle2D leftArm = new Rectangle2D.Double(x - 45, y + 160, 20,
					70);
			Rectangle2D rightArm = new Rectangle2D.Double(x + 85, y + 160, 20,
					70);

			g2.fill(leftArm);
			g2.fill(rightArm);
			g2.draw(leftArm);
			g2.draw(rightArm);
			cap.add(new Area(leftArm));
			cap.add(new Area(rightArm));

		}

		if (move == 3) { // ´Ù¸®
			Rectangle2D leftLeg = new Rectangle2D.Double(x - 20, y + 215, 30,
					60);
			Rectangle2D rightLeg = new Rectangle2D.Double(x + 50, y + 215, 30,
					60);
			g2.setColor(new Color(100, 100, 255));
			g2.fill(leftLeg);
			g2.fill(rightLeg);
			g2.draw(leftLeg);
			g2.draw(rightLeg);
			cap.add(new Area(leftLeg));
			cap.add(new Area(rightLeg));

			// ÆÈ
			g2.setColor(Color.GREEN);
			Rectangle2D leftArm = new Rectangle2D.Double(x - 95, y + 160, 70,
					20);
			Rectangle2D rightArm = new Rectangle2D.Double(x + 85, y + 160, 70,
					20);

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
			x -= 5;
		}
		if (move == 1) {
			move = 2;
			pause(70, 1000);
			x += 5;
		}
		if (move == 2) {
			move = 3;
			pause(70, 1000);
			x += 5;
		}
		if (move == 3) {
			move = 0;
			pause(70, 1000);
			x -= 5;
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
		move = 0;
		this.y = y;

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
