package practice10;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Ass5Test  {
	static public void main(String[] args){
		Ass5 car = new Ass5();
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setLayout(new BorderLayout());
		frame.setTitle("Car");
		frame.add(car);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		class TimerListener implements ActionListener
	      {
	         public void actionPerformed(ActionEvent event)
	         {
	            car.move();
	         }
	      }

	      ActionListener listener = new TimerListener();

	      final int DELAY = 100;
	      Timer t = new Timer(DELAY, listener);
	      t.start();      
	   }

		
	}


