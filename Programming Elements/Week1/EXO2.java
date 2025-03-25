import java.util.Scanner;
public class EXO2 {
public  static void  main(String[] args){
    Scanner input= new Scanner(System.in);
    double math_marks=0;
    double chemesrty_marks=0;
    double physic_marks=0;

    System.out.print("enter your maks in math :");
    math_marks= input.nextDouble();

    System.out.print("enter your maks in physic :");
    chemesrty_marks= input.nextDouble();
    
    System.out.print("enter your maks in chymestrie :");
    physic_marks= input.nextDouble();
    System.out.println("The average  of this note is : "+((math_marks+physic_marks+chemesrty_marks)/3));

    input.close();
}
    
}