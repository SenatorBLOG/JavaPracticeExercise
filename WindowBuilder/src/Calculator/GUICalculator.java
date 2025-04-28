package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class GUICalculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnMinus;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnPlus;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnEqual;
	private JButton btnMult;
	private JButton btn0;
	private JTextField textField;
	
	private double firstNumber;
	private double secondNumber;
	private String operator;
	private JButton btnDevide;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUICalculator frame = new GUICalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GUICalculator() {
		drawComponents();
		eventHandling();
		
	}
	public void eventHandling() {
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText() + "0");
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		//Operators
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
			    operator = "+";
			    textField.setText("");
			}
		});
		btnMinus.addActionListener(e -> {
		    firstNumber = Double.parseDouble(textField.getText());
		    operator = "-";
		    textField.setText("");
		});

		btnMult.addActionListener(e -> {
		    firstNumber = Double.parseDouble(textField.getText());
		    operator = "*";
		    textField.setText("");
		});

		btnDevide.addActionListener(e -> {
		    firstNumber = Double.parseDouble(textField.getText());
		    operator = "/";
		    textField.setText("");
		});
		btnEqual.addActionListener(e -> {
		    secondNumber = Double.parseDouble(textField.getText());
		    double result = 0;
		    
		    switch (operator) {
		        case "+":
		            result = firstNumber + secondNumber;
		            break;
		        case "-":
		            result = firstNumber - secondNumber;
		            break;
		        case "*":
		            result = firstNumber * secondNumber;
		            break;
		        case "/":
		            if (secondNumber != 0) {
		                result = firstNumber / secondNumber;
		            } else {
		                textField.setText("Error: divide by 0");
		                return;
		            }
		            break;
		    }
		    
		    textField.setText(String.valueOf(result));
		});

		
		
		
		
	}
	/**
	 * Create the frame.
	 * @return 
	 */
	public void drawComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		btn7 = new JButton("7");
		
		btn8 = new JButton("8");
		
		btn9 = new JButton("9");
		
		btn4 = new JButton("4");
		
		
		btn5 = new JButton("5");
		
		
		btn6 = new JButton("6");
		
		
		btn1 = new JButton("1");
		
		btn2 = new JButton("2");
		
		
		btn3 = new JButton("3");
		
		
		btnMult = new JButton("*");
		
		btn0 = new JButton("0");
		
		
		JButton btnNegaation = new JButton("+/-");
		
		btnMinus = new JButton("-");
		
		btnPlus = new JButton("+");
		
		
		btnEqual = new JButton("=");
		btnEqual.setBackground(new Color(63, 63, 63));
		
		btnDevide = new JButton("/");
		btnDevide.setBackground(new Color(184, 184, 184));
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(50)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnPlus, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btn7)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnMinus, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnMult, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNegaation, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnDevide, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnEqual, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(46, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(34, Short.MAX_VALUE)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn7)
						.addComponent(btn8)
						.addComponent(btn9)
						.addComponent(btnMinus))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn4)
						.addComponent(btn5)
						.addComponent(btn6)
						.addComponent(btnPlus))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn1)
						.addComponent(btn2)
						.addComponent(btn3)
						.addComponent(btnEqual))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnMult)
						.addComponent(btn0)
						.addComponent(btnNegaation)
						.addComponent(btnDevide))
					.addGap(33))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
