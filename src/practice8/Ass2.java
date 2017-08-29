package practice8;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ass2 {
	static public void main(String[] args){
		JFrame f = new JFrame("Printer");
		
		f.setSize(400,200);
		f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel center = new JPanel(new GridLayout(3,1));
		JPanel east = new JPanel(new GridLayout(4,1));

		Checkbox show1 = new Checkbox("Show to grid");
		Checkbox show2 = new Checkbox("Show Grid");

		Label printer = new Label("printer : My printer",Label.LEFT);
		
		TextField xx = new TextField(1);
		TextField yy = new TextField(1);
		
		Button ok = new Button("OK");
		Button cancel = new Button("Cancel");
		Button setup = new Button("Set up");
		Button help = new Button("Help");
	
		JPanel centerTotal = new JPanel(new GridLayout(3,1));
		JPanel center1 = new JPanel(new GridLayout(1,1));
		center1.add(printer);
		JPanel center2 = new JPanel(new GridLayout(1,5));
		JPanel center22 = new JPanel(new GridLayout(3,1));
		JPanel center33 = new JPanel(new GridLayout(3,1));
		JPanel center3 = new JPanel(new GridLayout(1,3));

		center2.add(new TextField(1));
		center2.add(center22);
		center22.add(new JCheckBox("Image"));
		center22.add(new JCheckBox("Text"));
		center22.add(new JCheckBox("Code"));
		center2.add(new TextField(1));
		center33.add(new JRadioButton("Selection"));
		center33.add(new JRadioButton("All"));
		center33.add(new JRadioButton("Aplet"));
		center2.add(center33);
		center2.add(new TextField(1));
		
		Label quality = new Label("print quality",Label.LEFT);
		center3.add(quality);
		JComboBox combo= new JComboBox();
		combo.addItem("High");
		combo.addItem("Low");
		center3.add(combo);
		center3.add(new JRadioButton("Print to File"));
		
		center.add(center1);
		center.add(center2);
		center.add(center3);
		
		east.add(ok);
		east.add(cancel);
		east.add(setup);
		east.add(help);

		f.add("Center", center);
		f.add("East",east);
		
		f.setVisible(true);
	}
}
