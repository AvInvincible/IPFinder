package in.blogspot.vijmani;

import javax.swing.*;  
import java.awt.event.*;  
import java.net.*;

public class AvIPFinder extends JFrame implements ActionListener{
	JLabel ipInputFieldText;
	JTextField ipInputField;
	JButton ipSearchButton;
	JLabel result;
	
	public AvIPFinder() {
		super("AvIPFinder");
		ipInputFieldText = new JLabel("Enter website address you want IP of:");
		ipInputFieldText.setBounds(80,70,250,20);
		ipInputField = new JTextField();
		ipInputField.setBounds(60,100,250,20);
		ipSearchButton = new JButton("Locate IP");
		ipSearchButton.setBounds(120,150,100,30);
		ipSearchButton.addActionListener(this);
		//result = new JLabel();
		//result.setBounds(120,150,20,20);
		add(ipInputFieldText);
		add(ipInputField);
		add(ipSearchButton);
		//add(result);
		setSize(400,400);  
	    setLayout(null);  
	    setVisible(true); 
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}

	@Override
	public void actionPerformed(ActionEvent action) {
		String address = ipInputField.getText();
		try {
			InetAddress inet_address = InetAddress.getByName(address);
			String ip = inet_address.getHostAddress();
			JOptionPane.showMessageDialog(this,"IP of "+address+" is: "+ip);  
		}catch(UnknownHostException e) {
			JOptionPane.showMessageDialog(this,e.toString());  
		}
	}
	
	public static void main(String args[]) {
		new AvIPFinder();
	}
}
