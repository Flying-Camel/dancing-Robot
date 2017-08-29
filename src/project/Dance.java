package project;

import java.awt.geom.Area;

public interface Dance {
	public interface dancingrobots
	{
		void startdancing();
		void stopdancing();
		Area getArea();
		void jump();
	}
}
