import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.List;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.SwingConstants;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JSpinner;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JScrollPane;

public class SalesSystem {

	String tTax, sSubtotal, tTotal;
	double[] price = new double[24];
	
	private JFrame frame;
	private JTextField txtMeat;
	private JTextField txtSausage;
	private JTextField txtCocaCola;
	private JTextField txtApple;
	private JTextField txtCherrys;
	private JTextField txtCake;
	private JTextField txtOranges;
	private JTextField txtBrocoli;
	private JTextField txtCheese;
	private JTextField txtEggs;
	private JTextField txtBread;
	private JTextField txtBeans;
	private JTextField txtRice;
	private JTextField txtBananas;
	private JTextField txtMushrooms;
	private JTextField txtCandies;
	private JTextField txtOnion;
	private JTextField txtChips;
	private JTextField txtTomatoes;
	private JTextField txtPepsi;
	private JTextField txtTax;
	private JTextField txtSubtotal;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesSystem window = new SalesSystem();
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
	public SalesSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
			txtApple.setEnabled(false);
			txtMeat.setEnabled(false);
			txtSausage.setEnabled(false);
			txtEggs.setEnabled(false);
			txtCocaCola.setEnabled(false);
			txtBananas.setEnabled(false);
			txtOranges.setEnabled(false);
			txtOnion.setEnabled(false);
			txtChips.setEnabled(false);
			txtBrocoli.setEnabled(false);
			txtTomatoes.setEnabled(false);
			txtCherrys.setEnabled(false);
			txtMushrooms.setEnabled(false);
			txtPepsi.setEnabled(false);
			txtRice.setEnabled(false);
			txtBeans.setEnabled(false);
			txtBread.setEnabled(false);
			txtCake.setEnabled(false);
			txtCheese.setEnabled(false);
			txtCandies.setEnabled(false);
			}
		});
		frame.setBounds(100, 100, 1012, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 3, 3, 3));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(10, 2, 2, 2));
		
		JButton btnMeat = new JButton("Meat");
		btnMeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtMeat.setEnabled(true);   
			
			}
		});
		panel.add(btnMeat);
		
		JButton btnBread = new JButton("Bread");
		btnBread.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			txtBread.setEnabled(true);
			}
		});
		panel.add(btnBread);
		
		JButton btnSausage = new JButton("Sausage");
		btnSausage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtSausage.setEnabled(true);
			}
		});
		panel.add(btnSausage);
		
		JButton btnBeans = new JButton("Beans");
		btnBeans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtBeans.setEnabled(true);
			}
		});
		panel.add(btnBeans);
		
		JButton btnCocaCola = new JButton("CocaCola");
		btnCocaCola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtCocaCola.setEnabled(true);
			}
		});
		panel.add(btnCocaCola);
		
		JButton btnRice = new JButton("Rice");
		btnRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtRice.setEnabled(true);
			}
		});
		panel.add(btnRice);
		
		JButton btnApple = new JButton("Apple");
		btnApple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtApple.setEnabled(true);	
			
			}
		});
		panel.add(btnApple);
		
		JButton btnBananas = new JButton("Bananas");
		btnBananas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtBananas.setEnabled(true);
			}
		});
		panel.add(btnBananas);
		
		JButton btnCherrys = new JButton("Cherrys");
		btnCherrys.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtCherrys.setEnabled(true);
			}
		});
		panel.add(btnCherrys);
		
		JButton btnMushrooms = new JButton("Mushrooms");
		btnMushrooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtMushrooms.setEnabled(true);
			}
		});
		panel.add(btnMushrooms);
		
		JButton btnCake = new JButton("Cake");
		btnCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtCake.setEnabled(true);
			}
		});
		panel.add(btnCake);
		
		JButton btnCandies = new JButton("Candies");
		btnCandies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtCandies.setEnabled(true);
			}
		});
		panel.add(btnCandies);
		
		JButton btnOranges = new JButton("Oranges");
		btnOranges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtOranges.setEnabled(true);
			}
		});
		panel.add(btnOranges);
		
		JButton btnOnion = new JButton("Onion");
		btnOnion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtOnion.setEnabled(true);
			}
		});
		panel.add(btnOnion);
		
		JButton btnBrocoli = new JButton("Brocoli");
		btnBrocoli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtBrocoli.setEnabled(true);
			}
		});
		panel.add(btnBrocoli);
		
		JButton btnChips = new JButton("Chips");
		btnChips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtChips.setEnabled(true);
			}
		});
		panel.add(btnChips);
		
		JButton btnCheese = new JButton("Cheese");
		btnCheese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtCheese.setEnabled(true);
			}
		});
		
		JButton btnTomatoes = new JButton("Tomatoes");
		btnTomatoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtTomatoes.setEnabled(true);
			}
		});
		panel.add(btnTomatoes);
		panel.add(btnCheese);
		
		JButton btnEggs = new JButton("Eggs");
		btnEggs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtEggs.setEnabled(true);
			}
		});
		panel.add(btnEggs);
		
		JButton btnPepsi = new JButton("Pepsi");
		btnPepsi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtPepsi.setEnabled(true);
			}
		});
		panel.add(btnPepsi);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 4, 2, 1));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox chkMeat = new JCheckBox("Meat");
		chkMeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			if(chkMeat.isSelected()){
				txtMeat.setEnabled(true);
				txtMeat.setText("");
				txtMeat.requestFocus();
				
			}
			else{
				txtMeat.setEnabled(false);
				txtMeat.setText(null);
			}
			
			
			
			}
		});
		chkMeat.setEnabled(false);
		panel_3.add(chkMeat);
		
		JCheckBox chckbxSausage = new JCheckBox("Sausage");
		chckbxSausage.setEnabled(false);
		panel_3.add(chckbxSausage);
		
		JCheckBox chckbxCocacola = new JCheckBox("CocaCola");
		chckbxCocacola.setEnabled(false);
		panel_3.add(chckbxCocacola);
		
		JCheckBox chckbxApple = new JCheckBox("Apple");
		chckbxApple.setEnabled(false);
		panel_3.add(chckbxApple);
		
		JCheckBox chckbxCherrys = new JCheckBox("Cherrys");
		chckbxCherrys.setEnabled(false);
		panel_3.add(chckbxCherrys);
		
		JCheckBox chckbxCake = new JCheckBox("Cake");
		chckbxCake.setEnabled(false);
		panel_3.add(chckbxCake);
		
		JCheckBox chckbxOranges = new JCheckBox("Oranges");
		chckbxOranges.setEnabled(false);
		panel_3.add(chckbxOranges);
		
		JCheckBox chckbxBrocoli = new JCheckBox("Brocoli");
		chckbxBrocoli.setEnabled(false);
		panel_3.add(chckbxBrocoli);
		
		JCheckBox chckbxCheese = new JCheckBox("Cheese");
		chckbxCheese.setEnabled(false);
		panel_3.add(chckbxCheese);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Eggs");
		chckbxNewCheckBox.setEnabled(false);
		panel_3.add(chckbxNewCheckBox);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		txtMeat = new JTextField();
		txtMeat.setHorizontalAlignment(SwingConstants.CENTER);
		txtMeat.setText("0");
		txtMeat.setColumns(10);
		panel_4.add(txtMeat);
		
		txtSausage = new JTextField();
		txtSausage.setHorizontalAlignment(SwingConstants.CENTER);
		txtSausage.setText("0");
		txtSausage.setColumns(10);
		panel_4.add(txtSausage);
		
		txtCocaCola = new JTextField();
		txtCocaCola.setHorizontalAlignment(SwingConstants.CENTER);
		txtCocaCola.setText("0");
		txtCocaCola.setColumns(10);
		panel_4.add(txtCocaCola);
		
		txtApple = new JTextField();
		txtApple.setHorizontalAlignment(SwingConstants.CENTER);
		txtApple.setText("0");
		txtApple.setColumns(10);
		panel_4.add(txtApple);
		
		txtCherrys = new JTextField();
		txtCherrys.setHorizontalAlignment(SwingConstants.CENTER);
		txtCherrys.setText("0");
		txtCherrys.setColumns(10);
		panel_4.add(txtCherrys);
		
		txtCake = new JTextField();
		txtCake.setHorizontalAlignment(SwingConstants.CENTER);
		txtCake.setText("0");
		txtCake.setColumns(10);
		panel_4.add(txtCake);
		
		txtOranges = new JTextField();
		txtOranges.setHorizontalAlignment(SwingConstants.CENTER);
		txtOranges.setText("0");
		txtOranges.setColumns(10);
		panel_4.add(txtOranges);
		
		txtBrocoli = new JTextField();
		txtBrocoli.setHorizontalAlignment(SwingConstants.CENTER);
		txtBrocoli.setText("0");
		txtBrocoli.setColumns(10);
		panel_4.add(txtBrocoli);
		
		txtCheese = new JTextField();
		txtCheese.setHorizontalAlignment(SwingConstants.CENTER);
		txtCheese.setText("0");
		txtCheese.setColumns(10);
		panel_4.add(txtCheese);
		
		txtEggs = new JTextField();
		txtEggs.setHorizontalAlignment(SwingConstants.CENTER);
		txtEggs.setText("0");
		txtEggs.setColumns(10);
		panel_4.add(txtEggs);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox chckbxBread = new JCheckBox("Bread");
		chckbxBread.setEnabled(false);
		panel_5.add(chckbxBread);
		
		JCheckBox chckbxBeans = new JCheckBox("Beans");
		chckbxBeans.setEnabled(false);
		panel_5.add(chckbxBeans);
		
		JCheckBox chckbxRice = new JCheckBox("Rice");
		chckbxRice.setEnabled(false);
		panel_5.add(chckbxRice);
		
		JCheckBox chckbxBananas = new JCheckBox("Bananas");
		chckbxBananas.setEnabled(false);
		panel_5.add(chckbxBananas);
		
		JCheckBox chckbxMushrooms = new JCheckBox("Mushrooms");
		chckbxMushrooms.setEnabled(false);
		panel_5.add(chckbxMushrooms);
		
		JCheckBox chckbxCandies = new JCheckBox("Candies");
		chckbxCandies.setEnabled(false);
		panel_5.add(chckbxCandies);
		
		JCheckBox chckbxOnion = new JCheckBox("Onion");
		chckbxOnion.setEnabled(false);
		panel_5.add(chckbxOnion);
		
		JCheckBox chckbxChips = new JCheckBox("Chips");
		chckbxChips.setEnabled(false);
		panel_5.add(chckbxChips);
		
		JCheckBox chckbxTomatoes = new JCheckBox("Tomatoes");
		chckbxTomatoes.setEnabled(false);
		panel_5.add(chckbxTomatoes);
		
		JCheckBox chckbxPepsi = new JCheckBox("Pepsi");
		chckbxPepsi.setEnabled(false);
		panel_5.add(chckbxPepsi);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		txtBread = new JTextField();
		txtBread.setHorizontalAlignment(SwingConstants.CENTER);
		txtBread.setText("0");
		txtBread.setColumns(10);
		panel_6.add(txtBread);
		
		txtBeans = new JTextField();
		txtBeans.setHorizontalAlignment(SwingConstants.CENTER);
		txtBeans.setText("0");
		txtBeans.setColumns(10);
		panel_6.add(txtBeans);
		
		txtRice = new JTextField();
		txtRice.setHorizontalAlignment(SwingConstants.CENTER);
		txtRice.setText("0");
		txtRice.setColumns(10);
		panel_6.add(txtRice);
		
		txtBananas = new JTextField();
		txtBananas.setHorizontalAlignment(SwingConstants.CENTER);
		txtBananas.setText("0");
		txtBananas.setColumns(10);
		panel_6.add(txtBananas);
		
		txtMushrooms = new JTextField();
		txtMushrooms.setHorizontalAlignment(SwingConstants.CENTER);
		txtMushrooms.setText("0");
		txtMushrooms.setColumns(10);
		panel_6.add(txtMushrooms);
		
		txtCandies = new JTextField();
		txtCandies.setHorizontalAlignment(SwingConstants.CENTER);
		txtCandies.setText("0");
		txtCandies.setColumns(10);
		panel_6.add(txtCandies);
		
		txtOnion = new JTextField();
		txtOnion.setHorizontalAlignment(SwingConstants.CENTER);
		txtOnion.setText("0");
		txtOnion.setColumns(10);
		panel_6.add(txtOnion);
		
		txtChips = new JTextField();
		txtChips.setHorizontalAlignment(SwingConstants.CENTER);
		txtChips.setText("0");
		txtChips.setColumns(10);
		panel_6.add(txtChips);
		
		txtTomatoes = new JTextField();
		txtTomatoes.setHorizontalAlignment(SwingConstants.CENTER);
		txtTomatoes.setText("0");
		txtTomatoes.setColumns(10);
		panel_6.add(txtTomatoes);
		
		txtPepsi = new JTextField();
		txtPepsi.setHorizontalAlignment(SwingConstants.CENTER);
		txtPepsi.setText("0");
		txtPepsi.setColumns(10);
		panel_6.add(txtPepsi);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tax");
		lblNewLabel.setBounds(10, 23, 74, 21);
		panel_2.add(lblNewLabel);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setBounds(10, 59, 74, 21);
		panel_2.add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(10, 94, 74, 21);
		panel_2.add(lblTotal);
		
		txtTax = new JTextField();
		txtTax.setText("0");
		txtTax.setHorizontalAlignment(SwingConstants.CENTER);
		txtTax.setBounds(128, 23, 86, 20);
		panel_2.add(txtTax);
		txtTax.setColumns(10);
		
		txtSubtotal = new JTextField();
		txtSubtotal.setText("0");
		txtSubtotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtSubtotal.setColumns(10);
		txtSubtotal.setBounds(128, 59, 86, 20);
		panel_2.add(txtSubtotal);
		
		txtTotal = new JTextField();
		txtTotal.setText("0");
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setColumns(10);
		txtTotal.setBounds(128, 94, 86, 20);
		panel_2.add(txtTotal);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			price[0] = Double.parseDouble(txtMeat.getText() )* 3;
			price[1] = Double.parseDouble(txtApple.getText()) * 1.5;
			price[2] = Double.parseDouble(txtCocaCola.getText()) * 2;
			price[3] = Double.parseDouble(txtBread.getText()) * 2;
			price[4] = Double.parseDouble(txtSausage.getText()) * 5;
			price[5] = Double.parseDouble(txtBeans.getText()) * 1.2;
			price[6] = Double.parseDouble(txtRice.getText()) * 2.30;
		    price[7] = Double.parseDouble(txtBananas.getText()) * 4.50;
		    price[8] = Double.parseDouble(txtCherrys.getText()) * 3.50;
		    price[9] = Double.parseDouble(txtMushrooms.getText()) * 2.30;
		    price[10] = Double.parseDouble(txtCake.getText()) * 6.50;
		    price[11] = Double.parseDouble(txtCandies.getText()) * 4.20;
		    price[12] = Double.parseDouble(txtOranges.getText()) * 6.10;
		    price[13] = Double.parseDouble(txtOnion.getText()) * 0.90;
		    price[14] = Double.parseDouble(txtBrocoli.getText()) * 0.60;
		    price[15] = Double.parseDouble(txtChips.getText()) * 1.20;
		    price[16] = Double.parseDouble(txtCheese.getText()) * 4.50;
		    price[17] = Double.parseDouble(txtTomatoes.getText()) * 2.70;
		    price[18] = Double.parseDouble(txtEggs.getText()) * 0.05;
		    price[19] = Double.parseDouble(txtPepsi.getText()) * 1.05;
		   
		   
		    price[20] = price[0] + price[1] +  price[2]+ price[3] +  price[4] +  price[5] +  price[6] + price[7] + price[8] + price[9] + price[10] + price[11] + price[12] + price[13] + price[14] + price[15] + price[16] + price[17] + price[18] + price[19];
		    
		    
		    tTax = String.format("$ %.2f", price[20]*0.20);
		    
		    sSubtotal = String.format("$ %.2f", price[20]);
		   
		    tTotal = String.format("$ %.2f", price[20]+(price[20] * 0.20));
		    
		    
		    	    
		    txtTax.setText(tTax);
		    txtSubtotal.setText(sSubtotal);
		    txtTotal.setText(tTotal);
		     
		    
              		 
		
		    
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTotal.setBounds(10, 461, 89, 23);
		panel_2.add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//1)for JTextField enabled
				txtApple.setEnabled(false);
				txtMeat.setEnabled(false);
				txtSausage.setEnabled(false);
				txtEggs.setEnabled(false);
				txtCocaCola.setEnabled(false);
				txtBananas.setEnabled(false);
				txtOranges.setEnabled(false);
				txtOnion.setEnabled(false);
				txtChips.setEnabled(false);
				txtBrocoli.setEnabled(false);
				txtTomatoes.setEnabled(false);
				txtCherrys.setEnabled(false);
				txtMushrooms.setEnabled(false);
				txtPepsi.setEnabled(false);
				txtRice.setEnabled(false);
				txtBeans.setEnabled(false);
				txtBread.setEnabled(false);
				txtCake.setEnabled(false);
				txtCheese.setEnabled(false);
				txtCandies.setEnabled(false);
				//2)for JTextField text
				txtApple.setText(null);
				txtMeat.setText(null);
				txtSausage.setText(null);
				txtEggs.setText(null);
				txtCocaCola.setText(null);
				txtBananas.setText(null);
				txtOranges.setText(null);
				txtOnion.setText(null);
				txtChips.setText(null);
				txtBrocoli.setText(null);
				txtTomatoes.setText(null);
				txtCherrys.setText(null);
				txtMushrooms.setText(null);
				txtPepsi.setText(null);
				txtRice.setText(null);
				txtBeans.setText(null);
				txtBread.setText(null);
				txtCake.setText(null);
				txtCheese.setText(null);
				txtCandies.setText(null);
				txtTax.setText(null);
				txtTotal.setText(null);
				txtSubtotal.setText(null);
				//3)for chkBoxes
				chckbxApple.setSelected(false);
				chkMeat.setSelected(false);
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			
			
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.setBounds(113, 461, 89, 23);
		panel_2.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame exit = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(exit, "Do u want to exit?", "Exit message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setBounds(218, 461, 89, 23);
		panel_2.add(btnExit);
		
	}
}
