package Methode.level2;
import java.util.Scanner;
public class SoutionEquat {

    public static void FindSolution(int a, int b , int  c){
        double delta = Math.pow(b,2)- 4*a*c;
        double root1,root2,root;
        if (delta>0){
            root1= (-b +Math.sqrt(delta) )/(2*a);
            root2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("the  two  solution  is   x1="+root1+"and x2="+root2);


        }else if (delta==0){
            root  = -b/(2*a);
            System.out.println("the unique solution is :"+root);
        }else{
            System.out.println("this  equation don't have solution ");
        }



    }
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int  a,b,c;
        System.out.println("pls enter the coefficient a ,b,c  for  a second degre equqtion");

        System.out.println("enter  a ");
        a= Input.nextInt();

        System.out.println("enter  b ");
        b= Input.nextInt();

        System.out.println("enter  c ");
        c= Input.nextInt();

        System.out.println(" your  equation   is "+a+"x2+"+b+"x+"+c);
        FindSolution(a, b, c);
         Input.close();


        
    }

    
}
