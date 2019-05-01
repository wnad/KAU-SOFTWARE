import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawPanel1 extends JPanel 
{

	public void paintComponent ( Graphics g ) {
		
		super.paintComponent( g );
		
		int width = getWidth();
		int height = getHeight();
		
		for (int i=0; i<10; i++) {
			g.drawLine((int)(width * Math.pow(i / 10, 2)),(int)(height * i /10) ,(int)(width * i / 10),250);
		}

	}

}
