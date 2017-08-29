package practice8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class Ass8 {

	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();

	Color red = new Color(255, 0, 0);
	Color blue = new Color(0, 0, 255);
	Color green = new Color(0, 255, 0);
	Color color;

	JRadioButton r1 = new JRadioButton("Red");
	JRadioButton r2 = new JRadioButton("Blue");
	JRadioButton r3 = new JRadioButton("Green");

	JButton button = new JButton("Change color");
	ButtonGroup bg = new ButtonGroup();
	Graphics2D g2;
	Rectangle rec = new Rectangle(300, 100, 300, 300);
	JFrame canvas;

	public static void main(String aegs[]) {
		Ass8 a8 = new Ass8();
		a8.canvas();
		a8.listener();
	}

	void canvas() {
		canvas = new JFrame();
		canvas.setSize(900, 700);
		canvas.setTitle("");
		canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Recpanel rec = new Recpanel();
		canvas.add(rec, BorderLayout.CENTER);
		canvas.add(addRadio(), BorderLayout.NORTH);
		canvas.add(addButton(), BorderLayout.SOUTH);
		canvas.setVisible(true);
	}

	void listener() {
		button.addActionListener(new MyEvent());
	}

	JPanel addButton() {
		panel2.setLayout(new GridLayout(1, 1));
		panel2.add(button);
		return panel2;
	}

	JPanel addRadio() {
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		r1.setSelected(true);
		color = red;
		bg.add(r1);
	
		panel.add(r1);
		panel.add(r2);
		panel.add(r3);

		return panel;
	}

	@SuppressWarnings("serial")
	class Recpanel extends JPanel {

		public void paintComponent(Graphics g) {
			g2 = (Graphics2D) g;
			g2.setColor(color);
			g2.fill(rec);
			g2.draw(rec);
		}
	}

	class MyEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Enumeration<AbstractButton> enums = bg.getElements();
			while (enums.hasMoreElements()) {
				JRadioButton b = (JRadioButton) enums.nextElement();

				if (b.isSelected()) {
					if (b.getText().equals("Red")) {
						color = red;
					} else if (b.getText().equals("Blue")) {
						color = blue;
					} else if (b.getText().equals("Green")) {
						color = green;
					}
				}
			}
			canvas.repaint();
		}
	}

}