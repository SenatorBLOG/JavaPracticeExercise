package ch5ex1;

import java.util.Scanner;

public class LunchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What do you want for your sandwich?");
		String ingredient = scanner.nextLine();
		
		System.out.println("What kid of bread do you want?");
		String bread = scanner.nextLine();
		
		System.out.println("How much it cost?");
		double price = scanner.nextDouble();
		scanner.close();
		
		Sandwich sand1 = new Sandwich(ingredient, bread, price);
		System.out.println(sand1);
		
	}

}
