package Quiz1Practice;

import java.time.LocalDate;
import java.util.Scanner;

public class EventPlanner {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event event1 = getEvent();
		Event event2 = new Event();
		
		
		
		displayEvents(event1);
		displayEvents(event2);
		explainBudgetPolicy();
	}
	public static Event getEvent() {
		
		
		System.out.println("Enter name of the event.");
		String name = scanner.nextLine();
		
		System.out.println("Enter date of the event.");
		LocalDate date = LocalDate.parse(scanner.nextLine());
		
		System.out.println("Enter duration of the event.");
		int duration = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter budget of the event.");
		double budget = scanner.nextInt();
		scanner.nextLine();
		
		return new Event(name,date,duration,budget);
	}
//	public static Event findEventByDate(LocalDate date) {
//		System.out.println("What date are you looking for event (yyyy-mm-dd).");
//		LocalDate dateSearch = LocalDate.parse(scanner.nextLine());
//	}
	public static void displayEvents(Event event) {
		System.out.println(event);
	}
	public static void explainBudgetPolicy() {
		System.out.println("The budget should be realistic and proportional to the event's duration.");
	}
}
