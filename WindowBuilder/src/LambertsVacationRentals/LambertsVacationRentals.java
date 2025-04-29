package LambertsVacationRentals;

import java.awt.EventQueue;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import guipackage.Student;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LambertsVacationRentals extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup numberOfRoomsGroup = new ButtonGroup();
	private final ButtonGroup locationGroup = new ButtonGroup();
	private JRadioButton rdbtnVancouver;
	private JRadioButton rdbtnToronto;
	private JRadioButton rdbtnMontreal;
	private JRadioButton rdbtn1bdrm;
	private JRadioButton rdbtn2bdrm;
	private JRadioButton rdbtn3bdrm;
	private JComboBox boxLocationSide;
	private JCheckBox chckbxMeals;
	private JButton btnCalcPrice;
	private String filePath = "RentalsList.txt";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LambertsVacationRentals frame = new LambertsVacationRentals();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public LambertsVacationRentals() {
		drawComponents();
		eventHandling();
	}
	private void eventHandling() {
		// TODO Auto-generated method stub
		btnCalcPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double totalPrice =0.0;
				String location = "";
				
				if(rdbtnVancouver.isSelected()) {
					location = "Vancouver";
				}
				else if(rdbtnToronto.isSelected()) {
					location = "Toronto";
				}else if(rdbtnMontreal.isSelected()) {
					location = "Montreal";
				}
				
				String numberOfBedrooms = "";
				
				if(rdbtn1bdrm.isSelected()) {
					numberOfBedrooms = "1 Bedroom";
				}
				else if(rdbtn2bdrm.isSelected()) {
					numberOfBedrooms = "2 Bedroom";
					totalPrice += 75;
				}else if(rdbtn3bdrm.isSelected()) {
					numberOfBedrooms = "3 Bedroom";
					totalPrice += 150;
				}
				
				String parksideLlocation = boxLocationSide.getSelectedItem().toString();
				int selectedIndex = boxLocationSide.getSelectedIndex();
				
				if(selectedIndex == 0) {
					totalPrice += 600;
				}
				else if(selectedIndex == 1) {
					totalPrice += 750;
				}
				else if(selectedIndex == 2) {
					totalPrice += 825;
				}
				String meals = "";
				boolean isSelected = chckbxMeals.isSelected();
				if(isSelected == true ) {
					meals = "Included";
					totalPrice += 200;
				}else {
					meals = "Not included";
				}
				
				JOptionPane.showMessageDialog(null, "Your booking of " + numberOfBedrooms + " in " + location + " got " + parksideLlocation + " with " + meals  + " meals "  + 
						". Total price: " + totalPrice);
				
				VacationRentals vr = new VacationRentals(location,  parksideLlocation,  meals,  numberOfBedrooms);
				
				try(BufferedWriter bf = new BufferedWriter( new FileWriter(filePath,true))){
					bf.write(vr.toString());
					bf.newLine();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
	}
	/**
	 * Create the frame.
	 */
	public void drawComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		rdbtn1bdrm = new JRadioButton("1 bedroom");
		locationGroup.add(rdbtn1bdrm);
		
		rdbtn2bdrm = new JRadioButton("2 bedrooms");
		locationGroup.add(rdbtn2bdrm);
		
		rdbtn3bdrm = new JRadioButton("3 bedrooms");
		locationGroup.add(rdbtn3bdrm);
		
		JLabel lblNewLabel = new JLabel("Lambert’s Vacation Rentals.");
		
		rdbtnVancouver = new JRadioButton("Vancouver");
		numberOfRoomsGroup.add(rdbtnVancouver);
		
		rdbtnToronto = new JRadioButton("Toronto");
		numberOfRoomsGroup.add(rdbtnToronto);
		
		rdbtnMontreal = new JRadioButton("Montreal");
		numberOfRoomsGroup.add(rdbtnMontreal);
		
		chckbxMeals = new JCheckBox("Include Meals");
		
		boxLocationSide = new JComboBox();
		boxLocationSide.setModel(new DefaultComboBoxModel(new String[] 
				{"Parkside for $600 per week", "Poolside for $750 per week", "Lakeside for $825 per week"}));
		
		btnCalcPrice = new JButton("Calculate Price");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(127)
					.addComponent(lblNewLabel)
					.addContainerGap(139, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(60)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnVancouver, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnToronto, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnMontreal, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxMeals))
					.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(boxLocationSide, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtn1bdrm)
						.addComponent(rdbtn3bdrm)
						.addComponent(rdbtn2bdrm))
					.addGap(81))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(150)
					.addComponent(btnCalcPrice)
					.addContainerGap(173, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(17)
					.addComponent(lblNewLabel)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addComponent(rdbtnVancouver)
							.addGap(6)
							.addComponent(rdbtnToronto)
							.addGap(6)
							.addComponent(rdbtnMontreal))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(rdbtn1bdrm)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtn2bdrm)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtn3bdrm)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxMeals)
						.addComponent(boxLocationSide, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnCalcPrice)
					.addContainerGap(42, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
