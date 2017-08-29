package practice10;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ass6Test {
	static public void main(String[] args){
		Ass6 car = new Ass6(10,100);
		Ass6 car2 = new Ass6(500,100);
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setLayout(new GridLayout(2,1));
		frame.setTitle("Car2");
		frame.add(car);
		frame.add(car2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		class TimerListener implements ActionListener
	      {
	         public void actionPerformed(ActionEvent event)
	         {
	            car.move(10);
	            car2.move(-10);
	         }
	      }

	      ActionListener listener = new TimerListener();

	      final int DELAY = 100;
	      Timer t = new Timer(DELAY, listener);
	      t.start();      
	   }

		
}
