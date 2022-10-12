package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.5, 0.25, 0.5, 0.25);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.75, 0.5, 0.25);
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledCircle(0.5, 0.5, 0.2);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.45, 0.55, 0.03);
		StdDraw.filledCircle(0.55, 0.55, 0.03);
		StdDraw.filledCircle(0.5, 0.45, 0.07);
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledRectangle(0.5, 0.5, 0.1, 0.05);
		
	}
}