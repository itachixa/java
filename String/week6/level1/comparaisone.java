package String.week6.level1;

import java.util.Scanner;

public class Comparaisone {

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int error = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                error++;
            }
        }

        return error == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first word: ");
        String word1 = input.next();

        System.out.print("Please enter the second word: ");
        String word2 = input.next();

        boolean result = compareStrings(word1, word2);

        if (result) {
            System.out.println("The two words are equal.");
        } else {
            System.out.println("The two words are different.");
        }
    }
}
