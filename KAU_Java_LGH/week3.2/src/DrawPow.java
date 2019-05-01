import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPow extends JPanel 
{
	private int choice1;
	
	public DrawPow (int userChoice)
	{
		choice1 = userChoice;
	}
	
	public void paintComponent ( Graphics g ) {
		
		super.paintComponent( g );
		
		
		switch (choice1)
		{
		case 1:
			g.drawLine(100, 100, 150, 100);
			g.drawLine(100, 100, 125, 55);		
			g.drawLine(125, 55, 150, 100);
			break;
		case 2:
			g.drawRect(50, 50, 50, 50);
			break;
		case 3:
			g.drawOval(50, 50, 50, 50);
		}

	}

}
