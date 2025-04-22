import java.util.Scanner;

public class EXO2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();
        System.out.print("Enter third number: ");
        int n3 = input.nextInt();
        boolean isSmallest = n1 < n2 && n1 < n3;
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
