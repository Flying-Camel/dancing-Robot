package practice13;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Area;
import java.sql.Time;

import javax.swing.Timer;
import javax.swing.JComponent;

public class Ass3 extends JComponent implements MouseMotionListener,MouseListener{
		private String timeString =  "";
		private int x=100;
		private int y=100;
		private Area a1;
		private boolean isDragged = false;

		
		Timer t;
		Time time;
		
		public Ass3(){
			addMouseListener(this);
			addMouseMotionListener(this);

			ActionListener timeAction = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					time = new Time(System.currentTimeMillis());	
				}
			};
			new Timer(10, timeAction).start();
		}
	
	
	
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.GREEN);
			g.fillRect(0, 0, 500, 500);
			
			g.setColor(Color.RED);
			Font f = new Font("Roman", 40, 40);
			g.setFont(f);
			g.drawString(time.toString(), x, y);
			
			Rectangle rec = new Rectangle(x, y-40, 160, 40);
			a1 = new Area(rec);
			
			repaint();
		}

		
		@Override
		public void mouseMoved(MouseEvent e) {
			
			
		}



		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}



		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}



		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			if(isDragged){
				x=e.getX();
				y=e.getY();
			}
			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			if(!isDragged && a1.contains(e.getX(), e.getY())){
				isDragged=true;
			}
			
		}@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
		
	
}	
