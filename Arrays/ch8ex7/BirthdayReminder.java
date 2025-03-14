package ch8ex7;

import java.util.Scanner;


public class BirthdayReminder {
	static Scanner scanner = new Scanner(System.in);
	static int num = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Friend[] friend = new Friend[num];
		
			
			for(Friend f : friend) {
				f.display();
			}
			while (true) {
	            System.out.println("Enter a name of a friend. (Enter \"ZZZ\" to exit.)");
	            String name = scanner.nextLine();

	            if (name.equals("ZZZ")) {
	                System.out.println("You have exited the loop.");
	                break;
	            }

	            boolean isFound = false;
	            for (Friend f : friend) {
	                if (f != null && f.getName().equals(name)) {
	                    System.out.println(f.getName() + " has birthday at " + f.getBday());
	                    isFound = true;
	                    break; // Выход из цикла, если имя найдено
	                }
	            }

	            if (!isFound) {
	                System.out.println("The name hasn't been found. Please try again.");
	            }
	        }
				
			
		}		
	public static Friend[] addName(Friend[] friend) {
		int count=0;
		for(int i = 0;i<=num;i++) {
			if(i==num ) {
				System.out.println("You entered maximum names.");
				break;}
			
			System.out.println("Enter a name of a " + (i + 1) + " friend.");
			String name = scanner.nextLine();
			
			if(name.equals("ZZZ")) {
				System.out.println("You finished entering names.");
				break;
			}
			System.out.println("Enter a birth date of a " + (i + 1) + "  friend.");
			int bday = scanner.nextInt();
			scanner.nextLine();
			count++;
			
			friend[i] = new Friend(name,bday);
		}
		System.out.println("You entered " + count + " names.");
		return friend;
	}
	
	
}


