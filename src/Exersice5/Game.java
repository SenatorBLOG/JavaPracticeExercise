package Exersice5;

public class Game {
	public Team team1;
	public Team team2;
	public String time;
	
	
	public Game(Team team1, Team team2, String time) {
		this.team1 = team1;
		this.team2 = team2;
		this.time = time;
	}


	@Override
	public String toString() {
		return "Game [team1=" + team1 + ", team2=" + team2 + ", time=" + time + "]";
	}
	
	
	
}
