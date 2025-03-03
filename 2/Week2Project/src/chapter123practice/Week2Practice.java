package chapter123practice;

import javax.swing.JOptionPane;

public class Week2Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String lengthStr = JOptionPane.showInputDialog(null,
				"Enter a room length");
		double length = Double.parseDouble(lengthStr);
		
		String widthStr = JOptionPane.showInputDialog(null,
				"Enter a room width");
		double width = Double.parseDouble(widthStr);
		
		String heightStr = JOptionPane.showInputDialog(null,
				"Enter a room height");
		double height = Double.parseDouble(heightStr);
		
			
		double price = priceCalc(length,width,height);
		
		JOptionPane.showMessageDialog(null, "This is the price " + price );
	}
	
	public static double priceCalc(double length, double width, double height)
	{
		double area = 2*(length + width) * height;
		double gallons = paintCalc(area);
		double price = gallons * 32;
		return price;
	}
	public static double paintCalc(double area)//Passes the calculated wall area to another method that calculates and returns the number of gallons ofpaint needed
	{
			double gallons = area/350.0f;
			return gallons;
	}

}
