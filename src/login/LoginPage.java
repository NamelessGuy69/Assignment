package login;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("User id : ");
	JLabel userPasswordLabel = new JLabel ("Password : ");
	JLabel messageLabel = new JLabel("Visual Event Booking System");
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	LoginPage(HashMap<String,String> loginInfoOriginal, HashMap<String, String> logininfo){
		
		logininfo = loginInfoOriginal;
		
		userIDLabel.setBounds(50,100,75,75);
		userPasswordLabel.setBounds(50,250,75,25);
		
		messageLabel.setBounds(123,250,250,50);
		messageLabel.setFont(newFont(null,Font.ITALIC,25));
		
		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,100,200,25);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(userIDLabel); 
		frame.add(userPasswordLabel) 
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
	}
	
	private Font newFont(Object object, int italic, int i) {
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}


