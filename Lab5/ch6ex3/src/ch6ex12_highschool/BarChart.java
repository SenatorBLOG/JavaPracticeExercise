package ch6ex12_highschool;
import java.util.Scanner;
public class BarChart {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Players player1 = new Players("Ali",getPlayer("Ali"));
		Players player2 = new Players("Bob",getPlayer("Bob"));
		Players player3 = new Players("Cai",getPlayer("Cai"));
		Players player4 = new Players("Dan",getPlayer("Dan"));
		Players player5 = new Players("Eli",getPlayer("Eli"));
		
		System.out.println("\nPoints for Game\n");
		printScore(player1);
		printScore(player2);
		printScore(player3);
		printScore(player4);
		printScore(player5);
		
		
		
		
	}
	public static int getPlayer(String getname) {
		System.out.print("Enter points earned by " + getname +" >> ");
		int score = scanner.nextInt();
		return score;
	}
	public static void printScore(Players player) {
		System.out.print(player.getName() + "  ");
		for (int i = 0; i<player.getScores();i++) {
			System.out.print("*");
		}
		System.out.println("\n");
		
		
	}

}
