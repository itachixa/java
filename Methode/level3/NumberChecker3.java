package Methode.level3;


import java.util.Scanner;
import java.math.*;

public class  NumberChecker3 extends NumberChecker2 {

public static int NbDigit(String Number){
    return Number.length();
}
public static  void Array(String Number,int t[]){
    for (int i = 0; i < Number.length(); i++) {
        t[i] = Character.getNumericValue(Number.charAt(i));
    }

} 
public static void reverse(int t[],int a){
    int[] tab= new int[a];
    for (int i =0; i<a; i++){
        tab[i]=t[(a-1)-i];
    }
    for (int i =0; i<a; i++){
        t[i]=tab[i];
    }
    

}
public static Boolean comparaison(int a[],int b[],int length){
    int  diference=0;
    for (int i=0; i<length;i++){
        if (a[i]!=b[i]){
        diference+=1;

        }  

    }
if (diference>0){
    return false;

}else{
    return true;
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
public static  void ChekPalindrome(String Nb){
    int[] norm= new int[NbDigit(Nb)];
    Array(Nb, norm);
    int[] rever= new int[NbDigit(Nb)];
    for (int i =0; i<NbDigit(Nb); i++){
        rever[i]=norm[(NbDigit(Nb)-1)-i];
    }
   
    if (comparaison(norm, rever, NbDigit(Nb))){
        System.out.println("this is a palindrome");
        
    }else{
        System.out.println("this not a palindrome");
    }




}


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
    


