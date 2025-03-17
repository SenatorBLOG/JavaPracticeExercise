package StudentDatabase;
import java.util.*;
public class StudentSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] student = new Student[2];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i< student.length;i++) {
			System.out.println("Enter Student id: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			
			String email;
			while(true) {
				System.out.println("Enter Student email with (@domain.com): ");
                email = scanner.nextLine();
                if (Student.isValidEmail(email)) {
                    break;
                } else {
                    System.out.println("Email is invalid. Try again.");
                }
			}
			
			System.out.println("Enter First name: ");
			String fName = scanner.nextLine();
			
			System.out.println("Enter Last name: ");
			String lName = scanner.nextLine();
		
			System.out.println("Enter an address: ");
			String address = scanner.nextLine();
			
			Person person = new Person(lName,fName,address);
			
			student[i] = new Student(id,email,person, null,0);
			
			
			while(true) {
				System.out.println("Choose the students program.");
				for(DegreeProgram p : DegreeProgram.values())
					System.out.println("-" + p);
				String input = scanner.nextLine().toUpperCase();
				
				boolean validProgram = false;

			    for (DegreeProgram p : DegreeProgram.values()) {
			        if (p.name().equals(input)) {  // Compare the input with enum names
			            student[i].setProgram(p);  // Set the program using the enum
			            validProgram = true;
			            break;
			        }
			    }

			    if (validProgram) {
			        break; 
			    } else {
			        System.out.println("Invalid program. Please try again.");
			    }	
				
			}
			
			System.out.println("Enter student GPA: ");
		    int gpa = scanner.nextInt();
		    scanner.nextLine();
		    student[i].setGpa(gpa);

			
			System.out.println("Record was successfully added.");
		}
		
		int input2;
		do {
		    System.out.println("To sort records by ID press - 1, by GPA press - 2, to exit press - 3.");
		    input2 = scanner.nextInt();
		    
		    if (input2 == 1) {
		        idSort(student);
		    } else if (input2 == 2) {
		        gpaSort(student);
		    } else if (input2 == 3) {
		        System.out.println("Exiting the program.");
		    } else {
		        System.out.println("Invalid input. Try again.");
		    }
		} while (input2 != 3); 
	}

	public static void idSort(Student[] student) {
		
		for(int i = 0; i < student.length -1 ;i++) {
			for( int j = 0; j < student.length - i -1; j++) {
				if(student[j].getStudentId()> student[j+1].getStudentId()) {
					Student temp = student[j];
					student[j] = student[j+1];
					student[j+1] = temp;
					
				}
			}
		}
		for (Student s : student) {
	        System.out.println(
	            "ID: " + s.getStudentId() 
	            + ", Name: " + s.getPerson().getfName() 
	            + " " + s.getPerson().getlName()
	            + ", GPA: " + s.getGpa()
	        );
	    }
	}
	public static void gpaSort(Student[] student) {
			
			for(int i = 0; i < student.length -1 ;i++) {
				for( int j = 0; j < student.length - i -1; j++) {
					if(student[j].getGpa()> student[j+1].getGpa()) {
						Student temp = student[j];
						student[j] = student[j+1];
						student[j+1] = temp;
						
					}
				}
			}
			for (Student s : student) {
		        System.out.println(
		            "ID: " + s.getStudentId() 
		            + ", Name: " + s.getPerson().getfName() 
		            + " " + s.getPerson().getlName()
		            + ", GPA: " + s.getGpa()
		        );
		    }
		}
	
}
