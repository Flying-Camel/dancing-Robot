package practice10;

import java.awt.event.MouseEvent;

public interface MouseListener { 
	void mousePressed(MouseEvent event); 
	// Called when a mouse button has been pressed on a  
	// component 
	void mouseReleased(MouseEvent event); 
	// Called when a mouse button has been released on a 
	// component 
	void mouseClicked(MouseEvent event); 
	// Called when the mouse has been clicked on a component 
	void mouseEntered(MouseEvent event); 
	// Called when the mouse enters a component
    void mouseExited(MouseEvent event); 
    // Called when the mouse exits a component 
} 
