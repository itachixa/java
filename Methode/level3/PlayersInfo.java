package Methode.level3;

import java.util.Scanner;

public class PlayersInfo {
    public static double AVG(int t[], int a) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += t[i];
        }
        return sum / a;
    }

    public static int Min(int t[], int a) {
        int min = t[0];
        for (int i = 0; i < a; i++) {
            if (min > t[i]) {
                min = t[i];
            }
        }
        return min;
    }

    public static int Max(int t[], int a) {
        int max = t[0];
        for (int i = 0; i < a; i++) {
            if (max < t[i]) {
                max = t[i];
            }
        }
        return max;
    }

    


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("pls  enter the nomber of playeurs:");
        number = input.nextInt();
        int Player[] = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("pls enter the heigth of  " + (i + 1) + (" playeur:"));
            Player[i] = input.nextInt();
        }
        System.out.println("the averge of heigth is : " + AVG(Player, number));
        System.out.println("the Minimum of heigth is : " + Min(Player, number));
        System.out.println("the Maximum of heigth is : " + Max(Player, number));
        input.close();

    }

}
