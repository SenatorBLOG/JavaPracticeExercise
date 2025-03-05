package ch5ex7_jobApplicant;
import java.util.Scanner;

public class TestJobApplicants {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobApplicant app1 = getData();
		//JobApplicant app2 = getData();
		//JobApplicant app3 = getData();
		
		boolean aplic1 = isHired(app1);
		//isHired(app2);
		//isHired(app3);
		
		System.out.println("The " + aplic1 + "what ");
		
	}
	public static JobApplicant getData() {
		
		System.out.println("Enter a user name.");
		String name = scanner.nextLine();
		
		System.out.println("Enter a user phone number.");
		String phone = scanner.nextLine();
		
		System.out.println("Is the user can procces words? (Enter 1 for YES and 0 for NO)");
		int word = scanner.nextInt();
		if(word != 1 && word !=0) {
			System.out.println("Incorrect input. please input 1 or 0.");
		}
		boolean isWord = (word != 0);
		
		System.out.println("Is the user can work with sheets? (Enter 1 for YES and 0 for NO)");
		int sheets = scanner.nextInt();
		if(sheets != 1 && sheets !=0) {
			System.out.println("Incorrect input. please input 1 or 0.");
		}
		boolean isSheets = (sheets != 0);
		
		System.out.println("Is the user can buid database? (Enter 1 for YES and 0 for NO)");
		int database = scanner.nextInt();
		if(database != 1 && database !=0) {
			System.out.println("Incorrect input. please input 1 or 0.");
		}
		boolean isDatabase = (database != 0);
		
		System.out.println("Is the user can create graphs? (Enter 1 for YES and 0 for NO)");
		int graph = scanner.nextInt();
		if(graph != 1 && graph !=0) {
			System.out.println("Incorrect input. please input 1 or 0.");
		}
		boolean isGraph = (graph != 0);
		
		return new JobApplicant(name,phone,isWord,isSheets,isDatabase,isGraph);
		
	}
	public static boolean isHired(JobApplicant app) {
		int count = 0;
		boolean isFine = true;
		if(app.isWordProc() != true) {
			System.out.println("You have to be word proccing.");
			count++;
		}
		if (app.isSheets() != true) {
			System.out.println("You have to be working withh sheets.");
			count++;
		}
		if (app.isDatabase() != true) {
			System.out.println("You have to be working withh sheets.");
			count++;
		}
		if (app.isGraphics() != true) {
			System.out.println("You have to be working withh sheets.");
			count++;
		}
		if (count>=3) {
			System.out.println("You pass the exam.");
			return isFine;
		}else {
		return false;}
	}
}
