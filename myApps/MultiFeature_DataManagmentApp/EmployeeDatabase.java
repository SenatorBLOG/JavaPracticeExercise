package MultiFeature_DataManagmentApp;

import java.util.Scanner;

import ch8ex5.Salesperson;

public class EmployeeDatabase {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee [] employee = new Employee[10];
		
		CompletedCourses [] course = new CompletedCourses[3];
		boolean mainMenu = true;
		while (mainMenu) {
		System.out.println("Welcome to Data Managment Application.");
		System.out.println("1. Display all employees.");
		System.out.println("2. Display employees in reverse order.");
		System.out.println("3. Show Sales statistics.");
		System.out.println("4. Filter Sales.");
		System.out.println("5. Show above average.");
		System.out.println("6. Sort employee.");
		System.out.println("7. Modify Database");
		System.out.println("8. Random weekly selection for performance review.");
		System.out.println("9. Exit the Program.");
		System.out.println();
		
		int choice = scanner.nextInt();
		
		switch(choice) {
		
		case 1:
			
			for( Employee e : employee) {
				if (e == null) {
					System.out.println("List is null. Add data first.");
					break;
				}
				e.display();
			}
			break;
		case 2:
			for(int i = employee.length -1; i !=0;i--) {
				if (employee[i] == null) {
					System.out.println("List is null. Add data first.");
					break;

				}
				employee[i].display();
			}
			break;
		case 3:
			showStat(employee);
			break;
		case 4:
			filterSales(employee);
			break;
		case 5:
			aboveAvg(employee);
			break;
		case 6:
			sortEmployee(employee);
			break;
		case 7:
			modData(employee);
			break;
		case 8:
			selectEmp();
			break;
		case 9:
			mainMenu = false;
		
		}}
		
	}
	
	public static CompletedCourses[]  addCourse(CompletedCourses[]course) {
		System.out.println("Adding course.");
		
		for(int i = 0; i < course.length;i++) {
			
			int courseId = 300 + (int)(Math.random() * 500);
			int credit = 1 + (int)(Math.random() * 4);
			
			String letterGrade = "";
			
			while(true) {
				System.out.println("Enter Grade (A, B, C, D, or F) for " + courseId + ": ");
				letterGrade = scanner.nextLine().toUpperCase();
				
				if (letterGrade.equals("A") || letterGrade.equals("B") || letterGrade.equals("C") || 
						letterGrade.equals("D") || letterGrade.equals("E")) {
					System.out.println("The grade been saved.");
					break;
					
				}else {
					System.out.println("Invalid grade. Please enter a letter grade (A, B, C, D, or F).");
				}
			}
			
			course[i]= new CompletedCourses(courseId,credit,letterGrade);
		}
		return course;
	}
	
	
	public static void showStat(Employee[] employee) {
		System.out.println("Statistics to show: ");
		double total=0;
		double highest = 0;
		double lowest = 0;
		for(int i =0; i < employee.length; i++) {
			if (employee[i] == null) {
				System.out.println("List is null. Add data first.");
				break;

			}
			total = employee[i].getAnnualSale();
			if ( highest > employee[i].getAnnualSale()) {
				highest = employee[i].getAnnualSale();
			}
			if ( lowest > employee[i].getAnnualSale()) {
				lowest = employee[i].getAnnualSale();
			}
			
		
			double average = total/employee.length;
			System.out.printf("Total sale amount: %d.%n"
				+ "Average sale amount: %d.%n"
				+ "Highest sale amount: %d.%n"
				+ "Lowest sale amount: %d.%n",
				total,average,highest,lowest);
		
		}
		
	}
	
	public static void filterSales(Employee[] employee) {
		System.out.println("Show employees whose sales are below $40,000.");
		
		for( int i = 0; i < employee.length;i ++) {
			if (employee[i] == null) {
				System.out.println("List is null. Add data first.");
				break;

			}
			if(employee[i].getAnnualSale() < 40000) {
				System.out.println("Employee " + employee[i].getName() + 
						" have sales less than 40.000$.");
			}else {
				System.out.println("No any employee have sales less than 40.000$.");
			}		
		}
	}
	
	public static void aboveAvg(Employee[] employee) {
		double total=0;
		for(int i =0; i < employee.length; i++) {
			if (employee[i] == null) {
				System.out.println("List is null. Add data first.");
				break;

			}
			total = employee[i].getAnnualSale();
		}
		double average = total/employee.length;
		for(int i = 0; i < employee.length;i++) {
			if (employee[i] == null) {
				System.out.println("List is null. Add data first.");
				break;

			}
			if (employee[i].getAnnualSale() > average) {
				System.out.println("Employee " + employee[i].getName() + 
						", ID " + employee[i].getIdNumber() +
						" has sales above average.");
			}
		}
	}

	public static void sortEmployee(Employee[] employee) {
		System.out.println("Choose an option how would you like to sort employees.\n"
				+ "Enter 1 - to sort by an ID number, 2 - by annual sales.");
		int choice = scanner.nextInt();
		if(choice == 1) {
			for (int i =0; i< employee.length-1;i++) {
				if (employee[i] == null) {
					System.out.println("List is null. Add data first.");
					break;

				}
				for(int j = 0; j < employee.length - 1 - i;j++) {
					if (employee[j].getIdNumber() > employee[j + 1].getIdNumber()) {
	                    // Обмен местами
						Employee temp = employee[j];
	                    employee[j] = employee[j + 1];
	                    employee[j + 1] = temp;
	                }
				}
			}
		}else {
			for (int i =0; i< employee.length-1;i++) {
				if (employee[i] == null) {
					System.out.println("List is null. Add data first.");
					break;

				}
				for(int j = 0; j < employee.length - 1 - i;j++) {
					if (employee[j].getAnnualSale() > employee[j + 1].getAnnualSale()) {
	                    // Обмен местами
						Employee temp = employee[j];
	                    employee[j] = employee[j + 1];
	                    employee[j + 1] = temp;
	                }
				}
			}
		}
		
		
	}
	
	public static void modData(Employee[] employee) {
		boolean subMenu = true;
		
		while(subMenu) {
		System.out.println("How would you like to modify your database?");
		System.out.println("1. Add new employee.");
		System.out.println("2. Delete an employee.");
		System.out.println("3. Update sales data.");
		System.out.println("4. Back to main menu.");
		
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			addEmployee(employee);
			break;
		case 2:
			deleteEmployee(employee);
			break;
		case 3:
			updateEmployee(employee);
			break;
		case 4:
			subMenu = false;
			break;
		}
		}
		
	}
	
	public static Employee[] addEmployee(Employee[]employee) {
		System.out.println("Adding employee.");
		if (employee.length > 10) {
			System.out.println("You have reached the limit of employee number. Delete employee first.");
			return employee;
		}
		for(int i = 0; i < employee.length;i++) {
			
			
			if (employee[i] == null) {
				double salesAmount;
				System.out.println("Enter ID for " + (i+1)  + " Employee (1000 - 9999):");
				int empId = scanner.nextInt();
				if(empId < 1000 && empId > 9999) {
					System.out.println("Error. Employee ID must be between 1000 and 9999. Try again!");
					continue;
				}
				if (empId == employee[i].getIdNumber()) {
					System.out.println("ID is already exist. Please try again.");
					continue;
				}
				salesAmount = 30000 + (Math.random() * 5000);
				employee[i]= new Employee(empId,salesAmount);
		}
	}
		return employee;
}

	public static Employee[] deleteEmployee(Employee[]employee) {
		System.out.println("Deleting employee.");
		if (employee.length ==0) {
			System.out.println("You haven't add employee number. Delete employee first.");
			return employee;
		}
		for(int i = 0; i < employee.length;i++) {
			
			if (employee[i].getIdNumber() != 0) {
				
				System.out.println("Enter ID to remove.");
				int empId = scanner.nextInt();
				
				
				if (empId == employee[i].getIdNumber()) {
					System.out.println("You seccessfully deleted ID ");
					continue;
				}
				employee[i]= null;
			}
		}
		return employee;
		

}
	
	public static Employee[] updateEmployee(Employee[]employee) {
		System.out.println("Deleting employee.");
		int empId =0;
		int newId = 0;
		double newAmount= 0;
		for(int i = 0; i < employee.length;i++) {
			
			if (employee[i].getIdNumber() != 0) {
				System.out.println("Enter ID to update.");
				empId = scanner.nextInt();
			}
			if (empId == employee[i].getIdNumber()) {
				System.out.println("Enter new ID.");
				newId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter new sales value.");
				newAmount = scanner.nextDouble();
				continue;
			}
			employee[i]= new Employee(newId,newAmount);	
		}
		return employee;
	}	
	
	public static void selectEmp() {
		int testedEmployee;
		int[] Employee = new int[30];
		
		for(int week = 0; week < 52;week++) {
			 testedEmployee = 1 + (int)(Math.random() * 30);
			 Employee[testedEmployee + 1]++;
			 
			 System.out.println(testedEmployee + " ");
			 
		}
	}
}
	
