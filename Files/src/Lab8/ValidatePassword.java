package Lab8;

import java.util.Scanner;

public class ValidatePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in);
		boolean correct = true;
		
		
		while(correct) {
			boolean hasUpper = false;
			boolean hasLower = false;
			boolean hasDigit = false;
			int countUpper=0;
			int countLower=0;
			
			System.out.println("Enter a password what contains at least"
					+ " 2 Upper case letters,"
					+ " 3 lower case letters,"
					+ " 1 digit.");
			
			String pass = sc.nextLine();
			
			
			for(int i = 0; i < pass.length();i++) {
				char c = pass.charAt(i);
				
				if(Character.isUpperCase(c)) {
					countUpper++;
				}
				if(countUpper == 2) {
					hasUpper = true;
					
				}
				if(Character.isLowerCase(c)) {
					countLower++;
				}
				if(countLower == 3) {
					hasLower=true;
				}
				if(Character.isDigit(c)) {
					hasDigit = true;
				}
			}
			if(hasDigit && hasLower && hasUpper) {
				System.out.println("Password is correct");
				correct = false;
			}
			else {
				System.out.println("Password is incorrect");
			}
		}
		
	}

}
