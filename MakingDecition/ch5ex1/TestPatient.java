package ch5ex1;

import java.util.Scanner;

public class TestPatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient patient1 = new Patient();
		Patient patient2 = getData();
		Patient patient3 = getData();
		
		displayPatient(patient1);
		displayPatient(patient2);
		displayPatient(patient3);
		
	}
	public static Patient getData() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter patient ID.");
		int id = scanner.nextInt();
		
		System.out.println("Enter patient age.");
		int age = scanner.nextInt();
		
		
		return new Patient(id,age, new BloodData());
	}
	public static void displayPatient(Patient patient) {
		System.out.println(patient);
	}

}
