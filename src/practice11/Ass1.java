package practice11;

import java.awt.Rectangle;

public class Ass1 extends Rectangle {
	public Ass1(int x,int y){
		super(x,y);
	}
	public boolean equals(Object o){
		Rectangle r1 = (Rectangle) o;
		return r1.getWidth()==this.getWidth() && r1.getHeight()==this.getHeight();
	}
	
	
}
