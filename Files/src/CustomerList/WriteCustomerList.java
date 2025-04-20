package CustomerList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteCustomerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean more = true;
		String filePath = "CustomerList.txt";
		while(more) {
			
			System.out.println("Enter customer ID number or 999 to exit; ");
			int id = sc.nextInt();
			sc.nextLine();
			if(id ==999)
				break;
			
			System.out.println("Enter cutomer first name: ");
			String firstName = sc.nextLine();
			System.out.println("Enter cutomer last name: ");
			String lastName = sc.nextLine();
			System.out.println("Enter a balance owed: ");
			double balance = sc.nextDouble();
			sc.nextLine();

			try (FileWriter writer = new FileWriter(filePath, true)) { 
	            writer.write("CustomerID: " + id + ",\n" +
	            		"first name: " + firstName + ",\n"+
	            		"last name: " + lastName + ",\n"+
	            		"balance owed: " + balance + ",\n"); 
	            System.out.println("Data succesfully added to a file: " + filePath);
	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
		
		}
		sc.close();  
	}
}
