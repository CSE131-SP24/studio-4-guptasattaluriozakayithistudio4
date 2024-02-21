package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		
		StdDraw.setPenColor(255,0,0);
		StdDraw.filledRectangle(0.25,0.25,0.25,0.25);
		
		StdDraw.setPenColor(0,255,0);
		StdDraw.filledRectangle(0.75,0.75,0.25,0.25);
		
		StdDraw.setPenColor(0,0,255);
		StdDraw.filledRectangle(0.25,0.75,0.25,0.25);
		
		StdDraw.setPenColor(255,0,255);
		StdDraw.filledRectangle(0.75,0.25,0.25,0.25);

		StdDraw.setPenColor(80,100,10);
		StdDraw.filledEllipse(0.5,0.5,0.1,0.2);

	}
}