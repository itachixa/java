
import java.util.*;

public class EXO8 {
    public static int puissance(int base, int exposant) {
        int resultat = 1;
        for (int i = 0; i < exposant; i++) {
            resultat *= base;
        }
        return resultat;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base : ");
        int base = sc.nextInt();
        System.out.print("Exposant : ");
        int exp = sc.nextInt();
        System.out.println("Résultat : " + puissance(base, exp));
    }
}
