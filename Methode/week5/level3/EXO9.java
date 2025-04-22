
import java.util.*;

public class EXO9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        int n = sc.nextInt();

        System.out.println("Multiples de " + n + " inférieurs à 100 :");
        for (int i = n; i < 100; i += n) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
