package CustomerList;
import java.io.*;
import java.util.Scanner;
public class DisplaySelectedCustomersByBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String filePath = "CustomerList.txt";
		boolean found = false;
		
		System.out.println("Enter a customer balance: ");
		String inputBalance = sc.nextLine().trim();
		double inputBalanceDouble = Double.parseDouble(inputBalance);
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) { 
			String line1, line2, line3,line4;
			
			while((line1 = reader.readLine()) != null &&
					(line2 = reader.readLine()) != null &&
					(line3 = reader.readLine()) != null &&
					(line4 = reader.readLine()) != null ){
				String docBalance = line4.replace("balance owed: ", "").replace(",", "");
				double docBalanceDouble = Double.parseDouble(docBalance);
					if(docBalanceDouble >= inputBalanceDouble) {
						
						System.out.println(line1);
						System.out.println(line2);
						System.out.println(line3);
						System.out.println(line4);
						found = true;
					}		
				}
			
			
		if(!found) {
			System.out.println("Customer with that last name is not found." );
		}
           
        } catch (IOException e) {
            System.out.println("Error: ID does not exist in database: " + e.getMessage());
        }	
	}
}


