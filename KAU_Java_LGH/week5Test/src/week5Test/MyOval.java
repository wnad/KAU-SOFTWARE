package week5Test;

import java.awt.Color;
import java.awt.Graphics;

public class MyOval {

	private int x1;
	private int y1;
	private int width;
	private int height;
	private Color myColor;
	
	public MyOval(int x1, int y1, int width, int height, Color color)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.width = width;
		this.height = height;
		myColor = color;
	}
	
	public void draw (Graphics g)
	{
		g.setColor(myColor);
		g.drawOval(x1, y1, width, height);
	}

}
