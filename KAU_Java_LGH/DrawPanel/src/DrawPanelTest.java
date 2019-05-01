import javax.swing.JFrame; //Import class JFrame for use in this source code file

public class DrawPanelTest {

	public static void main(String[] args) {
		DrawPanel panel = new DrawPanel();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		application.add(panel);
		application.setSize(250,250);
		application.setVisible(true);

	}

}
