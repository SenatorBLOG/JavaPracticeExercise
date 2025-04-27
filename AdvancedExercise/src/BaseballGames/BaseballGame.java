package BaseballGames;

public class BaseballGame {
	private String team1Name;
	private String team2Name;
	private final int[][] scores;
	public static final int INNINGS = 9;
	
	public BaseballGame() {
        scores = new int[2][INNINGS];
        // Initialize scores to -1 (dummy value indicating no score yet)
        for (int team = 0; team < 2; team++) {
            for (int inning = 0; inning < INNINGS; inning++) {
                scores[team][inning] = -1;
            }
        }
    }


// Set team names
public void setTeam1Name(String name) {
    team1Name = name;
}

public void setTeam2Name(String name) {
    team2Name = name;
}

// Set score for a specific team and inning
public void setScore(int team, int inning, int score) {
    if (team >= 0 && team <= 1 && inning >= 0 && inning < INNINGS) {
        scores[team][inning] = score;
    }
}

// Getter methods
public String getTeam1Name() {
    return team1Name;
}

public String getTeam2Name() {
    return team2Name;
}

public int getScore(int team, int inning) {
    if (team >= 0 && team <= 1 && inning >= 0 && inning < INNINGS) {
        return scores[team][inning];
    }
    return -1;
}

// Calculate total score for a team
public int getTotalScore(int team) {
    int total = 0;
    for (int inning = 0; inning < INNINGS; inning++) {
        if (scores[team][inning] > 0) {
            total += scores[team][inning];
        }
    }
    return total;
}
}
