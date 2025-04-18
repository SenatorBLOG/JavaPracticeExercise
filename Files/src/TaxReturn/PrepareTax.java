package TaxReturn;

import java.util.Scanner;

public class PrepareTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TaxReturn taxreturn = null;
		boolean more = true;
		
		while(more) {
			
			System.out.println("Enter the SSN number (must be in 000-00-0000 format): ");
			String ssn = sc.nextLine();
			if(ssn.length() != 11) {
				System.out.println("The SSN must contains 11 symbols including dashes.");
				continue;
			}
			if(!(ssn.matches("\\d{3}-\\d{2}-\\d{4}"))) {
				System.out.println("Incorrect SSN number.");
				continue;
			}
			
			System.out.println("Enter Last name: ");
			String lastName = sc.nextLine();
				
			System.out.println("Enter First Name : ");
			String firstName = sc.nextLine();
			
			System.out.println("Enter street address: ");
			String address = sc.nextLine();
			
			System.out.println("Enter a city name: ");
			String city = sc.nextLine();
			
			System.out.println("Enter a state: ");
			String state = sc.nextLine();
			String zipCode;
			while(true) {
				System.out.println("Enter a zip code: ");
				zipCode = sc.nextLine();
				if(!zipCode.matches("\\d+") || zipCode.length() !=5) {
					System.out.println("Incorrect Zip code - must contain 5 digits only.");
					continue;
				}
				
				break;
			}
			double income;
			while(true){
				System.out.println("Enter a annual income: ");
				income = sc.nextDouble();
				sc.nextLine();
				if( income < 0 ) {
					System.out.println("Income must be positive.");
					continue;
				}
				break;
			}
			boolean married;
			String marriedStr;
			while(true) {
				System.out.println("Enter a martial status (Married/Single): ");
				marriedStr = sc.nextLine();
				
				if(marriedStr.charAt(0) == 'M' || marriedStr.charAt(0) == 'm')  {
					married = true;
					break;
				}
				else if (marriedStr.charAt(0) == 'S' || marriedStr.charAt(0) == 's')  {
					married = false;
					break;
				}

			}
			
			taxreturn = new TaxReturn
					(ssn, lastName,firstName,address,city,state,zipCode,income,married);
			more = false;
		}
		System.out.println(taxreturn);
		sc.close();
		
		
	}

}
