package practice8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ass9 implements ActionListener {
	
	private Color c = new Color(255,0,0);
	JRadioButton b1 = new JRadioButton("red");
	JRadioButton b2 = new JRadioButton("blue");
	JRadioButton b3 = new JRadioButton("Green");
	Rect rect = new Rect();

	public class Rect extends JComponent {
		public void paintComponent(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			Rectangle rec = new Rectangle(100,100,100,100);
			g2.setColor(c);
			g2.fill(rec);
			g2.draw(rec);
		}
	}

	public Ass9() {
		JFrame f = new JFrame();
		JPanel p = new JPanel(new GridLayout(1, 3));

		JButton button = new JButton("Change!!!");
		button.addActionListener(this);

		ButtonGroup bg = new ButtonGroup();
		

		
		bg.add(b1);
		b1.setSelected(true);
		bg.add(b2);
		bg.add(b3);
		p.add(b1);
		p.add(b2);
		p.add(b3);

		f.setSize(1000, 1000);
		f.setLayout(new GridLayout(3, 1));
		f.add(p);
		f.add(rect);
		f.add(button);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	static public void main(String[] args) {
		new Ass9();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(b1.isSelected())
			c = new Color(255,0,0);
		if(b2.isSelected())
			c = new Color(0,255,0);
		if(b3.isSelected())
			c = new Color(0,0,255);
		
		rect.repaint();		
		
		
	}
}
