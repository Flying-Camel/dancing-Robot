package practice7;
import javax.swing.JComponent;
import javax.swing.JPanel;

import java.awt.*;

@SuppressWarnings("serial")
public class Ass2 extends JComponent {	
	public Ass2(){
		
	}
	public void paintComponent(Graphics g){
    
    	
    	
    	int[] xArray = {130, 80, 100, 160, 180, 50, 50, 190};
    	int[] yArray = {80, 70, 110, 120, 50, 50, 140, 140};
    	   
    	
    	
    	Graphics2D g2=(Graphics2D) g;
    	
    	g.drawPolyline (xArray, yArray, 8);
    	
	}

}

