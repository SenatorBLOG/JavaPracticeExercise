package ch5ex1;

import java.util.Scanner;

public class TestBloodData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BloodData blood1 = getData();
		BloodData blood2 = new BloodData();
		displayData(blood1);
		displayData(blood2);
		
	}
	public static BloodData getData() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's your blood type?");
		String type = scanner.nextLine();
		
		System.out.println("What's your Rh (+/-)?");
		String rh = scanner.nextLine();
		
		return new BloodData(type,rh);
	}
	public static void displayData(BloodData blood) {
		System.out.println(blood);
	}

}
