package ch8ex10;

public class DrugTest {
 
	    public static void main(String[] args) {
	        // Array to store the count of how many times each employee is selected
	        int[] employeeCounts = new int[30]; // Employees are numbered 1-30, but array indices are 0-29
	        int testedEmployee;

	        // Loop for 52 weeks
	        for (int week = 1; week <= 52; week++) {
	            // Randomly select an employee (1-30)
	            testedEmployee = 1 + (int)(Math.random() * 30);
	            
	            
	            // Increment the count for the selected employee
	            employeeCounts[testedEmployee - 1]++;

	            // Display the employee number
	            System.out.print(testedEmployee + " ");

	            // Print 4 employee numbers per line
	            if (week % 4 == 0) {
	                System.out.println();
	            }
	        }

	        // Display the count of how many times each employee was selected
	        System.out.println("\nEmployee selection counts:");
	        for (int i = 0; i < 30; i++) {
	            System.out.println("Employee " + (i + 1) + ": " + employeeCounts[i] + " times");
	        }

	        // Display employees who were never selected
	        System.out.println("\nEmployees never selected:");
	        boolean allSelected = true;
	        for (int i = 0; i < 30; i++) {
	            if (employeeCounts[i] == 0) {
	                System.out.print((i + 1) + " ");
	                allSelected = false;
	            }
	        }
	        if (allSelected) {
	            System.out.println("All employees were selected at least once.");
	        }
	    }
	}
