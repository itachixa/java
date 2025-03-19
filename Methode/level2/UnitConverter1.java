package Methode.level2;
import java.util.Scanner;

public class UnitConverter1 extends UnitConvertor {
    public static double   convertYardsToFeet( double  yards){
        return yards* 3;

    }
    public static double   FeetToYards( double  yards){
        return yards* 0.333333;

    }
    public static double   MeterToInches( double  yards){
        return yards* 39.3701;

    }
    public static double   IncheToMeter( double  yards){
        return yards*  0.0254;

    }
    public static  double IncheToCentimeter( double  yards){
        return yards*2.54;
    }
    public static void main(String[] args) {
        Scanner Input= new Scanner(System.in);
        double Distance;  

        System.out.println("pls enter the  Distance in yard");
        Distance=Input.nextDouble();
        System.out.println(" This Distance in feeet  is :"+convertYardsToFeet(Distance));

        System.out.println("pls enter the  Distance in Feet");
        Distance=Input.nextDouble();
        System.out.println(" This Distance in feeet  is :"+FeetToMeter(Distance));

        System.out.println("pls enter the  Distance in Meter");
        Distance=Input.nextDouble();
        System.out.println(" This Distance in feeet  is :"+MeterToFeet(Distance));

        Input.close();


        

    }
    
}
