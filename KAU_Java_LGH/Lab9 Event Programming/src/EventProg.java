import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class EventProg extends JFrame 
{
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JPasswordField passwordField;
	
	public EventProg() {
		super("Testing");
		setLayout(new FlowLayout());
		
		textField1 = new JTextField();
		textField1.setToolTipText("This is textField1");
		add(textField1);
		
		textField2 = new JTextField();
		textField2.setToolTipText("This is textField2");
		add(textField2);
		
		textField3 = new JTextField();
		textField3.setToolTipText("This is textField3");
		add(textField3);
		
		textField4 = new JTextField();
		textField4.setToolTipText("This is textField4");
		add(textField4);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("This is passwordField");
		add(passwordField);
		
		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		textField3.addActionListener(handler);
		textField4.addActionListener(handler);
		passwordField.addActionListener(handler);
	}
	
	private class TextFieldHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			String string = "";
			
			if (event.getSource() == textField1 )
				string = String.format("textField1: %s", event.getActionCommand());
			
			else if (event.getSource() == textField2)
				string = String.format("textField2: %s", event.getActionCommand());
			
			else if (event.getSource() == textField3)
				string = String.format("textField3: %s", event.getActionCommand());
			
			else if (event.getSource() == textField4)
				string = String.format("textField4: %s", event.getActionCommand());
			else if (event.getSource() == passwordField)
				string = String.format("passwordField: %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);
				
		}
	}
}
