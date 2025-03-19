package Methode.level3;
import java.util.Scanner;
public class NumberChecker4 extends NumberChecker3  {
public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    String SNumber;
    
    System.out.print("pls enter the number");
    SNumber=Input.nextLine();

    System.err.println(" the length of the number is : "+NbDigit(SNumber));

    int[] digits= new int[SNumber.length()];
    Array(SNumber, digits);
    ChekPalindrome(SNumber);
    duckVerifier(SNumber);
    }
}

