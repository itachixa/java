package Week4.LEVEL1_pratique;

import java.util.Scanner;
public class Multipli {
 public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    int Number ;
    int[] Multi =new int[4];
    System.out.print("pls enter the number for multiplication :");
    Number=Input.nextInt();
    for(int i=0;i<4;i++){
       Multi[i]= Number*(i+6);
    }
    System.out.println("------------------------Muliplication for "+Number+" -------------------");
    for(int i=0;i<4;i++){
      
       System.out.println(Number+"*"+(i+6)+"="+Multi[i]);
    }
 }
}
