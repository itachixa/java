import java.util.Scanner;

public class EXO6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int age1 = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        double height1 = sc.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int age2 = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        double height2 = sc.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int age3 = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        double height3 = sc.nextDouble();

        // Youngest
        if (age1 <= age2 && age1 <= age3)
            System.out.println("Amar is the youngest.");
        else if (age2 <= age1 && age2 <= age3)
            System.out.println("Akbar is the youngest.");
        else
            System.out.println("Anthony is the youngest.");

        // Tallest
        if (height1 >= height2 && height1 >= height3)
            System.out.println("Amar is the tallest.");
        else if (height2 >= height1 && height2 >= height3)
            System.out.println("Akbar is the tallest.");
        else
            System.out.println("Anthony is the tallest.");
    }
}
