package chapter123practice;

import java.util.Scanner;

public class InchConversion {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner keyboard  = new Scanner(System.in);
		
		
		System.out.println("Enter inches");
		
		
		double inches = keyboard.nextDouble();
		
		
		inchToFeet(inches);
		inchToYard(inches);
		
		keyboard.close();
	}
	
	public static void inchToFeet(double inches)
	{
		double feets = 12 * inches;
		System.out.println( inches + " inches is " + feets + " feets");
	}
	
	public static void inchToYard(double inches)
	{
		double yards = (12 * inches)/3;
		System.out.println( inches + " inches is " + yards + " yards");
	}

}
