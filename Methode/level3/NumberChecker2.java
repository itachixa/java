package Methode.level3;


import java.util.Scanner;
import java.math.*;

public class  NumberChecker2 extends NumberChecker {

public static int NbDigit(String Number){
    return Number.length();
}
public static  void Array(String Number,int t[]){
    for (int i = 0; i < Number.length(); i++) {
        t[i] = Character.getNumericValue(Number.charAt(i));
    }

}
public static int Sum(int  Number[],int length){
    int count=0;
    for (int i = 0; i < length; i++) {
        count+=Number[i];
        }
        return count;
    }
public static int SumScare(int Number[],int  length){
    int count=0;
    for (int i = 0; i < length; i++) {
        count+=Math.pow(Number[i],2);
        }
        return count;
    } 
public static  void harshad(int  Number[],int length,String Nb){
   if (Integer.parseInt(Nb)% Sum( Number,length)==0){
     System.out.println("this  number is Harsrad");
   }else{
    System.out.println("this  number is not  Harsrad");
   }

}

public static void  frequency(String Number,int t[][]){
int index = 0;
int[] frequency = new int[10]; 
        

for (int i = 0; i < Number.length(); i++) {
    char c = Number.charAt(i);
    if (Character.isDigit(c)) {// is digit verifie si un charctere est un entier ou pas
        int num = Character.getNumericValue(c);
        frequency[num]++;
    }
}

for (int x = 0; x < 10; x++) {
    if (frequency[x] >= 1) {
        t[index][0] = x;
        t[index][1] = frequency[x];
        index++;
    }
}

}


public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    String SNumber;
    
    System.out.println("pls enter the number");
    SNumber=Input.nextLine();
    int[][] frequence= new int[SNumber.length()][2];

    System.err.println(" the length of the number is : "+NbDigit(SNumber));

    int[] digits= new int[SNumber.length()];
    Array(SNumber, digits);
    System.out.println(" the sum of digit is :"+Sum(digits, NbDigit(SNumber))); 
    System.out.println("The sum of scare of digit is :"+SumScare(digits, NbDigit(SNumber))); 
    harshad(digits, NbDigit(SNumber), SNumber);  
    frequency(SNumber, frequence);
    
    for(int i =0; i<(frequence.length/2)+1;i++){
      for (int y=0; y<2;y++){
        System.out.print(frequence[i][y]+" ");
      }
      System.out.println();
    }
    




    
    

    

    
}
    
}

    

