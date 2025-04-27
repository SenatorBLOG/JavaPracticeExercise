package BaseballGames;

public class LittleLeagueBaseballGame extends BaseballGame {
    public static final int INNINGS = 6; // Overrides parent's 9 innings
    
    public LittleLeagueBaseballGame() {
        super(); // Calls parent constructor
        // Reinitialize scores array for 6 innings
        for (int team = 0; team < 2; team++) {
            for (int inning = 0; inning < INNINGS; inning++) {
                setScore(team, inning, -1); // Reset to dummy values
            }
        }
    }
}