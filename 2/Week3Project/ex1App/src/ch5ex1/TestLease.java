package ch5ex1;

import java.util.Scanner;

public class TestLease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lease lease1 = getData();
//		Lease lease2 = getData();
//		Lease lease3 = getData();
		Lease lease4 = new Lease();
		
		System.out.println("This is a lease obj..");
		showValues(lease1);
		lease1.addPetFee();
//		showValues(lease2);
//		showValues(lease3);
//		showValues(lease4);
		
		showValues(lease1);
			
		}
	
	public static Lease getData() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Whats the tenants naame?");
		String name = scanner.nextLine();
		
		System.out.println("Appartment number?");
		int number = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Whats the rent price.");
		double rent = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Lease period?");
		int term = scanner.nextInt();
		
		
		return new Lease(name,number,rent,term);
		
	}
	
	public static void showValues(Lease lease) {
		
		System.out.println(lease);
		}
}
