package practice9;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.ietf.jgss.MessageProp;

@SuppressWarnings("serial")
public class Ass5 extends JFrame implements ActionListener {
	private static int click;
	JFrame frame = new JFrame();
	static public void main(String[] args) {
		click=0;
		
		new Ass5();
	}

	public Ass5() {
		frame.setSize(700, 300);
		frame.setTitle("week9");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("CLICK!!");
		button.addActionListener(this);
		JPanel panel = new JPanel();		
		Paint component = new Paint();
		frame.add(component);		
		frame.add(panel,BorderLayout.NORTH);
		frame.add(button, BorderLayout.SOUTH);
		frame.setVisible(true);	
	}

	public void actionPerformed(ActionEvent ae) {
		click++;
		frame.repaint();
	}

	public class Paint extends JComponent {
		public void paintComponent(Graphics g) {
			Font f = new Font("Roman", Font.ITALIC, 30);
			g.setFont(f);
			g.drawString("I was clicked " + click + " times!!", 30, 30);
		}
	}
}
