package Methode.Level1;import java.util.Scanner;

public class checksigne {
    public static int check(int n){
        if (n<0){
            return-1;
        }else if (n>0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner Input =new Scanner(System.in);
        int nomber;

        System.out.print("please enter a  number :"); 
        nomber=Input.nextInt();

        System.out.println(check(nomber));
       Input.close();
        

    }
    
}
