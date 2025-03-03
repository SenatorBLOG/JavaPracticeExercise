package chapter123practice;

import javax.swing.JOptionPane;

public class Chapter3 {
	/**
	 * main methhod
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		final double INTEREST_RATE = 7.5; //constants declare
		String fValStr = JOptionPane.showInputDialog(null,
				"Enter first value");
		double fVal = Double.parseDouble(fValStr);
		
		String sValStr = JOptionPane.showInputDialog(null,
				"Enter second value");
		double sVal = Double.parseDouble(sValStr);
		
		double res = add(fVal,sVal);
		JOptionPane.showMessageDialog(null, "This is the sum " + res);
		
		
	}
	/**
	 * 
	 * @param fVal
	 * @param sVal
	 */
	public static double add(double fVal, double sVal)
	{
		double result = fVal + sVal;
		//System.out.println("this is the sum);
		//JOptionPane.showMessageDialog(null, "This is the sum " + result);
		return result;
	}
	public static double add(int fVal, int sVal)
	{
		double result = fVal + sVal;
		//System.out.println("this is the sum);
		//JOptionPane.showMessageDialog(null, "This is the sum " + result);
		return result;
	}
	/**
	 * this is add method to add two values
	 */
//	public static void add()
//	{
//		String fValStr = JOptionPane.showInputDialog(null,"Enter first value");
//		double fVal = Double.parseDouble(fValStr);
//		
//		String sValStr = JOptionPane.showInputDialog(null,"Enter second value");
//		double sVal = Double.parseDouble(sValStr);
//		
//		double result = fVal + sVal;
//		//System.out.println("this is the sum);
//		JOptionPane.showMessageDialog(null, "This is the sum " + result);
//	}
}
