package Methode.Level1;
import java.util.Scanner;

public class   Money {
    public static double SimpleInterest(double P ,double R,double T){
        return P*R*T/100;
    } 
    
    public static void main(String[] args) {
        Scanner Input =new Scanner(System.in);
        double  Principal,Rate,Time;

       System.out.print("please enter the Princinpale:"); 
       Principal=Input.nextDouble();

       System.out.print("please enter the Rate:");
       Rate=Input.nextDouble();

       System.out.print("please enter the Time is seconde:"); 
       Time=Input.nextDouble();
       System.out.println(" The Simple Interest is "+SimpleInterest(Principal, Rate, Time) +"for Principal"+Principal+" , Rate of Interest"+Rate+"and Time is "+Time);
       Input.close();
    }

    
}
