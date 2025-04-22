import java.util.Scanner;

public class EXO15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n >= 0) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        } else {
            System.out.println("Please enter a positive number.");
        }
    }
}
