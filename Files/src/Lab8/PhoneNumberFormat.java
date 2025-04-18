package Lab8;

import java.util.Scanner;

public class PhoneNumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter 10 digits phone number: ");
			
			String num = sc.nextLine();
			if(num.equals("999")) {
				exit = false;
				System.out.println("Exit the program.");
				break;
			}
			if(num.length() == 10) {
				System.out.println("Error: number must have 10 digits.");
				continue;
			}
			String[] numArr = num.trim().split("");
			
			StringBuilder sb = new StringBuilder();
			sb.append("(");
			sb.append(numArr[0]);
			sb.append(numArr[1]);
			sb.append(numArr[2]);
			sb.append(")");
			sb.append(numArr[3]);
			
			sb.append(numArr[4]);
			sb.append(numArr[5]);
			sb.append("-");
			sb.append(numArr[6]);
			sb.append(numArr[7]);
			sb.append(numArr[8]);
			sb.append(numArr[9]);
			
			
//			for(int i = 0; i < Math.min(numArr.length,3); i++) {
//				sb.append(numArr[i]);
//			}
				System.out.println(sb.toString()); 
			
			
		}
		sc.close();
		
		
		
	}

}
