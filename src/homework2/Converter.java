package homework2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.AncestorListener;

public class Converter extends JPanel implements ActionListener{
	
	JPanel bottom = new JPanel();
	Rectangle temp1 = new Rectangle();
	Rectangle temp2 = new Rectangle();
	JTextField cel = new JTextField(10);
	JTextField fah = new JTextField(10);
	JButton convertCel = new JButton("CONVERT!");
	JButton convertFah = new JButton("CONVERT!");
	JLabel labelCel = new JLabel("Celsius",SwingConstants.CENTER);
	JLabel labelFah = new JLabel("Fahrenheit",SwingConstants.CENTER);
	
	double celsius=0;
	double fahrenheit=0;

	public Converter(){

		bottom.setLayout(new GridLayout(2,3));
		bottom.add(labelFah);
		bottom.add(fah);
		bottom.add(convertFah);
		bottom.add(labelCel);
		bottom.add(cel);
		bottom.add(convertCel);
		convertCel.addActionListener(this);
		convertFah.addActionListener(this);
		
	}
	public JPanel compo(){
		return bottom;
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == convertCel) {
			double C = Double.parseDouble(cel.getText());
			if(C<0 || C>100){
				JOptionPane.showMessageDialog(bottom, "0~100까지 입력해주세요"); 
				fah.setText("");			
				cel.setText("");	
				return ;
			}
			celsius=C;
			fahrenheit=1.8 * C + 32.0;
			cel.setText("");	
		}
		if (ae.getSource() == convertFah) {
			double F = Double.parseDouble(fah.getText());
			if(F<32 || F>212){
				JOptionPane.showMessageDialog(bottom, "32~212 까지 입력해주세요"); 
				fah.setText("");			
				cel.setText("");	
				return ;
			}
			fahrenheit=F;
			celsius=(F-32)/1.8;
			fah.setText("");
		}
		
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); 
		double height = celsius*2;
		Graphics g2 = (Graphics2D) g;
		Rectangle temp1 = new Rectangle(100,100,100,200);
		Rectangle temp2 = new Rectangle(350,100,100,200);
		((Graphics2D) g2).draw(temp1);
		((Graphics2D) g2).draw(temp2);
	
		Font f = new Font("Roman", Font.ITALIC, 30);
		g2.setFont(f);
		g2.drawString("Celsius", 350, 30);
		g2.drawString("Fahrenheit", 90, 30);
		String fa = String.format("%.2f", fahrenheit);
		String cel = String.format("%.2f", celsius);

		g2.drawString(fa+"ºF", 100,400);
		g2.drawString(cel+"ºC", 350,400); 
		
		g2.setColor(Color.RED);
		g2.fillRect(100, (int)(300-height), 100, (int)height);
		g2.fillArc(100, 249, 100, 100, 180,180);
		
		g2.setColor(new Color(200, 80, 80));
		g2.fillRect(350, (int) (300-height), 100, (int)height);
		g2.fillArc(350, 249, 100, 100, 180,180);

		g2.setColor(Color.BLACK);
		g2.setFont(new Font("돋음",20,20));
		
		//왼쪽 온도계 그리기
		g2.drawString("212", 210, 105);
    	g2.drawLine(170, 120, 200, 120);
    	g2.drawLine(170, 140, 200, 140);
    	g2.drawString("176", 210, 150);
    	g2.drawLine(170, 160, 200, 160);
    	g2.drawLine(170, 180, 200, 180);
    	g2.drawString("140", 210, 190);
    	g2.drawLine(170, 200, 200, 200);
    	g2.drawLine(170, 220, 200, 220);
    	g2.drawString("104", 210, 230);
    	g2.drawLine(170, 240, 200, 240);
    	g2.drawLine(170, 260, 200, 260);
    	g2.drawString("68", 210, 270);
    	g2.drawLine(170, 280, 200, 280);
    	g2.drawString("32", 210, 310);
    	
    	//오른쪽 온도계 그리기
    	g2.drawString("100", 460, 105);
    	g2.drawLine(420, 120, 450, 120);
    	g2.drawLine(420, 140, 450, 140);
    	g2.drawString("80", 460, 150);
    	g2.drawLine(420, 160, 450, 160);
    	g2.drawLine(420, 180, 450, 180);
    	g2.drawString("60", 460, 190);
    	g2.drawLine(420, 200, 450, 200);
    	g2.drawLine(420, 220, 450, 220);
    	g2.drawString("40", 460, 230);
    	g2.drawLine(420, 240, 450, 240);
    	g2.drawLine(420, 260, 450, 260);
    	g2.drawString("20", 460, 270);
    	g2.drawLine(420, 280, 450, 280);
    	g2.drawString("0", 460, 310);
	}
}
