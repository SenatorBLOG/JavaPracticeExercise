package Exersice9;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DaysTilNextMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter date (yyyy-mm-dd).");
		LocalDate date1 = LocalDate.parse(scanner.nextLine());
		
		int dayOfMonth = date1.getDayOfMonth();

		
		int lengthOfMonth = date1.lengthOfMonth();
		int left = lengthOfMonth - dayOfMonth;
		
		Month nextMonth = date1.plusMonths(1).getMonth();

		System.out.println("There are " + left + " days left until " + nextMonth + " starts");
		scanner.close();
	}

}
