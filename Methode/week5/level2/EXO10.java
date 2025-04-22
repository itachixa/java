

import java.util.*;

public class EXO10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la limite supérieure : ");
        int limit = sc.nextInt();

        for (int i = 1; i <= limit; i++) {
            System.out.println(i + " est " + (i % 2 == 0 ? "pair" : "impair"));
        }
    }
}
