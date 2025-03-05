package Week4.LEVEL1_pratique;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        int  NumberOFVoters=10;
        Scanner Input = new Scanner(System.in);

        int[] Age = new int[NumberOFVoters];
        for (int i = 0; i < NumberOFVoters; i++) {
            System.out.print("pls enter  the age of " + (i + 1) + " Student:");
            Age[i] = Input.nextInt();
        }System.out.println("\n");
        

        for (int i = 0; i < NumberOFVoters; i++) {
            if (Age[i] >= 18) {
                System.out.println("the students  number " + (i + 1) + " who has   "+Age[i]+" old year :can vote.  ");
            } else if(Age[i]>0){
                System.out.println("the students  number " + (i + 1) + " who has  "+Age[i]+" old year: can not vote .");
            }
            else{
                System.out.println("the students  number " + (i + 1) +":the invalide age");
            }
        }

    }

}
