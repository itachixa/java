package Methode.Level1;
import java.util.Scanner;
public class handshakes {
    public static  int Nbhandshakes(int n){
        return(n * (n - 1)) / 2;
    }
public static void main(String[] args) {
    Scanner Input =new Scanner(System.in);
    int NbStutend;


    System.out.print("please enter the  number of student:"); 
    NbStutend=Input.nextInt();
     System.out.println("the number of handshakes is : "+Nbhandshakes(NbStutend));
     Input.close();
   
}    
}
