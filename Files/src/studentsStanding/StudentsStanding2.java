package studentsStanding;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StudentsStanding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String goodStandingFile = "Good_standing.txt";
		String probationFile = "probation.txt";
		boolean exit = false;
		try (BufferedReader reader1 = new BufferedReader(new FileReader(goodStandingFile));
		         BufferedReader reader2 = new BufferedReader(new FileReader(probationFile))) {
				String line1;
				String[] strArr1;
				System.out.println("Students with GPA higher than 2.0.");
				while((line1 = reader1.readLine()) !=null) {
					strArr1 = line1.split(",");
					double gpa1 = Double.parseDouble(strArr1[2]);
					double exceeds = gpa1 - 2;
					System.out.println(line1 + "," + exceeds);
				}
					
		} catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
		
	}

}
