package Methode.Level1;
import java.util.Scanner;
public class sumofnatural {
    public static  int sum(int n){
        int add=0;
        for(int i =0;i<n+1;i++){
            add+=i;
        }
        return add;
    }
    public static void main(String[] args) {
        Scanner Input =new Scanner(System.in);
        int nomber;

        System.out.print("please enter a  number :"); 
        nomber=Input.nextInt();

        System.out.println(sum(nomber));
       Input.close();
        
    }
    
}
