package Exersice6;

import java.util.Scanner;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer number.");
		int first = scanner.nextInt();
		
		System.out.println("Enter a double number.");
		double second = scanner.nextDouble();
		
		
		System.out.println("The root off "+first+" is "+Math.sqrt(first));
		System.out.println("The random value between 0 and "+first+" is "+ (int)(Math.random()*10));
		System.out.println("The floor value of double - " + Math.floor(second) 
			+ ", celing value - " + Math.ceil(second)
			+ ", round value  - " + Math.round(second));
		System.out.println("The min is " + Math.min(first,second) + " max is " + Math.max(first, second));
	}

	

}
