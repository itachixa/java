package Methode.Level1;
    import java.util.Scanner;

public class triangularPark {
        public static double perimeter(double a,double b,double c){
            return a+b+c;
        }

        public static double  NBround(double a,double b,double c,double D ){
            return D/perimeter(a, b, c);
        } 
        
        public static void main(String[] args) {
            Scanner Input =new Scanner(System.in);
            double  side1,side2,side3,Distance;
    
           System.out.print("please enter the mesure of side1:"); 
           side1=Input.nextDouble();
    
           System.out.print("please enter the  mesure of side2:");
           side2=Input.nextDouble();
    
           System.out.print("please enter the  mesure of side3:"); 
           side3=Input.nextDouble();

           System.out.print("please enter the Distance you want run:"); 
           Distance=Input.nextDouble();

           System.out.println(" The number of round is  "+NBround(side1, side2, side3, Distance));
           Input.close();
        }
    
        
    }
    
