package practice8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ass4 implements ActionListener {
	static JTextField text = new JTextField(5);
	static JLabel label2 = new JLabel("Fahrenheit = 0");
	
	public Ass4(){
		JFrame f = new JFrame("week9");
		f.setSize(300, 150);
		f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel(new GridLayout(3, 1));
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Enter the reading in Celsius");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Serif", Font.BOLD, 20));
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setFont(new Font("Serif", Font.BOLD, 20));

		panel.add(label);
		panel2.add(text);
		JButton convert = new JButton("convert");
		convert.addActionListener(this); 
		panel2.add(convert);
		panel.add(panel2);
		panel.add(label2);

		f.add(panel);
		f.setVisible(true);		
	}
	
	static public void main(String[] args) {
		new Ass4();
	}

	public void actionPerformed(ActionEvent e) {

		double C = Integer.parseInt(text.getText());
		label2.setText("" + (1.8 * C + 32.0));

	}
}
