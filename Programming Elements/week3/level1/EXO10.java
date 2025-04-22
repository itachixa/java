import java.util.Scanner;

public class EXO10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double value;

        do {
            System.out.print("Enter a number (0 to stop): ");
            value = input.nextDouble();
            total += value;
        } while (value != 0);

        System.out.println("Total sum is: " + total);
    }
}
