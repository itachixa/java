package Methode.week5.level2;
import java.util.*;

public class EXO2 {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Not a natural number");
            return;
        }
        int sumRec = recursiveSum(n);
        int sumFormula = formulaSum(n);
        System.out.println("Recursive Sum: " + sumRec);
        System.out.println("Formula Sum: " + sumFormula);
    }
}