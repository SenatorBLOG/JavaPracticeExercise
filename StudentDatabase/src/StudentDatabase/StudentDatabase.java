package StudentDatabase;
import java.util.*;

import FilesInputOutput.Student;

import java.io.*;
public class StudentDatabase {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		File file = new File("StudentRecords.txt");
		
		System.out.println("Welcome to a student database.\n");
		System.out.println("1.Add a New Student.");
		System.out.println("2.Modify an Existing Record (Change GPA).");
		System.out.println("3.Search by Email Address.");
		System.out.println("4.Search by Degree Program.");
		System.out.println("5.Exit the program.");
		
		int userInput = scanner.nextInt();
		switch(userInput) {
		case 1: 
			addStudent();
			break;
		case 2:
			modRecord();
			break;
		case 3:
			emailSearch();
			break;
		case 4:
			programSearch();
			break;
		case 5:
			return;
		}
		System.out.println("");
	}

	private static void programSearch() {
		// TODO Auto-generated method stub
		
	}

	private static void emailSearch() {
		// TODO Auto-generated method stub
		
	}

	private static void modRecord() {
		// TODO Auto-generated method stub
		
	}

	private static void addStudent() {
		FileWriter fw = new FileWriter("StudentRecords.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		
		
		int id;
		if ( id)
		System.out.println("Enter Student id: ");
		id = scanner.nextInt();
		scanner.nextLine();
		
		
		Student stud1 = new Student();
		pw.println(stud1);
		System.out.println(stud1.toString());
		
//		pw.print("SamaA");
//		pw.print(" 343434\n");
//		pw.println("DavaA 4545");
//		pw.println("Losea 1233");
		System.out.println("Data has saved.");
		pw.close();
		
	}

}
