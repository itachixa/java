package Methode.level2;
import java.util.Scanner;


public class StudentVoteChecker {
    public static boolean CanVote(int a){
        if ( a>0 && a>=18){
            return true;
        }else{
            return false;
        }


    }
    public static void main(String[] args) {
        Scanner Input  = new Scanner(System.in);
        int [] Student = new int [10];
        for( int i=0;i<10;i++){
            System.out.println("please enter the age of student of "+(i+1)+" :");
            Student[i]=Input.nextInt();
          
        }
        for( int i=0;i<10;i++){
           if(CanVote(Student[i])){
            System.out.println("this student can vote");
           }
           else{
            System.out.println("This student can not vote");
           }
          
        }


            Input.close();

    }

    
}