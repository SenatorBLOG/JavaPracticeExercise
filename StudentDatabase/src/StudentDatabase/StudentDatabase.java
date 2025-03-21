package StudentDatabase;
import java.util.*;
import java.io.*;
/**
 * The StudentDatabase class allows users to manage student records.
 * It provides functionality to add, modify, and search student records stored in a text file.
 */
public class StudentDatabase {
	static Scanner scanner = new Scanner(System.in);
	/**
     * Main method that serves as the entry point of the application.
     *
     * @param args Command-line arguments
     * @throws IOException if there is an issue with file operations
     */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		File file = new File("StudentRecords.txt");
		
		boolean exit = false;
		while(!exit) {
			
		
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
			System.out.println("You exited the program.");
			exit = false;
			return;
		}
		System.out.println("");
		}
	}
	/**
     * Searches for students by their degree program.
     * 
     * @throws IOException If an I/O error occurs.
     */
	private static void programSearch() throws IOException {
	    File file = new File("StudentRecords.txt");
	    
	    // Check if the file exists and has data
	    if (!file.exists() || file.length() == 0) {
	        System.out.println("No students in database to search.");
	        return;
	    }
	    
	    // Get degree program from user
	    System.out.println("Enter degree program (e.g., COMPUTER_SCIENCE, BUSINESS, ENGINEERING, ARTS):");
	    String searchProgram = scanner.nextLine().trim().toUpperCase();
	    
	    // Check if the input is a valid degree program
	    boolean isValidProgram = false;
	    String[] validPrograms = {"COMPUTER_SCIENCE", "BUSINESS", "ENGINEERING", "ARTS"};
	    for (String program : validPrograms) {
	        if (program.equals(searchProgram)) {
	            isValidProgram = true;
	            break;
	        }
	    }
	    if (!isValidProgram) {
	        System.out.println("Invalid degree program entered.");
	        return;
	    }
	    
	    // Read the file and find matching students
	    Scanner fileScanner = new Scanner(file);
	    String currentStudent = "";
	    boolean foundAny = false;
	    
	    while (fileScanner.hasNextLine()) {
	        String line = fileScanner.nextLine();
	        if (line.startsWith("Student ID ")) {
	            // New student block starts
	            if (!currentStudent.isEmpty() && currentStudent.contains("Program: " + searchProgram)) {
	                System.out.println(currentStudent);
	                foundAny = true;
	            }
	            currentStudent = line + "\n";
	        } else if (!line.isEmpty()) {
	            currentStudent += line + "\n";
	        } else {
	            // End of a student block
	            if (currentStudent.contains("Program: " + searchProgram)) {
	                System.out.println(currentStudent);
	                foundAny = true;
	            }
	            currentStudent = "";
	        }
	    }
	    // Check the last student block
	    if (!currentStudent.isEmpty() && currentStudent.contains("Program: " + searchProgram)) {
	        System.out.println(currentStudent);
	        foundAny = true;
	    }
	    
	    fileScanner.close();
	    
	    // If no matches found, say so
	    if (!foundAny) {
	        System.out.println("No students found in degree program: " + searchProgram);
	    }
	}
	/**
     * Searches for a student by email and displays their details.
     *
     * @throws IOException if an error occurs while reading the file
     */
	private static void emailSearch() throws IOException {
	    File file = new File("StudentRecords.txt");
	    
	    // Check if file exists and has data
	    if (!file.exists() || file.length() == 0) {
	        System.out.println("No students in database to search.");
	        return;
	    }
	    
	    // Ask for email to search
	    System.out.print("Enter email to search: ");
	    String searchEmail = scanner.nextLine().trim();
	    
	    // Read all lines from file
	    Scanner fileScanner = new Scanner(file);
	    String allLines = "";
	    boolean found = false;
	    
	    while (fileScanner.hasNextLine()) {
	        String line = fileScanner.nextLine();
	        allLines += line + "\n";
	        
	        // Check if this is the Email line we want
	        if (line.startsWith("Email: " + searchEmail)) {
	            found = true;
	            // Collect previous line (ID) and next lines (First name to GPA)
	            String idLine = allLines.substring(allLines.lastIndexOf("Student ID ", allLines.length() - line.length() - 1), 
	                                              allLines.indexOf("\n", allLines.lastIndexOf("Student ID ")));
	            String firstNameLine = fileScanner.nextLine();
	            String lastNameLine = fileScanner.nextLine();
	            String addressLine = fileScanner.nextLine();
	            String programLine = fileScanner.nextLine();
	            String gpaLine = fileScanner.nextLine();
	            
	            // Print student details
	            System.out.println("Student found:");
	            System.out.println(idLine);
	            System.out.println("Email: " + searchEmail);
	            System.out.println(firstNameLine);
	            System.out.println(lastNameLine);
	            System.out.println(addressLine);
	            System.out.println(programLine);
	            System.out.println(gpaLine);
	            
	            // Skip remaining lines for this student
	            fileScanner.nextLine(); // Separator line
	            break;
	        }
	    }
	    fileScanner.close();
	    
	    if (!found) {
	        System.out.println("No student found with email: " + searchEmail);
	    }
	}
	/**
     * Modifies an existing student's GPA.
     *
     * @throws IOException if an error occurs while reading or writing to the file
     */
	private static void modRecord() throws IOException {
	    File file = new File("StudentRecords.txt");

	    // Check if file is empty or doesn’t exist
	    if (!file.exists() || file.length() == 0) {
	        System.out.println("No students to modify.");
	        return;
	    }

	    // Get student ID and new GPA from user
	    System.out.print("Enter Student ID to change GPA: ");
	    int id = scanner.nextInt();
	    scanner.nextLine();

	    System.out.print("Enter new GPA: ");
	    int newGpa = scanner.nextInt();
	    scanner.nextLine();

	    // Read file and update the record
	    Scanner fileScanner = new Scanner(file);
	    StringBuilder newContent = new StringBuilder();
	    boolean found = false;

	    while (fileScanner.hasNextLine()) {
	        String line = fileScanner.nextLine();
	        newContent.append(line).append("\n");

	        // If this line has the student ID
	        if (line.startsWith("Student ID " + id)) {
	            found = true;
	            // Copy next 5 lines (Email, First name, Last name, Address, Program)
	            for (int i = 0; i < 5 && fileScanner.hasNextLine(); i++) {
	                line = fileScanner.nextLine();
	                newContent.append(line).append("\n");
	            }
	            // Skip old GPA and add new GPA
	            if (fileScanner.hasNextLine()) {
	                fileScanner.nextLine(); // Skip old GPA
	                newContent.append("GPA: ").append(newGpa).append("\n");
	            }
	        }
	    }
	    fileScanner.close();

	    // Save changes if student was found
	    if (found) {
	        FileWriter writer = new FileWriter("StudentRecords.txt");
	        writer.write(newContent.toString());
	        writer.close();
	        System.out.println("GPA updated for Student ID " + id);
	    } else {
	        System.out.println("Student ID " + id + " not found.");
	    }
	    StudentSort.idSort();
	}
	/**
     * Adds a new student to the database.
     *
     * @throws IOException if an error occurs while writing to the file
     */
	public static void addStudent() throws IOException {
        File file = new File("StudentRecords.txt");
        boolean fileExist = file.exists();
        
        int input = 0;
        do {
	        // Read existing IDs
	        String existingId = "";
	        if (fileExist) {
	            Scanner fileScanner = new Scanner(file);
	            while (fileScanner.hasNextLine()) {
	                existingId += fileScanner.nextLine().trim() + "\n";
	            }
	            fileScanner.close();
	        }
	
	        // Request new ID
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter student ID: ");
	        
	        if (!scanner.hasNextInt()) {
	            System.out.println("Error: ID must be an integer number.");
	            return;
	        }
	        
	        int id = scanner.nextInt();
	        scanner.nextLine(); 
	
	        // Check uniqueness (line-based comparison)
	        boolean idExists = false;
	        if (fileExist) {
	            Scanner fileScanner = new Scanner(file);
	            while (fileScanner.hasNextLine()) {
	                String line = fileScanner.nextLine().trim();
	                if (line.equals("Student ID " + id)) {
	                    idExists = true;
	                    break;
	                }
	            }
	            fileScanner.close();
	        }

	        if (idExists) {
	            System.out.println("Error: ID already exists.");
	            continue;
	        }
	        
	        Student student = StudentSort.createStudent(id);
		    StudentSort.count++;
	
	        // Write new ID to file
	        FileWriter writer = new FileWriter("StudentRecords.txt", true);
	       
	        writer.write("Student ID " + id + "\n");
	        
	        writer.write("Email: " + student.getEmail() + "\n");
	        writer.write("First name: " + student.getPerson().getfName() + "\n");
	        writer.write("Last name: " + student.getPerson().getlName() + "\n");
	        writer.write("Address: " + student.getPerson().getAddress() + "\n");
	        writer.write("Program: " + student.getProgram().name() + "\n");
	        writer.write("GPA: " + student.getGpa() + "\n");
	        writer.write("-------------------------\n");
	        
	        writer.close();
	
	        System.out.println("Student data successfully added.");
	        
	        StudentSort.idSort();
	        
	        System.out.println("Choose next option: 1 - Add new student." 
        			+ " 2 - Back to the main menu.");
        	input = scanner.nextInt();
        	scanner.nextLine();
        }while(input==1);
    }}
