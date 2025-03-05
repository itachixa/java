package Week4.LEVEL1_pratique;

import java.util.Scanner;
public class parity {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int[] Number = new int[5];
        for (int i=0; i<5;i++){
            System.out.print("pls enter the number number "+(i+1)+" :");
            Number[i]= Input.nextInt();
        }


        for (int i =0 ; i<5;i++){
            if (Number[i]>0){
                if (Number[i]%2==0){
                    System.out.println("the number "+Number[i]+" is positive and even");
                }else{
                    System.out.println("the number "+Number[i]+" is positive and odd");
                }
            }else if ( Number[i]<0){

                System.out.println("the number "+Number[i]+" is negative ");

            }else{
                System.out.println("the number "+Number[i]+" is zero");
            }
        }
        int Comparison;
        Comparison=Number[0]-Number[4];
        if (Comparison>0){
            System.out.println("the first element of array "+Number[0]+"  is bigger than "+Number[4]);
        }else if(Comparison<0){
            System.out.println("the first element of array "+Number[0]+"  is smaller than "+Number[4]);
        }else{
            System.out.println("the first element of array "+Number[0]+"  is bigger than "+Number[4]);
        }
    }
    
    
}
