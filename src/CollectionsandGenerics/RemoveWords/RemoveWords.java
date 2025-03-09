import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveWords {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list = new ArrayList<>();
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 String input = null;
		 do {
			 System.out.println("Enter a String");
			 input = scanner.nextLine();
			 
			 list.add(input); 
		 }while(input != "exit");
		 
		 for(String s:list) {
			 System.out.println(s);
		 }
		 
	}

}
