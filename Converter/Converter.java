package Bitch;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class Bitch {

	private JFrame frmConverteranime;
	private JTextField txtKg;
	private JTextField txtLbs;
	private JTextField txtC;
	private JTextField txtF;
	private JTextField txtM;
	private JTextField txtFt;
	private JTextField txtKm;
	private JTextField txtMi;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bitch window = new Bitch();
					window.frmConverteranime.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bitch() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConverteranime = new JFrame();
		frmConverteranime.setTitle("ConverterAnime");
		frmConverteranime.setBounds(100, 100, 685, 554);
		frmConverteranime.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConverteranime.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kg");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 107, 54, 19);
		frmConverteranime.getContentPane().add(lblNewLabel);
		
		txtKg = new JTextField();
		txtKg.setBounds(87, 106, 86, 20);
		frmConverteranime.getContentPane().add(txtKg);
		txtKg.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Lbs");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(273, 108, 65, 17);
		frmConverteranime.getContentPane().add(lblNewLabel_1);
		
		txtLbs = new JTextField();
		txtLbs.setBounds(412, 106, 86, 20);
		frmConverteranime.getContentPane().add(txtLbs);
		txtLbs.setColumns(10);
		
		
				
		JButton btnPush = new JButton("Push");
		btnPush.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//for lbs
			double lbs = Double.parseDouble(txtKg.getText()) * 0.4535;
			String value = String.valueOf(lbs);
			txtLbs.setText(value);
			//for tempareture
			double C = Double.parseDouble(txtC.getText()) * 33.8;
			String F = String.valueOf(C);
			txtF.setText(F);
			//for ft
			double M = Double.parseDouble(txtM.getText() ) * 3.281;
			String Ft = String.valueOf(M);
		    txtFt.setText(Ft);
		    //for miles
		    double Km = Double.parseDouble(txtKm.getText()) * 0.6214;
			String Mi = String.valueOf(Km);
			txtMi.setText(Mi);
			
			}
			});
		btnPush.setBounds(10, 412, 107, 30);
		frmConverteranime.getContentPane().add(btnPush);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setToolTipText("");
		panel.setBounds(10, 26, 588, 71);
		frmConverteranime.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Converter");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 43));
		lblNewLabel_2.setBounds(183, 7, 240, 53);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		    txtKg.setText(null);
		    txtLbs.setText(null);
		    txtC.setText(null);
		    txtF.setText(null);
		    txtM.setText(null);
		    txtFt.setText(null);
		    txtKm.setText(null);
		    txtMi.setText(null);
			
			}
		});
		btnNewButton.setBounds(174, 412, 107, 30);
		frmConverteranime.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame exit = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(exit, "Do u want to exit, bitch?", "Exit message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
				}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnExit.setBounds(324, 412, 107, 30);
		frmConverteranime.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_3 = new JLabel("*C");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(10, 159, 54, 19);
		frmConverteranime.getContentPane().add(lblNewLabel_3);
		
		txtC = new JTextField();
		txtC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		txtC.setBounds(87, 160, 86, 20);
		frmConverteranime.getContentPane().add(txtC);
		txtC.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("*F");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(273, 159, 65, 21);
		frmConverteranime.getContentPane().add(lblNewLabel_4);
		
		txtF = new JTextField();
		txtF.setBounds(412, 160, 86, 20);
		frmConverteranime.getContentPane().add(txtF);
		txtF.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("M");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_5.setBounds(10, 207, 54, 19);
		frmConverteranime.getContentPane().add(lblNewLabel_5);
		
		txtM = new JTextField();
		txtM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtM.setBounds(87, 208, 86, 20);
		frmConverteranime.getContentPane().add(txtM);
		txtM.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("ft");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_6.setBounds(273, 207, 65, 18);
		frmConverteranime.getContentPane().add(lblNewLabel_6);
		
		txtFt = new JTextField();
		txtFt.setBounds(412, 208, 86, 20);
		frmConverteranime.getContentPane().add(txtFt);
		txtFt.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Km");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_7.setBounds(10, 259, 54, 19);
		frmConverteranime.getContentPane().add(lblNewLabel_7);
		
		txtKm = new JTextField();
		txtKm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			}
		});
		txtKm.setBounds(87, 260, 86, 20);
		frmConverteranime.getContentPane().add(txtKm);
		txtKm.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Mi");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_8.setBounds(273, 259, 54, 18);
		frmConverteranime.getContentPane().add(lblNewLabel_8);
		
		txtMi = new JTextField();
		txtMi.setBounds(412, 260, 86, 20);
		frmConverteranime.getContentPane().add(txtMi);
		txtMi.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\andriy\\Desktop\\\u0406\u0456\u0406.jpg"));
		lblNewLabel_9.setBounds(0, 0, 674, 442);
		frmConverteranime.getContentPane().add(lblNewLabel_9);
	}
}
