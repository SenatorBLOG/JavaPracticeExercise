package Exersice5;

import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game1 = getGame();
		displayData(game1);
		
		Game game2 = getGame();
		displayData(game2);
		
	}
	public static Game getGame() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first team details.");
		Team team1 = TestTeam.setTeamData();

		
		System.out.println("Enter second team details.");
		Team team2 = TestTeam.setTeamData();

		
		System.out.println("What time is the game?");
		String time = scanner.nextLine();
		
		
		return new Game(team1, team2, time);
	}
	public static void displayData(Game game) {
		System.out.println(game);
	}
	
}
