package Methode;
import java.util.Scanner;
public class Division {
    public static void  FindRemainderAndQuotient(int number, int divisor){
        System.out.println(" the reminder is: "+number%divisor);
        int quotiant=(number-(number%divisor))/divisor;
        System.out.println("the quotiant is :"+quotiant );
    }
public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    int number,divisor;
    System.out.print("please enter the number  for division: ");
    number=Input.nextInt();
    System.out.print("please enter  the divisor: ");
    divisor= Input.nextInt();

    FindRemainderAndQuotient(number, divisor);
    Input.close();

}
    
}
