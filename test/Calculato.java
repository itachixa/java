package test;
import java.util.Scanner;
public class Calculato {
 public static int add( int a ,int b){
  return a+b;
 }
 public static int substraction(int a,int b){
    return a-b;
 }
public static int mulitiply( int a ,int b){
    return a*b;
}
public static double divide(int a, int b){
 if (b==0){
    return 0;
 }else {
    return a/b;
 }

}
public static void main(String[] args) {
    int a,b,choice;
    Scanner Input = new Scanner(System.in);
    System.err.print("enter fisrst number:");
    a=Input.nextInt();
    System.err.print("enter second number:");
    b=Input.nextInt();
    System.out.print("please choice operation :\n1-Add \n 2-Multiply\n3-divide\n4-Substraction\n choice:");
    choice=Input.nextInt();


    switch (choice) {
        case 1:
        System.out.println("The addition is :"+add(a, b));     
            break;
        case 2:
        System.out.println("The addition is :"+mulitiply(a, b));  
            break;
        case 3:
        System.out.println("The addition is :"+divide(a, b));  
             break;
        case 4:
        System.out.println("The addition is :"+substraction(a, b));  
            break;
        default:
        System.out.println("your option is no valide");  
            break;
    }
    Input.close();
}
    
} 
    
