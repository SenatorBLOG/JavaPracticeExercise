package studentsStanding;
import java.io.*;
import java.util.*;

public class StudentsStanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String goodStandingFile = "Good_standing.txt";
		String probationFile = "probation.txt";
		boolean exit = false;
		try (BufferedWriter writer1 = new BufferedWriter(new FileWriter(goodStandingFile));
		         BufferedWriter writer2 = new BufferedWriter(new FileWriter(probationFile))) {
				
			while(!exit) {
				System.out.println("Enter an ID number (999 to exit): ");
				String id = sc.nextLine();
				if(id.equals("999")) {
					break;
				}
				System.out.println("Enter a student Name: ");
				String name = sc.nextLine();
				System.out.println("Enter student GPA: ");
				try{
					int gpa = sc.nextInt();
					
					if(gpa >= 2.0) {
						System.out.println("Student with a good standing has been added to ." + goodStandingFile);
						String record = id + "," + name + "," + gpa;
						writer1.write(record);
						writer1.newLine();
					}if(gpa < 2 && gpa >0){
						System.out.println("Student on probation has been added to ." + probationFile);
						String record = id + "," + name + "," + gpa;
						writer2.write(record);
						writer2.newLine();
					}if(gpa<0) {
						System.out.println("GPA must be positibve.");
						continue;
					}
				
				}catch (NumberFormatException e) {
					System.out.println("Incorrect data formmat" + e.getMessage());
				}	
				sc.nextLine();
			}
		} catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
		sc.close();
		
	}

}
