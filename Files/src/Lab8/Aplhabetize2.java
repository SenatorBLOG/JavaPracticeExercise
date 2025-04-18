package Lab8;

import java.util.Arrays;
import java.util.Scanner;

public class Aplhabetize2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st strings.");
		String st1 = sc.nextLine();
		System.out.println("Enter 2st strings.");
		String st2 = sc.nextLine();
		System.out.println("Enter 3st strings.");
		String st3 = sc.nextLine();
		
		if(st1.compareToIgnoreCase(st2)<0 && st2.compareToIgnoreCase(st3)<0) {
			System.out.println("In order " +st1 + " " +st2+ " " +st3);
		}else {
			String[]str = {st1,st2,st3};
			Arrays.sort(str,String.CASE_INSENSITIVE_ORDER);
			System.out.println("Not in order.Correct order: " +
			str[0] + " " + str[1] + " " + str[2]);
		}
		sc.close();
	}

}
