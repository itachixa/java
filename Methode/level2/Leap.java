package Methode.level2;
import java.util.Scanner;

import Week4.LEVEL1_pratique.parity;

public class Leap {
    public static  void Isleap(int a){
      if ( a >= 1582 && a>=0){
        System.out.println(" this year corresponding to a year in the Gregorian calendar. ");


        if ( a %4==0){
            System.out.println("this  year is  a leap year ");

        }else{
            System.out.println(" this  year is not leap year ");
        }

      }else{
        System.out.println(" this year not  corresponding to a year in the Gregorian calendar. ");
      }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  year;
        System.out.println(" please enter  the year ");
        year= input.nextInt();

        Isleap(year);
        input.close();


        
    }}
