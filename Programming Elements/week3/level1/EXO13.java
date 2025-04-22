import java.util.Scanner;

public class EXO13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n >= 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("Sum by for loop: " + sum);
            System.out.println("Sum by formula: " + formula);
        } else {
            System.out.println("Invalid input. Not a natural number.");
        }
    }
}
