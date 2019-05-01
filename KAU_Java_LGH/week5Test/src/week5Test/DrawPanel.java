package week5Test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawPanel extends JPanel {
	
	private Random randomNumbers = new Random();
	private MyLine[] lines;
	private MyRect[] rects;
	private MyOval[] ovals;
	private int choice;
	private int delnum;
	private int objnum;
	
	public DrawPanel(int s_choice, int rannum)
	{
		choice = s_choice;
		objnum = rannum;
		
		switch(choice) {
		case 1:
			lines = new MyLine[5+ objnum];
			for (int count=0; count < lines.length; count++)
			{
				int x1 = randomNumbers.nextInt(1000);
				int y1 = randomNumbers.nextInt(1000);
				int x2 = randomNumbers.nextInt(1000);
				int y2 = randomNumbers.nextInt(1000);
				
				Color color = new Color(randomNumbers.nextInt(256),randomNumbers.nextInt(256), randomNumbers.nextInt(256));
				
				lines[count] = new MyLine (x1, y1, x2, y2, color);
			}
			break;
		case 2:
			rects = new MyRect[5+ objnum];
			for (int count=0; count < rects.length; count++)
			{
				int x1 = randomNumbers.nextInt(1000);
				int y1 = randomNumbers.nextInt(1000);
				int width = randomNumbers.nextInt(500);
				int height = randomNumbers.nextInt(500);
				
				Color color = new Color(randomNumbers.nextInt(256),randomNumbers.nextInt(256), randomNumbers.nextInt(256));
				
				rects[count] = new MyRect (x1, y1, width, height, color);
			}
			break;
		case 3:
			ovals = new MyOval[5+ objnum];
			for (int count=0; count < ovals.length; count++)
			{
				int x1 = randomNumbers.nextInt(1000);
				int y1 = randomNumbers.nextInt(1000);
				int width = randomNumbers.nextInt(500);
				int height = randomNumbers.nextInt(500);
				
				Color color = new Color(randomNumbers.nextInt(256),randomNumbers.nextInt(256), randomNumbers.nextInt(256));
				
				ovals[count] = new MyOval (x1, y1, width, height, color);
			}
			break;
		}
	}
		
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		setBackground(Color.WHITE);
		switch(choice) {
		case 1:
			for (MyLine line : lines)
				line.draw(g);
			
			break;
		case 2:
			for (MyRect rect : rects)
				rect.draw(g);
			break;
		case 3:
			for (MyOval oval : ovals)
				oval.draw(g);
			break;
		}
		
	}
	
	
	public void deleteObject(int d_choice) {
		delnum = d_choice;
		
		switch(choice) {
		case 1:
			lines[delnum] = new MyLine ( 0, 0, 0, 0, Color.WHITE);
			repaint();
			break;
		case 2:
			rects[delnum] = new MyRect ( 0, 0, 0, 0, Color.WHITE);
			repaint();
			break;
		case 3:
			ovals[delnum] = new MyOval ( 0, 0, 0, 0, Color.WHITE);
			repaint();
			break;
	}
		
	}

}
