package Exersice5;

import java.util.Scanner;

public class TestTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Team team1 = setTeamData();
		Team team2 = setTeamData();
		Team team3 = setTeamData();
		
		displayTeam(team1);
		displayTeam(team2);
		displayTeam(team3);
	}
	public static Team setTeamData() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a school name.");
		String school = scanner.nextLine();
		
		System.out.println("Enter a sport.");
		String sport = scanner.nextLine();
		
		System.out.println("Enter a team name.");
		String team = scanner.nextLine();
		
		return new Team(school,sport,team);	
	}
	public static void displayTeam(Team team) {
		System.out.println(team);
	}
}
