package Methode.level2;
import java.util.Scanner;
public class UnitConvertor {
    


    public static  double KiloToMetter(double  a ){
        return a* 0.621371;
    }
    public static double MileToKilometre(double a){
        return a/1.60934;
    }
    public static double MeterToFeet(double a){
        return a * 1.60934;

    }
    public static double FeetToMeter( double a){
        return a *1.60934;
    }
    public static void main(String[] args) {
        double distance;
        Scanner input = new Scanner(System.in);
        System.out.print("plsease enter  the distance in kilo :");
        distance= input.nextInt();
        System.out.println(" \n this distance in  meter is :"+ KiloToMetter(distance)+ "in feet is :"+MeterToFeet(distance));
        input.close();



    }
    
}
