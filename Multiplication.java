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
   for(int i=0;i<0;i++){
      System.out.println("------------------------Muliplication for"+Number+"-------------------");
      System.out.println(Number+"*"+(i+1)+"="+Multi[i]);;
   }
}

}
