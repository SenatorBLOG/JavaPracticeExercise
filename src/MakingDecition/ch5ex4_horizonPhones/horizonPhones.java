package ch5ex4_horizonPhones;

import java.util.Scanner;

public class horizonPhones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your max talk minutes per month: ");
		int minutes = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter your max text messages per month: ");
		int text = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter your max data usage per month (Gb): ");
		int data = scanner.nextInt();
		scanner.nextLine();
		
		if(minutes< 500 && text ==0 && data ==0) {
			System.out.println("Plan A 49$ per months.");
		}
		if(minutes < 500 && text !=0 && data ==0) {
			System.out.println("Plan B 55$ per months.");
		}
		if(minutes >= 500 && text <100 && data ==0) {
			System.out.println("Plan C 61$ per months.");
		}
		if(minutes <= 500 && text >=100 && data ==0) {
			System.out.println("Plan D 70$ per months.");
		}
		if(data < 3 && data > 0) {
			System.out.println("Plan E 79$ per months.");
		}
		if(data >=3) {
			System.out.println("Plan F 87$ per months.");
		}
	}

}
