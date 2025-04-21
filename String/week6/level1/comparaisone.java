package String.week6.level1;

import java.util.Scanner;

public class comparaisone {
    public static boolean(String a,String b){
        int error;
        error =0;

        for (int i =0;i<a.length();i++){
            if(a.charAt(i)!= b.charAt(i)){
                error+=1;
            }
        }
        if (error >0){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        String word1,word2;
            Scanner Input = new Scanner(System.in);
            System.out.println("please  enter the first word: ");
            word1=Input.next();
            
            System.out.println("please enter the second word: ");      
            word2 = Input.next();   
    }

    
}