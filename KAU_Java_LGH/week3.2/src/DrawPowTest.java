import javax.swing.JFrame; //Import class JFrame for use in this source code file
import javax.swing.JOptionPane;

public class DrawPowTest {

	public static void main(String[] args) {
		
		int i=1;
		String type = JOptionPane.showInputDialog("please input number\n 1: triangle 2: square 3: circle.");
		int choice1 = Integer.parseInt(type);
		DrawPow panel = new DrawPow(choice1);
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		application.add(panel);
		application.setSize(250,250);
		application.setVisible(true);
		
		while(i==1) {
			
			
			String command = JOptionPane.showInputDialog("please input number\n 1: repeat 2: end");
			int choice2 = Integer.parseInt(command);
			
			if (choice2 == 2)
			{
				application.setVisible(false);
				i = 0;
				System.out.print("program is finish. please close window");
			}
			
			if (choice2 == 1) {
			type = JOptionPane.showInputDialog("please input number\n 1: triangle 2: square 3: circle.");
			
			choice1 = Integer.parseInt(type);
			
			application.add(panel);
			}
		}

	}

	}


