package Lab8;

import java.util.Scanner;

public class Alphabetize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st strings.");
		String st1 = sc.nextLine();
		System.out.println("Enter 1st strings.");
		String st2 = sc.nextLine();
		System.out.println("Enter 1st strings.");
		String st3 = sc.nextLine();
		
		char ch1 = st1.charAt(0);
		char ch2 = st2.charAt(0);
		char ch3 = st3.charAt(0);
		
		if(ch1<ch2 && ch2<ch3) {
			System.out.println("String is in alphabetical order.");
		}else {
			System.out.println("String is not in alphabetical order.");
		}
	}

}
