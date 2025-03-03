package ch8ex6;
import java.util.Scanner;

public class InputGrades {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] student = new Student[2];
		
		for(int i =0;i<2;i++)
		{
			System.out.println("Enter student ID for " + (i+1)  + " student.");
			int studentId = scanner.nextInt();
			scanner.nextLine();
			student[i] = new Student(studentId);
			
			for( int  j =0;j<2;j++) {
				System.out.println("Enter course ID for " + (j+1) + " course.(for example, CIS 210),");
				String courseId = scanner.nextLine();
				
				System.out.println("Enter credit hours for " + (j+1) + " course.");
				int creditHours = scanner.nextInt();
				scanner.nextLine();
				
				String letterGrade = "";
				while (true) {
					System.out.println("Enter a letter grade (A, B, C, D, or F) for " + (j+1) + " course.");
					letterGrade = scanner.nextLine().toUpperCase();
					if (letterGrade.equals("A") || letterGrade.equals("B") || letterGrade.equals("C") || 
							letterGrade.equals("D") || letterGrade.equals("E")) {
						System.out.println("The grade been saved.");
						break;
						
					}else {
						System.out.println("Invalid grade. Please enter a letter grade (A, B, C, D, or F).");
					}
				}
				CollegeCourse course = new CollegeCourse(courseId,creditHours,letterGrade);
				student[i].setCollegeCourse(course, j);
			}
		}
		System.out.println("");
		
		for(int i = 0;i<student.length;i++) {
			System.out.println("Student ID " + student[i].getId());
			for(int j = 0; j < 2;j++) {
	
				CollegeCourse courses = student[i].getCollegeCourse(j);
				System.out.println("Course ID " + courses.getCourseId()+
						" credit hours " + courses.getCreditHours()+
						"LetterGrades " + courses.getLetterGrade());
				
			}
		}
		
	}
	

}
