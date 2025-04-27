package BaseballGames;

import java.util.Scanner;

public class DemoBaseballGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BaseballGame game = null;

        // Select game type
        System.out.println("Select game type:");
        System.out.println("1 - Standard (9 innings)");
        System.out.println("2 - High School (7 innings)");
        System.out.println("3 - Little League (6 innings)");
        System.out.print("Enter choice (1-3): ");
        int choice = input.nextInt();
        input.nextLine(); // Consume newline

        // Create appropriate game type
        switch (choice) {
            case 1: game = new BaseballGame(); break;
            case 2: game = new HighSchoolBaseballGame(); break;
            case 3: game = new LittleLeagueBaseballGame(); break;
            default: 
                System.out.println("Invalid choice. Using standard game.");
                game = new BaseballGame();
        }

        // Get team names
        System.out.print("Enter first team name: ");
        game.setTeam1Name(input.nextLine());
        System.out.print("Enter second team name: ");
        game.setTeam2Name(input.nextLine());

        int innings = (choice == 2) ? 7 : (choice == 3) ? 6 : 9;

        // Enter scores for each inning
        for (int inning = 0; inning < innings; inning++) {
            System.out.println("\nInning " + (inning + 1));
            
            System.out.print("Enter runs for " + game.getTeam1Name() + ": ");
            int team1Score = input.nextInt();
            game.setScore(0, inning, team1Score);
            
            System.out.print("Enter runs for " + game.getTeam2Name() + ": ");
            int team2Score = input.nextInt();
            game.setScore(1, inning, team2Score);

            // Display running totals
            System.out.println("\nCurrent Scores:");
            System.out.println(game.getTeam1Name() + ": " + game.getTotalScore(0));
            System.out.println(game.getTeam2Name() + ": " + game.getTotalScore(1));
        }

        // Determine and display winner
        int team1Total = game.getTotalScore(0);
        int team2Total = game.getTotalScore(1);
        
        System.out.println("\nFinal Score:");
        System.out.println(game.getTeam1Name() + ": " + team1Total);
        System.out.println(game.getTeam2Name() + ": " + team2Total);

        if (team1Total > team2Total) {
            System.out.println(game.getTeam1Name() + " win!");
        } else if (team2Total > team1Total) {
            System.out.println(game.getTeam2Name() + " win!");
        } else {
            System.out.println("The game ended in a tie!");
        }

        input.close();
    }
}