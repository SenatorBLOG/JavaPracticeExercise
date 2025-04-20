package CustomerList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class DisplaySavedCustomerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "CustomerList.txt";
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) { 
			String line;
			while((line = reader.readLine()) != null){
				 System.out.println(line);
			}
           
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
}


