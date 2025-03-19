package Methode.Level1;
import java.util.Scanner;

public class TrigonometryCalculator_584 {
    
    
    public double[] calculateTrigonometricFunctions_584(double angle) {
        double radians = Math.toRadians(angle); 
        return new double[]{
            Math.sin(radians), 
            Math.cos(radians), 
            Math.tan(radians)
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrigonometryCalculator_584 obj = new TrigonometryCalculator_584();

        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] trigValues = obj.calculateTrigonometricFunctions_584(angle);
        System.out.printf("sin(%.2f) = %.4f%n", angle, trigValues[0]);
        System.out.printf("cos(%.2f) = %.4f%n", angle, trigValues[1]);
        System.out.printf("tan(%.2f) = %.4f%n", angle, trigValues[2]);

        scanner.close();
    }
}
