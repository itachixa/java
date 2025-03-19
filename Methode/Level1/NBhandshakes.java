package Methode.Level1;
import java.util.Scanner;

public class NBhandshakes {
public static void main(String[] args) {
    Scanner Input =new Scanner(System.in);
    int numberOfStudents,Nbhandshakes;


    System.out.print("please enter the  number of student:"); 
    numberOfStudents=Input.nextInt();
    Nbhandshakes=(numberOfStudents* (numberOfStudents- 1)) / 2;

     System.out.println("the number of handshakes is : "+Nbhandshakes);
     Input.close();
   
}    
}


