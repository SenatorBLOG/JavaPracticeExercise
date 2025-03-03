package ch6ex12_purchase;
import java.util.Scanner;
public class CreatePurchase {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Purchase purchase1 = getData();
		
		purchase1.display();
		
			
		}
	public static Purchase getData() {
		int inputId;
		double amount;
		do {
			System.out.println("Enter a number ID (1000-8000).");
			inputId = scanner.nextInt();
			if(inputId < 1000 || inputId > 8000) {
				System.out.println("Incorrect iD ( must be between 1000-8000).");}
			}while(inputId < 1000 || inputId > 8000);
		do {
			System.out.println("Enter a sale amount.");
			amount = scanner.nextDouble();
			if(amount<=0) {System.out.println("The amount must be positive.");}
		}while(amount<=0);
		
		return new Purchase(inputId,amount);
	}
	

}
