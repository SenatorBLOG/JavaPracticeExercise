package loops;

import java.util.Scanner;

public class ch6practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		for(int row= 1; row <= 9; row++) {
			for(int col = 1; col <=7; col++) {
				System.out.print(row * col + " ");
			}
			System.out.println();
		}
		
		for(int row= 1; row <= 5; row++) {
			for(int col = 1; col <=4; col++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		int fact = 1;
        for(int i = 1; i <= 15; ++i)
        {
            fact = fact * i;
            
            System.out.println(i + " " + fact);
        }
        
        for(int row= 1; row <= 5; row++) {
        	
			for(int col = 1; col <=5 && row>=col; col++) {
				System.out.print(col  + " ");
			}
			System.out.println();
			
		}
		for(int row= 1; row <= 5; row++) {
		        	
					for(int col = 1; col <=5 && row>=col; col++) {
						System.out.print(col  + " ");
					}
					System.out.println();
					
				}
        
        
        
		
		for(int count =0;count < 1; count++) {
			System.out.println(count);
		}
		
		//data validation
		
		System.out.println("Enter a value less than 100.");
		int value = scanner.nextInt();
		while(value > 100) {
			System.out.println("THe value is invalid");
			System.out.println("Enter a valid value");
			value = scanner.nextInt();
		}
		System.out.println("The  valid value is " + value);
		
		//event controlled loop
		final double INT_RATE  = 0.04;
				
		System.out.println("Enter current balance.");
		double balance = scanner.nextDouble();
		System.out.println("Would you like to see next year balance" 
						+ "enter 1 for yes or other num for no");
		int response = scanner.nextInt();
				
		while(response == 1) {
			balance = balance + (balance * INT_RATE);
			System.out.println("New balance will be " + balance);
			System.out.println("Would you like to see next year balance" 
							+ "enter 1 for yes or other num for no");
			response = scanner.nextInt();
		}
		System.out.println("After loop execution");
		
		//counted loop
		int count = 5;
		int num = 1;
		int sum = 11;
		
		
		//System.out.println("Enter ending value");
		
		//int endVal = Integer.parseInt(scanner.nextLine());
		
		
		
		
//		//counted loop
//		while (num <= endVal) {
//			sum = count + num;
//			System.out.println(count + " + " + num +  " = " + sum);
//			num++;
//		}
		
	}

}
