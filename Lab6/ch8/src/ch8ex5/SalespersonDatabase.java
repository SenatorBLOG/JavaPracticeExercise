package ch8ex5;

import java.util.Scanner;

public class SalespersonDatabase {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salesperson[] salesPeople = new Salesperson[3];
		
		boolean exit =false;
		while(!exit) {
			System.out.println("Choose the option from the menu: ");
			System.out.println("1. Add a record to the database.");
			System.out.println("2. Delete record from the database.");
			System.out.println("3. Change a record in the database.");
			System.out.println("4. Display all records.");
			System.out.println("5. Exit the program.");
			
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("\nAdd a record: ");
				addRecord(salesPeople);
				break;
			case 2:
				System.out.println("\nDelete a record: ");
				deleteRecord(salesPeople);
				break;
			case 3:
				System.out.println("\nChange a record in the database.");
				System.out.println("Enter ID to be changed: ");
				int idChange = scanner.nextInt();
				changeRecord(salesPeople,idChange);
				break;
			case 4:
				for(Salesperson s : salesPeople) {
					s.display();
				}
				break;
			case 5:
				System.out.println("You exit program!");
				exit =true;
				break;
			default:
				System.out.println("Enter a numeric value from 1 to 5.");
					
			}	
		}
		
		
	}
	public static Salesperson[] addRecord(Salesperson[] salesPeople) {
		if (salesPeople.length >= 20) {
			System.out.println("The database is full.");
			return salesPeople;
		}
		for( int i =0; i<salesPeople.length;i++) {
			System.out.println("Enter a user " + (i+1) + " ID: ");
			int id = scanner.nextInt();
			
			//Check for existing iD
			boolean isExist = false;
			for(Salesperson s : salesPeople) {
				if (s != null && id == s.getId()) {
					isExist = true;
					break;
				}
			}
			if(isExist) {
				System.out.println("ID is alredy exist.");
				continue;
			}
			
			System.out.println("Enter a user " + (i+1) + " sales amount: ");
			double sales = scanner.nextDouble();
			salesPeople[i] = new Salesperson(id,sales);
				
		}
		return salesPeople;
	}
	public static Salesperson[] deleteRecord(Salesperson[] salesPeople) {
		
		
		for( int i = 0; i<salesPeople.length;i++) {
			if(salesPeople[i] == null) {
				System.out.println("This member id dosent exist.");
				break;
			}
			System.out.println("Enter ID to be removed: ");
			int idRemove = scanner.nextInt();
			
			if(salesPeople[i].getId() != idRemove) {
				System.out.println("This id dosent exist.");
				break;
			}
			
			if(salesPeople[i].getId() == idRemove) {
				System.out.println("You successefully deleted " + salesPeople[i]);
				salesPeople[i] = null;
				break;	
			}
			
		}
		return salesPeople;
		
	}

	public static Salesperson[] changeRecord(Salesperson[] salesPeople, int idChange) {
		for( int i = 0; i<salesPeople.length;i++) {
			if(salesPeople[i] != null && salesPeople[i].getId() == idChange) {
				for( int j =0; j < 1;j++) {
					System.out.println("Enter new user ID: ");
					int id = scanner.nextInt();
					
					System.out.println("Enter new user sales amount: ");
					double sales = scanner.nextDouble();
					salesPeople[i] = new Salesperson(id,sales);
				}
				System.out.println("You successefully changed " + salesPeople[i]);
				break;	
			}
		}
		return salesPeople;
		
	}
}
