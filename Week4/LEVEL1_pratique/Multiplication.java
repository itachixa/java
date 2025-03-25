package Week4.LEVEL1_pratique;

import java.util.Scanner;

public class Multiplication {
public static void main(String[] args) {
   Scanner Input = new Scanner(System.in);
   int Number ;
   int[] Multi =new int[10];
   System.out.print("pls enter the number for multiplication :");
   Number=Input.nextInt();
   for(int i=0;i<10;i++){
      Multi[i]= Number*(i+1);
   }
   System.out.println("------------------------Muliplication for "+Number+" -------------------");
   for(int i=0;i<10;i++){
     
      System.out.println(Number+"*"+(i+1)+"="+Multi[i]);
   }
   Input.close();
}

}
