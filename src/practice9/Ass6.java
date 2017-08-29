package practice9;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ass6 extends JFrame implements ActionListener {
	private static int click1 = 0, click2 = 0;
	JFrame frame = new JFrame();
	JButton button = new JButton("CLICK!!");
	JButton button2 = new JButton("CLICK!!");

	static public void main(String[] args) {
		click1 = 0;
		click2 = 0;

		new Ass6();
	}

	public Ass6() {
		frame.setSize(800, 300);
		frame.setLayout(new GridLayout(1, 2));
		frame.setTitle("week9");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button.addActionListener(this);
		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		Paint component = new Paint();
		leftPanel.add(component);
		leftPanel.add(panel, BorderLayout.NORTH);
		leftPanel.add(button, BorderLayout.SOUTH);
		frame.add(leftPanel);

		JPanel rightPanel = new JPanel();
		rightPanel.setLayout(new BorderLayout());
		button2.addActionListener(this);
		JPanel panel2 = new JPanel();
		Paint2 component2 = new Paint2();
		rightPanel.add(component2);
		rightPanel.add(panel2, BorderLayout.NORTH);
		rightPanel.add(button2, BorderLayout.SOUTH);
		frame.add(rightPanel);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == button) {
			click1++;
		}
		if (ae.getSource() == button2) {
			click2++;
		}
		frame.repaint();
	}

	public class Paint extends JComponent {
		public void paintComponent(Graphics g) {
			Font f = new Font("Roman", Font.ITALIC, 30);
			g.setFont(f);
			g.drawString("I was clicked " + click1 + " times!!", 30, 30);
		}
	}

	public class Paint2 extends JComponent {
		public void paintComponent(Graphics g) {
			Font f = new Font("Roman", Font.ITALIC, 30);
			g.setFont(f);
			g.drawString("I was clicked " + click2 + " times!!", 30, 30);
		}
	}
}
