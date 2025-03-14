package Methode;
import java.util.Scanner;

public class WindChillCalculator_584 {

    public double calculateWindChill_584(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WindChillCalculator_584 obj = new WindChillCalculator_584();

        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter wind speed in mph: ");
        double windSpeed = scanner.nextDouble();

        double windChill = obj.calculateWindChill_584(temperature, windSpeed);
        System.out.printf("Wind Chill Temperature: %.2f°F%n", windChill);

        scanner.close();
    }
}
