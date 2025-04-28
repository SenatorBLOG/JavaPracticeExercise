package guipackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class WindowBuilder extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblName;
	private JLabel lblTitle;
	private JButton btnClose;
	private JButton btnShowMessage;
	private JTextField textInputName;
	private JTextField textInputScore;
	private JLabel lblScore;
	private JRadioButton rdbtnUndergrad;
	private JRadioButton rdbtnGrad;
	private final ButtonGroup btnGroup = new ButtonGroup();
	private JCheckBox chckbxInter;
	private JComboBox cmbFaculty;
	private JComboBox cmbDepartments;
	private JList listSchools;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilder frame = new WindowBuilder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowBuilder() {
		drawComponents();
		eventHhandling();
		
	}
	private void eventHhandling() {
		btnShowMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textInputName.getText();
				
				double score = Double.parseDouble(textInputScore.getText());
				
				String studStatus = "";
				if(rdbtnUndergrad.isSelected())
					studStatus = "Undergrad";
				else
					if(rdbtnGrad.isSelected())
						studStatus = "grad";
				
				String stat;
				if(chckbxInter.isSelected()) {
					stat = "International";
					
				}
				else 
					stat = "Domestic";
							
				String faculty = cmbFaculty.getSelectedItem().toString();
				String dept = cmbDepartments.getSelectedItem().toString();
				String school = listSchools.getSelectedValue().toString();
				
				
				Student student = new Student(name,score,studStatus);
				student.setStudStat(stat);
				String grade = student.calculateLetterGrade();
				double fee = student.calculateFee();
				
				
				
				JOptionPane.showMessageDialog(null, name + " got " + score + "  " + grade + ". And pay" + fee 
						+ " is taking course with " + faculty + " with " + dept);
			}
			
		});
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	private void drawComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("My First GUI App");
		setContentPane(contentPane);
		
		lblTitle = new JLabel("Student Form");
		lblTitle.setFont(new Font("Helvetica", Font.PLAIN, 16));
		
		lblName = new JLabel("Enter student name");
		
		btnShowMessage = new JButton("Show Message");
		
		btnClose = new JButton("Close App");
		
		textInputName = new JTextField();
		textInputName.setColumns(10);
		
		lblScore = new JLabel("Enter Your Score");
		
		textInputScore = new JTextField();
		textInputScore.setColumns(10);
		
		rdbtnUndergrad = new JRadioButton(" Undergrad student");
		btnGroup.add(rdbtnUndergrad);
		rdbtnUndergrad.setSelected(true);
		
		rdbtnGrad = new JRadioButton("Grad student");
		btnGroup.add(rdbtnGrad);
		
		chckbxInter = new JCheckBox("International");
		
		cmbFaculty = new JComboBox();
		cmbFaculty.setModel(new DefaultComboBoxModel(new String[] {"Ivan", "Rupa", "Hui", "Cheng"}));
		
		cmbDepartments = new JComboBox();
		String [] deptNames  = {"CSIS", "BUSN", "ACCT"};
		Arrays.sort(deptNames);
		for(int i = 0;i<deptNames.length;i++) {
			cmbDepartments.addItem(deptNames[i]);
		}
		cmbDepartments.setSelectedIndex(2);
		
		listSchools = new JList();
		listSchools.setModel(new AbstractListModel() {
			String[] values = new String[] {"UBC ", "SFU", "Douglas", "UFV"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(175, Short.MAX_VALUE)
					.addComponent(lblTitle)
					.addGap(169))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(88)
							.addComponent(btnShowMessage)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnClose))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblName)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(rdbtnUndergrad)
									.addComponent(lblScore)
									.addComponent(rdbtnGrad)))
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(textInputScore)
									.addComponent(textInputName, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(6)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(cmbDepartments, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(cmbFaculty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(chckbxInter))
									.addGap(4)
									.addComponent(listSchools, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblTitle)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textInputName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblName))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblScore)
						.addComponent(textInputScore, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnUndergrad)
						.addComponent(chckbxInter))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbDepartments, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(listSchools, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(rdbtnGrad)
									.addComponent(cmbFaculty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnShowMessage)
						.addComponent(btnClose))
					.addGap(35))
		);
		contentPane.setLayout(gl_contentPane);
		
	}
}
