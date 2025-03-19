package Methode.level2;
import java.util.Scanner;
public class rexursive {
    public static int sum(int n ){
        int sum= 0;
        for(int i=0; i<n+1;i++){
            sum+=i;
        }
       return sum;
    }
    public static int SUM(int n){
        return n*(n+1)/2 ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("please enter the number :");
        number= input.nextInt();

        System.out.println("the recursive sum is : "+ sum(number)+"  and cconfirmation methode :"+ SUM(number));

        

        input.close();
    }
    
}
