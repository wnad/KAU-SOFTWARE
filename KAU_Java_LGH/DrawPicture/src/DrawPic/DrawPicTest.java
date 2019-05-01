package DrawPic;

import javax.swing.JFrame; //Import class JFrame for use in this source code file

public class DrawPicTest {

	public static void main(String[] args) {
		DrawPic panel = new Drawpic();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		application.add(panel);
		application.setSize(250,250);
		application.setVisible(true);

	}

}
