
package Methode;

import java.util.Scanner;
import java.math.*;

public class  NumberChecker {

public static int NbDigit(String Number){
    return Number.length();
}
public static  void Array(String Number,int t[]){
    for (int i = 0; i < Number.length(); i++) {
        t[i] = Character.getNumericValue(Number.charAt(i));
    }

}
public static void duckVerifier(String Number){
    int count=0;
    for (int i = 0; i < Number.length(); i++) {
        if  (Character.getNumericValue(Number.charAt(i))==0){
          count+=1;
        }
    }
    if (count>0){
       System.out.print("this number is dunk number");
    }else{
       System.out.print("this number is not dunk number");

    }
}

public static void ArmstrongCheks(int t[], int a,String nbString){
     double  total=0;
   
     for(int  i=0;i<a;i++ ){
        total=Math.pow(t[i],3);
     }
     String verifie= ""+total;
     if (verifie==nbString){
        System.out.println("this's number is Armonstrong");
     }else{
        System.err.println("this number is not Armonstrong");
     }
}
public static void TwoMax(int  t[], int length){
    int Max1=0;
    int Max2=0;
    int  index=0;
    int  Max = t[0];
    for (int i = 0; i < 2; i++) {
        for (int x = 0; x <length; x++) {
          
                if (Max<t[x]) {
                    Max = t[x];
                    index=x;
                }   
        }
        if (i == 0) {
            Max1 = Max;
            t[index] = 0;
            Max=0;
        }
        if (i == 1) {
            Max2 = Max;
        }
    }
    System.out.println("lThe  maximal number is  :" + Max1);
    System.out.println("The second number max is  :" + Max2);
}
public static void TwoMin(int  t[], int length){
    int Min1=0;
    int Min2=0;
    int  index=0;
    int  Min = t[0];
    for (int i = 0; i < 2; i++) {
        for (int x = 0; x <length; x++) {
                if (Min>t[x]) {
                    Min = t[x];
                    index=x;
                }   
        }
        if (i == 0) {
            Min1 = Min;
            t[index] = 0;
            Min=1000;
        }
        if (i == 1) {
            Min2 = Min;
        }
    }
    System.out.println("the  number minimal is  :" + Min1);
    System.out.println("The second number minimal is  :" + Min2);
}

public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    String SNumber;
    System.out.println("pls enter the number");
    SNumber=Input.nextLine();

    System.err.println(" the length of the number is : "+NbDigit(SNumber));

    int[] digits= new int[SNumber.length()];
    Array(SNumber, digits);
    duckVerifier(SNumber);
    ArmstrongCheks(digits,NbDigit(SNumber),SNumber);
    TwoMax(digits, NbDigit(SNumber));
    TwoMin(digits, NbDigit(SNumber));





    
    

    

    
}
    
}
