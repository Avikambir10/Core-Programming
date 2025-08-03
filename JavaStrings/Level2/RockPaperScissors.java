package JavaStrings.Level2;

import java.util.Scanner;

public class RockPaperScissors {
    static String getComputerChoice() {
        return new String[]{"Rock", "Paper", "Scissors"}[(int)(Math.random() * 3)];
    }

    static int getResult(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
            (user.equals("Scissors") && comp.equals("Paper")) ||
            (user.equals("Paper") && comp.equals("Rock"))) return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0, games;
        System.out.print("Enter number of games: ");
        games = sc.nextInt();

        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String user = sc.next();
            String comp = getComputerChoice();
            int res = getResult(user, comp);
            if (res == 1) userWins++; else if (res == -1) compWins++;
            System.out.println("Computer chose: " + comp + " -> " + (res == 0 ? "Draw" : (res == 1 ? "You Win" : "Computer Wins")));
        }

        System.out.println("\nStats:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.printf("User Win %%: %.2f%%\n", (userWins * 100.0) / games);
        System.out.printf("Computer Win %%: %.2f%%\n", (compWins * 100.0) / games);
    }
}

