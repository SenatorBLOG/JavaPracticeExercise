package InsuranceOptions;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

public class InsuranceGUI extends JFrame {
	public InsuranceGUI() {
		drawElements();
		eventHandling();
		
	}
	
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnHmo;
	private JRadioButton rdbtnPpo;
	private JCheckBox chckbxDental;
	private JCheckBox chckbxVision;
	private JButton btnCalcPrice;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsuranceGUI frame = new InsuranceGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void eventHandling() {
		rdbtnHmo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnHmo.isSelected()) {
					textField.setText("$200 at health\n"
							+ "	maintenance organization");
				}else{
					textField.setText("");
				}
				
			}
		});
			
		rdbtnPpo.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            if (rdbtnPpo.isSelected()) {
	                textField_1.setText("$600 at preferred provider organization");
	            } else {
	                textField_1.setText("");
	            }
	        }
	    });
		chckbxDental.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxDental.isSelected()) {
	                textField_2.setText("dental care adds $75");
	            } else {
	                textField_2.setText("");
	            }
			}
		});
	    
	    chckbxVision.addItemListener(new ItemListener() {
	        public void itemStateChanged(ItemEvent e) {
	            if (chckbxVision.isSelected()) {
	                textField_3.setText("vision care adds $20");
	            } else {
	                textField_3.setText("");
	            }
	        }
	    });

			
	
		
		
	
		
		btnCalcPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double price = 0.0;
				
				if(rdbtnHmo.isSelected()) {
					price += 200;
				}
				if(rdbtnPpo.isSelected()) {
					price += 600;
				}
				if(chckbxDental.isSelected()) {
					price +=75;
				}
				if(chckbxVision.isSelected()) {
					price += 20;
				}
				textOutput.setText(String.valueOf(price));
				
			}
		});
		
	}
	/**
	 * Create the frame.
	 * @return 
	 */
 	public void drawElements() {
		setTitle("Insurance Company");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		rdbtnHmo = new JRadioButton("HMO");
		buttonGroup.add(rdbtnHmo);
		
		rdbtnPpo = new JRadioButton("PPO");
		
		buttonGroup.add(rdbtnPpo);
		
		chckbxDental = new JCheckBox("Dental insurance");
		
		chckbxVision = new JCheckBox("Vision insurance");
		
		textOutput = new JTextField();
		textOutput.setColumns(20);
		
		JLabel lblNewLabel = new JLabel("Total Insurance Cost");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(20);
		
		textField_3 = new JTextField();
		textField_3.setColumns(20);
		
		btnCalcPrice = new JButton("Calculate Price");
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textOutput, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxDental)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel)
									.addComponent(chckbxVision)))
							.addGap(18, 18, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnCalcPrice)
								.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
							.addGap(26))
						.addGroup(Alignment.LEADING, gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addComponent(rdbtnHmo)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textField))
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addComponent(rdbtnPpo)
								.addGap(18)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE))))
					.addGap(33))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnHmo)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnPpo)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxDental)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxVision)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(btnCalcPrice))
					.addGap(2)
					.addComponent(textOutput, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
