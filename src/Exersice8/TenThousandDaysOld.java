package Exersice8;

import java.time.LocalDate;
import java.util.Scanner;

public class TenThousandDaysOld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your date of birth (yyyy-mm-dd).");
		LocalDate date1 = LocalDate.parse(scanner.nextLine());
		
		System.out.println("You will become or became 10000 days old in " + date1.plusDays(10000));
		scanner.close();
	}

}
