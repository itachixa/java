import java.util.Scanner;

public class EXO3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        int salary = scanner.nextInt();
        System.out.print("Enter bonus: ");
        int bonus = scanner.nextInt();
        int totalIncome = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
    }
}
