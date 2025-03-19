package Methode.Level1;

import java.util.Scanner;

public class MinMax {
    public static void MaxandMin(int n1, int n2, int n3) {
        int Max = n1;
        int Min = n1;
        if (Max < n2) {
            Max = n2;
            if (Max < n3) {
                Max = n3;
            }

        } else if (Max < n3) {
            Max = n3;
        }
        System.out.println("the Max is " + Max);

        if (Min > n2) {
            Min = n2;
            if (Min > n3) {
                Min = n3;
            }

        } else if (Min > n3) {
            Min = n3;
        }

        System.out.println("the Min is " + Min);

    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int nomber1, nomber2, nomber3;

        System.out.print("please enter a  number 1 :");
        nomber1 = Input.nextInt();

        System.out.print("please enter a  number 2 :");
        nomber2 = Input.nextInt();

        System.out.print("please enter a  number 3 :");
        nomber3 = Input.nextInt();

        MaxandMin(nomber1, nomber2, nomber3);

        Input.close();

    }

}