import java.util.Scanner;

public class EXO6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();

        int eachGets = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("Each child gets " + eachGets + " chocolates and the number of remaining chocolates are " + remaining);
    }
}
