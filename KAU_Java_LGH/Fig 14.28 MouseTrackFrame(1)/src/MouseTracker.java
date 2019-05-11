import javax.swing.JFrame;

public class MouseTracker {

	public static void main(String[] args) {
		MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
		mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mouseTrackerFrame.setSize(1000, 500);
		mouseTrackerFrame.setVisible(true);
	}
}