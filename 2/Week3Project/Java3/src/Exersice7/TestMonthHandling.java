package Exersice7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestMonthHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     

        // Prompt the user for two dates
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());

        // Display the original dates and the dates with added months
        System.out.println("\nResults:");
        displayDateWithMonthsAdded(date1, "First date");
        displayDateWithMonthsAdded(date2, "Second date");

        scanner.close();
    }

    private static void displayDateWithMonthsAdded(LocalDate date, String label) {
        System.out.println(label + " (original): " + date);
        System.out.println(label + " + 1 month: " + date.plusMonths(1));
        System.out.println(label + " + 2 months: " + date.plusMonths(2));
        System.out.println(label + " + 3 months: " + date.plusMonths(3));
        System.out.println();
    }
}
