
import java.util.*;

public class EXO11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ancienneté (en années) : ");
        int annee = sc.nextInt();
        int prime = 0;

        if (annee >= 5) prime = 100000;
        else if (annee >= 2) prime = 50000;
        else prime = 20000;

        System.out.println("Prime : " + prime + " FCFA");
    }
}
