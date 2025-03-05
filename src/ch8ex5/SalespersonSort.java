package ch8ex5;

import java.util.Scanner;

public class SalespersonSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Salesperson[] salesPeople = new Salesperson[4];
		
		
		for( int i =0; i<salesPeople.length;i++) {
			System.out.println("Enter a user " + (i+1) + " ID: ");
			int id = scanner.nextInt();
			
			System.out.println("Enter a user " + (i+1) + " sales amount: ");
			double sales = scanner.nextDouble();
			salesPeople[i] = new Salesperson(id,sales);
		}
		System.out.println("\nChose a sorting option: 1 - Sort by ID, 2 - Sort by Amount.");
		int input = scanner.nextInt();
		
		if( input ==1) {
			for (int i =0; i< salesPeople.length-1;i++) {
				for(int j = 0; j < salesPeople.length - 1 - i;j++) {
					if (salesPeople[j].getId() > salesPeople[j + 1].getId()) {
	                    // Обмен местами
	                    Salesperson temp = salesPeople[j];
	                    salesPeople[j] = salesPeople[j + 1];
	                    salesPeople[j + 1] = temp;
	                }
				}
			}
		}else {
			for(int i =0;i<salesPeople.length -1;i++) {
				for(int j = 0; j < salesPeople.length - 1 -i;j++) {
					if(salesPeople[j].getSales() > salesPeople[j + 1].getSales()) {
						Salesperson temp = salesPeople[j];
						salesPeople[j] = salesPeople[j + 1];
						salesPeople[j + 1] = temp;
					}
				}
				
			}
		}
		
		
		
		for(Salesperson s : salesPeople) {
			s.display();
		}
	}
	

}
