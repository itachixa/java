package Week4.LEVEL1_pratique;

import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int[] number= new int[10];
        Scanner Input = new Scanner(System.in);
        int security,sum,save;
        save=0;
        sum=0;
        


        for (int i=0; i<10;i++){
            System.out.print("enter the number : ");
            security=Input.nextInt();
            if( (security==0) || (security<0)){
               break;
            }else{
                number[i]=security;
                save+=1;
            }

        }
        System.out.println("they number in array are :\n");
        for(int i=0;i<save;i++){
          System.out.println("the number "+(i+1)+" is :"+number[i]);
          sum+=number[i];
        }
        System.out.println("the sum of numbers in array is :"+sum);
    }
    
}
