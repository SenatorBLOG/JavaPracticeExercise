package ch6ex3;

import java.util.Scanner;

public class Factorials_3ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("Enter a number for rfactorial.");
			int x = scanner.nextInt();
			int fact=1;
			for (int i = 1;i<=x;i++) {
				fact = (fact * i);
			}
			System.out.println("Factorial of " + x + " is: " + fact);
			
		}
	}

}
