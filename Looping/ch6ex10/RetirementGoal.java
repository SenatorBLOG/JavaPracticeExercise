package ch6ex10;
import java.util.Scanner;

public class RetirementGoal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int years;
		double annualSave;
		
		do {
			System.out.println("Enter years until retirement.");
			years = scanner.nextInt();
			if(years<=0) {System.out.println("Years must be greate than 0.");}
		}while (years<=0);
		
		do {
			System.out.println("Enter amount you can save annualy.");
			annualSave = scanner.nextInt();
			if(annualSave <= 0) {System.out.println("Amount must be positive.");}
			
		}while(annualSave <=0);
		
		double intTotal = 0;
		double total = years * annualSave * 12;
		for(int i =0;i<years;i++) {
		intTotal =intTotal * 1.04 + annualSave * 12 ;
		}
		
		System.out.println("You gonna save for years: " + years);
		System.out.println("Your total saving for retirement: " + total);
		System.out.println("Your total with 4% interest: " + intTotal);
		
		
	}

}
