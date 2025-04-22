
import java.util.*;

public class EXO7 {
    public static List<Integer> getFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) factors.add(i);
        }
        factors.add(n);
        return factors;
    }

    public static int getGreatestFactor(int n) {
        for (int i = n / 2; i >= 1; i--) {
            if (n % i == 0) return i;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        int n = sc.nextInt();
        System.out.println("Facteurs : " + getFactors(n));
        System.out.println("Plus grand facteur (hors lui-même) : " + getGreatestFactor(n));
    }
}
