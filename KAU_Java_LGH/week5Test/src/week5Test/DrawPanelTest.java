package week5Test;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Random;

@SuppressWarnings("unused")
public class DrawPanelTest {

	public static void main(String[] args) {
		Random randomNumbers = new Random();
		
		String type1 = JOptionPane.showInputDialog("please input number\n 1: line 2: rect 3: oval");
		int choice = Integer.parseInt(type1);
		int rannum = 5+ randomNumbers.nextInt(5);
		
		DrawPanel panel = new DrawPanel(choice, rannum);
		JFrame application =  new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(1000,1000);
		application.setVisible(true);
		
		int i = rannum;
		while (i > 0) {
		i--;
		String type2 = JOptionPane.showInputDialog("please input object number \nif you want leave input 0");
		int d_choice = Integer.parseInt(type2);
		if (d_choice != 0) {
			panel.deleteObject(d_choice);
			}
		else {
			application.setVisible(false);
			break;
		}
			
		
		}
		
	}

}
