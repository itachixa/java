package Methode;
import java.util.Scanner;

public class childrenChocolat {

    public static void  FindRemainderAndQuotient(int number, int divisor){
        System.out.println("number of remaining chocolates: "+number%divisor);
        int quotiant=(number-(number%divisor))/divisor;
        System.out.println("the number of cholocat by child is  :"+quotiant );
    }
public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    int number,divisor;
    System.out.print("please enter the Children number: ");
    number=Input.nextInt();
    System.out.print("please enter   the  number of chocolat : ");
    divisor= Input.nextInt();

    FindRemainderAndQuotient(number, divisor);
    Input.close();

}
    
}

    

