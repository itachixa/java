package Week4.LEVEL1_pratique;

import java.util.Scanner;
public class mean {
    public static void main(String[] args) {
        double[] playersHeigth= new double[11];
        Scanner Input= new Scanner(System.in);
        double sum=0;
        for( int i=0;i<11;i++){
            System.out.print("enter the heigh of player "+(i+1)+" in cm :");
            playersHeigth[i]=Input.nextDouble();
            sum+=playersHeigth[i];
        }
        System.out.println("the mean of heigth  is :"+sum/11+"cm");
    }
    
}
