package Methode.level2;
import java.util.Scanner;

public class UnitConverter extends UnitConverter1{
    public static double   convertFarhenheitToCelsius( double  a){
        return (a - 32) * 5 / 9;

    }
    public static double   CelsiusToFahrenheit( double  a){
        return  (a * 9 / 5) + 32;

    }
    public static double   PoundsTokilograms( double  a){
        return a* 0.453592;

    }
    public static double   kilogramsTopounds( double  a){
        return a*2.20462;

    }
    public static  double GallonsToliters( double  a){
        return a*3.78541; 
    }
    public static  double LitersToGallons (double  a){
        return a* 0.264172;
    }
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        double Unit;
        System.out.println(" please enter the number to concerte Farhenheit To Celsius ");
        Unit = Input.nextDouble();
        

        Input.close();

    }

    
}