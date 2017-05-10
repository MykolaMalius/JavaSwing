import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TicketSystem {

	private JFrame frame;
	private JTextField txtTax;
	private JTextField txtSub;
	private JTextField txtTotal;
	private JTextField txtClass1;
	private JTextField txtTicket1;
	private JTextField txtAdult1;
	private JTextField txtChild1;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtTicketNo;
	private JTextField txtPrice;
	private JTextField txtRoute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketSystem window = new TicketSystem();
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
	public TicketSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 714, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 665, 80);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("TicketSystem");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 57));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Class");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 124, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnEconom = new JRadioButton("Econom");
		rdbtnEconom.setBounds(6, 156, 109, 23);
		frame.getContentPane().add(rdbtnEconom);
		
		JRadioButton rdbtnStandard = new JRadioButton("Statndard");
		rdbtnStandard.setBounds(6, 196, 109, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnBussines = new JRadioButton("Bussines");
		rdbtnBussines.setBounds(6, 235, 109, 23);
		frame.getContentPane().add(rdbtnBussines);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("SingleTicket");
		rdbtnSingleTicket.setBounds(117, 156, 109, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnReturnTicket = new JRadioButton("ReturnTicket");
		rdbtnReturnTicket.setBounds(117, 196, 109, 23);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		JLabel lblNewLabel_2 = new JLabel("Count");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(134, 126, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(260, 126, 46, 14);
		frame.getContentPane().add(lblType);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBounds(234, 156, 109, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBounds(234, 196, 109, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox BoxChoose = new JComboBox();
		BoxChoose.setModel(new DefaultComboBoxModel(new String[] {"Choose your city:", "New York", "Washington", "Boston", "Miami"}));
		BoxChoose.setFont(new Font("Tahoma", Font.PLAIN, 20));
		BoxChoose.setBounds(121, 236, 201, 31);
		frame.getContentPane().add(BoxChoose);
		
		JLabel lblNewLabel_3 = new JLabel("Tax");
		lblNewLabel_3.setBounds(10, 306, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("SubTotal");
		lblNewLabel_4.setBounds(10, 344, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total");
		lblNewLabel_5.setBounds(10, 380, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		txtTax = new JTextField();
		txtTax.setBounds(117, 303, 86, 20);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtSub = new JTextField();
		txtSub.setBounds(117, 341, 86, 20);
		frame.getContentPane().add(txtSub);
		txtSub.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(117, 377, 86, 20);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			double tax = 20;
			double miles10 = 23.50;
			double miles15 = 27.30;
			double miles23 = 30.37;
			double miles30 = 31.10;
			double totalCost,econom = 15,standard = 25,bussines = 35;
			
			if(rdbtnBussines.isSelected() && rdbtnSingleTicket.isSelected() && rdbtnAdult.isSelected() && BoxChoose.getSelectedItem().equals("New York")){
				
				totalCost = (tax * miles15)/100;
				String tTax = String.format("$%.2f", totalCost);
				txtTax.setText(tTax);
				String subTotal = String.format("$%.2f", miles10);
				txtSub.setText(subTotal);
				String total = String.format("$%.2f", miles10 + totalCost);
				txtTotal.setText(total);
				txtPrice.setText(total);
				txtClass1.setText("Bussines");
				txtTicket1.setText("Onew way");
				txtAdult1.setText("One");
				txtChild1.setText("-----");
				
				
			}
			
			
			}
		});
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				//For clock
			Calendar time = Calendar.getInstance();
			time.getTime();
			SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
			txtTime.setText(tTime.format(time.getTime()));
			//For days
			
			SimpleDateFormat Days = new SimpleDateFormat("dd-MMM-yyyy");
		    txtDate.setText(Days.format(time.getTime()));
		    
		    //From what city
		    txtFrom.setText("Kiev");
		    txtTo.setText((String) BoxChoose.getSelectedItem());
		    
		    //RandomGenerator
		    
		    int random;
		    String str = "";
		    random = 1325 + (int)(Math.random()*4325);
		    str+= random + 1325;
		    txtTicketNo.setText(str);
		    
		    //Route
			txtRoute.setText("Any");			
			}
		});
		btnTotal.setBounds(10, 446, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setToolTipText("Reset all choosees");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtTax.setText(null);
			txtSub.setText(null);
			txtTotal.setText(null);
			rdbtnEconom.setSelected(false);
			rdbtnStandard.setSelected(false);
			rdbtnBussines.setSelected(false);
			rdbtnSingleTicket.setSelected(false);
			rdbtnReturnTicket.setSelected(false);
			rdbtnAdult.setSelected(false);
			rdbtnChild.setSelected(false);
			BoxChoose.setSelectedItem("Choose your city:");
			txtClass1.setText(null);
			txtTicket1.setText(null);
			txtAdult1.setText(null);
			txtChild1.setText(null);
			txtFrom.setText(null);
			txtTo.setText(null);
			txtTime.setText(null);
			txtTime.setText(null);
			txtTicketNo.setText(null);
			txtPrice.setText(null);
			txtRoute.setText(null);
			
			}
		});
		btnReset.setBounds(117, 446, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			JFrame exit = new JFrame("Exit");
			if(JOptionPane.showConfirmDialog(exit, "Do u want to exit?", "Exit message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
				System.exit(0);
			}
			}
		});
		btnExit.setBounds(216, 446, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClass.setBounds(360, 126, 72, 14);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTicket.setBounds(432, 126, 72, 14);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAdult.setBounds(509, 124, 72, 14);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChild.setBounds(582, 124, 72, 14);
		frame.getContentPane().add(lblChild);
		
		txtClass1 = new JTextField();
		txtClass1.setBounds(349, 157, 63, 20);
		frame.getContentPane().add(txtClass1);
		txtClass1.setColumns(10);
		
		txtTicket1 = new JTextField();
		txtTicket1.setColumns(10);
		txtTicket1.setBounds(432, 157, 63, 20);
		frame.getContentPane().add(txtTicket1);
		
		txtAdult1 = new JTextField();
		txtAdult1.setColumns(10);
		txtAdult1.setBounds(506, 157, 63, 20);
		frame.getContentPane().add(txtAdult1);
		
		txtChild1 = new JTextField();
		txtChild1.setColumns(10);
		txtChild1.setBounds(582, 157, 63, 20);
		frame.getContentPane().add(txtChild1);
		
		JLabel lblNewLabel_6 = new JLabel("From");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(349, 205, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTo.setBounds(349, 239, 46, 14);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDate.setBounds(349, 283, 46, 14);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTime.setBounds(349, 326, 46, 14);
		frame.getContentPane().add(lblTime);
		
		txtFrom = new JTextField();
		txtFrom.setBounds(418, 199, 86, 20);
		frame.getContentPane().add(txtFrom);
		txtFrom.setColumns(10);
		
		txtTo = new JTextField();
		txtTo.setColumns(10);
		txtTo.setBounds(418, 236, 86, 20);
		frame.getContentPane().add(txtTo);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(418, 282, 86, 20);
		frame.getContentPane().add(txtDate);
		
		txtTime = new JTextField();
		txtTime.setColumns(10);
		txtTime.setBounds(418, 325, 86, 20);
		frame.getContentPane().add(txtTime);
		
		JLabel lblTicketNo = new JLabel("Ticket \u2116");
		lblTicketNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTicketNo.setBounds(554, 219, 72, 14);
		frame.getContentPane().add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrice.setBounds(554, 266, 72, 14);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRoute.setBounds(554, 306, 72, 14);
		frame.getContentPane().add(lblRoute);
		
		txtTicketNo = new JTextField();
		txtTicketNo.setText("");
		txtTicketNo.setColumns(10);
		txtTicketNo.setBounds(540, 236, 86, 20);
		frame.getContentPane().add(txtTicketNo);
		
		txtPrice = new JTextField();
		txtPrice.setText("");
		txtPrice.setColumns(10);
		txtPrice.setBounds(540, 282, 86, 20);
		frame.getContentPane().add(txtPrice);
		
		txtRoute = new JTextField();
		txtRoute.setText("");
		txtRoute.setColumns(10);
		txtRoute.setBounds(540, 325, 86, 20);
		frame.getContentPane().add(txtRoute);
	}
}
