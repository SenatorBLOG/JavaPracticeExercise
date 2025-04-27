package BaseballGames;

public class HighSchoolBaseballGame extends BaseballGame {
    public static final int INNINGS = 7; // Overrides parent's 9 innings
    
    public HighSchoolBaseballGame() {
        super(); // Calls parent constructor
        // Reinitialize scores array for 7 innings
        for (int team = 0; team < 2; team++) {
            for (int inning = 0; inning < INNINGS; inning++) {
                setScore(team, inning, -1); // Reset to dummy values
            }
        }
    }
}
