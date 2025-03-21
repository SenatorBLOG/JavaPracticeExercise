package StudentDatabase;
import java.util.*;

/**
 * Manages an array of students, allowing input of student data, sorting by ID or GPA,
 * and displaying the sorted results. Uses bubble sort for ordering students.
 */
public class StudentSort {
    /** Scanner object for reading user input from the console. */
    static Scanner scanner = new Scanner(System.in);
    
    /** Array to store up to 5 student records. */
    public static Student[] student = new Student[5];
    
    /** Counter tracking the number of students added to the array. */
    public static int count = 0;

    /**
     * Main method to run the program. Prompts the user to input data for 5 students,
     * then offers options to sort and display records by ID or GPA, or exit.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter Student id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            student[i] = createStudent(id);
            count++;
            System.out.println("Record was successfully added.");
        }

        int input2;
        do {
            System.out.println("To sort records by ID press - 1, by GPA press - 2, to exit press - 3.");
            input2 = scanner.nextInt();
            if (input2 == 1) {
                idSort();
            } else if (input2 == 2) {
                gpaSort(student);
            } else if (input2 == 3) {
                System.out.println("Exiting the program.");
            } else {
                System.out.println("Invalid input. Try again.");
            }
        } while (input2 != 3);
    }

    /**
     * Creates a Student object based on user input. Prompts for email, first name,
     * last name, address, degree program, and GPA. Validates email and degree program.
     *
     * @param id Unique identifier for the student.
     * @return A new Student object with the provided data.
     */
    public static Student createStudent(int id) {
        String email;
        while (true) {
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

        Person person = new Person(fName, lName, address);

        DegreeProgram program = null;
        while (true) {
            System.out.println("Choose the students program:");
            for (DegreeProgram p : DegreeProgram.values())
                System.out.println("-" + p);
            String input = scanner.nextLine().toUpperCase();

            for (DegreeProgram p : DegreeProgram.values()) {
                if (p.name().equals(input)) {
                    program = p;
                    break;
                }
            }
            if (program != null) {
                break;
            } else {
                System.out.println("Invalid program. Please try again.");
            }
        }

        System.out.println("Enter student GPA: ");
        int gpa = scanner.nextInt();
        scanner.nextLine();

        return new Student(id, email, person, program, gpa);
    }

    /**
     * Sorts the student array by ID in ascending order and displays the sorted records.
     * Uses bubble sort algorithm.
     */
    public static void idSort() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (student[j].getStudentId() > student[j + 1].getStudentId()) {
                    Student temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            Student s = student[i];
            System.out.println(
                "ID: " + s.getStudentId() + ", Name: " + s.getPerson().getfName() +
                " " + s.getPerson().getlName() + ", GPA: " + s.getGpa()
            );
        }
    }

    /**
     * Sorts the student array by GPA in ascending order and displays the sorted records.
     * Uses bubble sort algorithm.
     *
     * @param student The array of students to sort.
     */
    public static void gpaSort(Student[] student) {
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = 0; j < student.length - i - 1; j++) {
                if (student[j].getGpa() > student[j + 1].getGpa()) {
                    Student temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }
        for (Student s : student) {
            System.out.println(
                "ID: " + s.getStudentId() + ", Name: " + s.getPerson().getfName() +
                " " + s.getPerson().getlName() + ", GPA: " + s.getGpa()
            );
        }
    }
}