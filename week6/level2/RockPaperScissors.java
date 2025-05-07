import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random rand = new Random();
        return choices[rand.nextInt(3)];
    }

    public static String getWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Tie";
        }
        if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
            (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "You win";
        } else {
            return "Computer wins";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games to play: ");
        int games = scanner.nextInt();
        scanner.nextLine();

        int userWins = 0, computerWins = 0, ties = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            String userChoice = scanner.nextLine();
            String computerChoice = getComputerChoice();

            System.out.println("Computer chose: " + computerChoice);
            String result = getWinner(userChoice, computerChoice);

            if (result.equals("You win")) {
                userWins++;
            } else if (result.equals("Computer wins")) {
                computerWins++;
            } else {
                ties++;
            }

            System.out.println("Result of this game: " + result);
        }

        System.out.println("\nStatistics:");
        System.out.println("User wins: " + userWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("Ties: " + ties);
        System.out.println("User win percentage: " + (userWins * 100.0 / games) + "%");
        System.out.println("Computer win percentage: " + (computerWins * 100.0 / games) + "%");
    }
}
