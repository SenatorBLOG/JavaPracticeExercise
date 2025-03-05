package ch5ex1;

import java.time.LocalDate;
import java.util.Scanner;

public class TestFitnessTracker {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FitnessTracker fit1 = getData();
		FitnessTracker fit2 = new FitnessTracker();
		showValues(fit1);
		showValues(fit2);
	}
	public static FitnessTracker getData() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name of the activity.");
		String name = scanner.nextLine();
		
		System.out.println("Enter amount of minutes for the activity.");
		int time = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter date for the activity (yyyy-mm-dd).");
		String dateInput = scanner.nextLine();
		
		LocalDate date = LocalDate.parse(dateInput);
		scanner.close();
		
		return new FitnessTracker(name,time,date);
	}
	public static void showValues(FitnessTracker fit) {
		System.out.println(fit);
	}

}
