import java.util.Scanner;

public class VotingEligibility {

    public static boolean[] checkVotingEligibility(int[] ages) {
        boolean[] eligibility = new boolean[ages.length];
        for (int i = 0; i < ages.length; i++) {
            eligibility[i] = ages[i] >= 18;
        }
        return eligibility;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        boolean[] eligibility = checkVotingEligibility(ages);

        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + "): " + (eligibility[i] ? "Can Vote" : "Cannot Vote"));
        }
    }
}
