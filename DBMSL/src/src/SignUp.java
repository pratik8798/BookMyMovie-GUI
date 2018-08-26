package src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SignUp extends Frame implements ActionListener {
	//String username="admin";
	//String Password="admin";
	JLabel label1,label2,label3;
	JTextField text;
	JButton button;
	JPasswordField password;
	JRadioButton owner_button,user_button;
	
	
	public SignUp()
	{
		JFrame jf=new JFrame("SignUp");
		label1 = new JLabel("SIGN UP");
		label1.setForeground(Color.blue);
		label1.setFont(new Font("Serif", Font.BOLD, 20));
		
		label2=new JLabel("Username");
		label3=new JLabel("Password");
		text=new JTextField();
		password=new JPasswordField();
		button=new JButton("Proceed");
		owner_button=new JRadioButton("Owner");
		user_button=new JRadioButton("User");
		
		
		
		label1.setBounds(450, 30, 400, 30);
		label2.setBounds(180, 70, 200, 30);
		label3.setBounds(180, 110, 200, 30);
		text.setBounds(500, 70, 200, 30);
		password.setBounds(500, 110, 200, 30);
		button.setBounds(350, 360, 100, 30);
		owner_button.setBounds(200, 200, 150, 150);  
		user_button.setBounds(600, 200, 150, 150); 
		
		jf.add(label1);
		jf.add(label2);
		jf.add(label3);
		jf.add(text);
		jf.add(button);
		jf.add(password);
		jf.add(owner_button);
		jf.add(user_button);
		button.addActionListener(this);
		
		jf.setSize(1000, 1000);
		jf.setLayout(null);
		jf.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	public static void main(String[] args) {
		SignUp sign=new SignUp();
		
	}
}
