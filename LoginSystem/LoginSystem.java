import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginSystem {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystem window = new LoginSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 484, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LoginSystem");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(167, 11, 156, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel txtLogin = new JLabel("Username");
		txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtLogin.setBounds(46, 96, 86, 25);
		frame.getContentPane().add(txtLogin);
		
		JLabel txtPassword = new JLabel("Password");
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPassword.setBounds(46, 181, 86, 17);
		frame.getContentPane().add(txtPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(198, 96, 144, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		Password = new JPasswordField();
		Password.setBounds(198, 178, 144, 20);
		frame.getContentPane().add(Password);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String username = txtUsername.getText();
				String password = Password.getText();
				
				if(username.contains("Mr.White") && password.contains("019")){
					TicketSystem system = new TicketSystem();
					system.main(null);
					txtUsername.setText(null);
					Password.setText(null);
				}
				
				else{
					JOptionPane.showConfirmDialog(null, "Wrong username or paswword", "Error window", JOptionPane.ERROR_MESSAGE);
					txtUsername.setText(null);
					Password.setText(null);
				}
			}
		});
		btnLogin.setBounds(43, 257, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtUsername.setText(null);
			Password.setText(null);
			}
		});
		btnReset.setBounds(187, 257, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame exit = new JFrame("EXIT");
				if(JOptionPane.showConfirmDialog(exit, "You want to exit?", "LoginSystem", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
					
				}
			}
		});
		btnExit.setBounds(338, 257, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
