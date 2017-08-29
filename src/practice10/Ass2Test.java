package practice10;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Ass2Test extends JFrame {
	private int x;
	private int y;
	private double r;
	private int count=0;
	JFrame f = new JFrame();

	public Ass2Test() {
		Ass2 compo = new Ass2();
		
		class MousePressListener implements MouseListener, java.awt.event.MouseListener  {
			@Override
			public void mousePressed(MouseEvent event) {

			}
			@Override
			public void mouseReleased(MouseEvent event) {
				// TODO Auto-generated method stub
			}
			@Override
			public void mouseClicked(MouseEvent event) {
				// TODO Auto-generated method stub	
				x=event.getX();
				y=event.getY();
				compo.click(x,y);
			}
			@Override
			public void mouseEntered(MouseEvent event) {
				// TODO Auto-generated method stub
			}
			@Override
			public void mouseExited(MouseEvent event) {
				// TODO Auto-generated method stub
			}
		}
		
		f.setTitle("원그리기");
		f.setSize(1000, 1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		compo.addMouseListener(new MousePressListener());
		f.add(compo);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Ass2Test();
	}
}
