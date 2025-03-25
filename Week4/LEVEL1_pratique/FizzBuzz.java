package Week4.LEVEL1_pratique;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int number;
        System.out.print("enter the number :");
        number = Input.nextInt();
        if (number > 0) {
            String[] FB = new String[number + 1];
            for (int i = 0; i < number + 1; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    FB[i] = "FizzBuzz";

                } else if (i % 3 == 0) {
                    FB[i] = "Buzz";
                } else if (i % 5 == 0) {
                    FB[i] = "Fizz";
                } else {
                    FB[i] = "" + i;
                }

            }
            System.out.println("\nthe list is :");
            for (int i = 0; i < number + 1; i++) {
                System.out.println(FB[i]);

            }

        }

        Input.close();
    }

}