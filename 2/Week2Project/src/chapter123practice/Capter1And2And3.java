//This program is written by Mike Wazowsky
package chapter123practice;


import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * This is javadoc comments
 * This is main method which is entry point of the program
 */
public class Capter1And2And3 {
/**
 * This is javadoc comments
 * This is main method which is entry point of the program
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  user input for console applications
		// GUI input
		String grade = JOptionPane.showInputDialog(null,"Enter your grade");
		String marks = JOptionPane.showInputDialog(null,"Enter your marks");
		int intMarks = Integer.parseInt(marks);
		double dMarks = Double.parseDouble(marks);
		
		JOptionPane.showMessageDialog(null, "The grade is " + grade + " and marks are " + intMarks);
		
		int response = JOptionPane.showConfirmDialog(null, "Would you like to go on World tour?",
				"A question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		
		if(response == 0)
			System.out.println("You chouce yes");
		
		
		Scanner keyboard  = new Scanner(System.in);
		
		
		System.out.println("Enter your salary");
		double salary = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("Enter your name");
		String name2 = keyboard.nextLine();
		System.out.println("Welcome " + name2);
		
		
		
		System.out.println(name2 + " salary is " + salary);
		keyboard.close();
		
		
		
		System.out.println("Week 2 practice");
		byte bVal = 23;
		int iVal = 4656;
		long lVal = 2312313123112312L;
		System.out.println("lVal is " + lVal);
		boolean isChecked = true;
		boolean isBigger = (7 > 2);
		char ch = '$';
		char ch1 = 45;
		System.out.println("This char is  " + ch);
		int val = '%';
		System.out.println("The val is " + val);
		double dVal = 123.123;
		float fVal = 45.21f;
		
		String name = new String("DC");
		String n = "Douglas College";
		
		String s = """
				My school is DC
				is in
				BC
				is in
				Canada
				""";
		System.out.println(s);
				
			
		
	}

}
