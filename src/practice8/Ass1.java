package practice8;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ass1 {
	static public void main(String[] args){
		JFrame f = new JFrame("Align");
		f.setSize(200,100);
		f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel west = new JPanel(new GridLayout(2,1));
		JPanel center = new JPanel(new GridLayout(2,1));
		JPanel east = new JPanel(new GridLayout(3,1));

		Checkbox show1 = new Checkbox("Show to grid");
		Checkbox show2 = new Checkbox("Show Grid");

		Label x = new Label("x : ",Label.RIGHT);
		Label y = new Label("x : ",Label.RIGHT);
		TextField xx = new TextField(1);
		TextField yy = new TextField(1);
		
		Button ok = new Button("OK");
		Button cancel = new Button("Cancel");
		Button help = new Button("Help");
	
		west.add(show1);
		west.add(show2);
		center.add(x);
		center.add(xx);
		center.add(y);
		center.add(yy);
		east.add(ok);
		east.add(cancel);
		east.add(help);

		f.add("West", west);
		f.add("Center", center);
		f.add("East",east);
		
		f.setVisible(true);
	}
}
