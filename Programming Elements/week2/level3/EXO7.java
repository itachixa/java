import java.util.Scanner;

public class EXO7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble();

        double interest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + interest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}
