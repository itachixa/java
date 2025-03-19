package Methode.level2;

import java.util.Scanner;

public class Factor {
    public static int[] fact(int a) {
        int length = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                length++;
            }
        }

        int[] array = new int[length];
        int index = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                array[index] = i;
                index++;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        input.close();

        int[] array = fact(number);

        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
