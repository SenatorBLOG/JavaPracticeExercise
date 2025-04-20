package CustomerList;
import java.io.*;
import java.util.Scanner;
public class DisplaySelectedCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String filePath = "CustomerList.txt";
		boolean found = false;
		
		System.out.println("Enter a customer ID: ");
		String id = sc.nextLine();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) { 
			String line;
			while((line = reader.readLine()) != null){
				if (line.startsWith("CustomerID: " + id + ",")) {
				 System.out.println(line);
				found = true;
				}
			}
			if(!found) {
				System.out.println("ID is not found." );
			}
           
        } catch (IOException e) {
            System.out.println("Error: ID does nnot exist in database: " + e.getMessage());
        }
		
		
	}

}
