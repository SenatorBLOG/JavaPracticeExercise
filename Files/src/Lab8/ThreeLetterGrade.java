package Lab8;

import java.util.Scanner;

public class ThreeLetterGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three words to make an acronym.");
		
		String acr = sc.nextLine();
		String[] acrArr = acr.trim().split("\\s+");
		
		StringBuilder acronym = new StringBuilder(); 
		
		
		for(int i = 0; i< Math.min(acrArr.length , 3);i++) {
			if(!acrArr[i].isEmpty()) {
				acronym.append(acrArr[i].charAt(0));
			}
			
		
		
		}
		if(acronym.length() == 0) {
			System.out.println("Acronym is empty");
		}else {
			System.out.println(acronym.toString().toUpperCase()); 
		}
		sc.close();
	}

}
