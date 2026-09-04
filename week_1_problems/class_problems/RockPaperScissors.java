package week_1_practise_problems;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random random = new Random();

        int n = 5;
        int wins = 0, losses = 0, draws = 0;

        System.out.println("Round | Player Move | Computer Move | Result");

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter move (Rock/Paper/Scissors): ");
            String playerMove = scanner.nextLine();
            String computerMove = moves[random.nextInt(3)];

            String result = playRound(playerMove, computerMove);
            System.out.println("Round " + i + " | " + playerMove + " | " + computerMove + " | " + result);

            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
        }

        double winPercentage = (wins / (double) n) * 100;
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%\n", wins, losses, draws, winPercentage);
        scanner.close();
    }

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) return "Draw";
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors")) ||
                (playerMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock")) ||
                (playerMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }
}
