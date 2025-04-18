package Lab8;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your sentence.");
		//user enter: Lions! And Tigers? And  beers*&!>>>... Oh my#
		String st = sc.nextLine();
		String str = st.replaceAll("[^a-zA-Z\\s]", "");
		String[] strArr = str.trim().split("\\s+");
		int count =0;
		
		for(int i = 0; i < strArr.length; i++) {
			count++;
		}
		System.out.println("You have entered " + count + " words.");
	}

}
