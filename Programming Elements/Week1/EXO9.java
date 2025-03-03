import java.util.Scanner;

public class EXO9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student fee: ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double discountedFee = fee - discount;

        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", discount, discountedFee);

        input.close();
    }
}
