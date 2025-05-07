import java.util.Scanner;

public class StringLengthFinder {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // When exception occurs, we return the count
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.next();

        int customLength = findLength(word);
        int builtinLength = word.length();

        System.out.println("Length without using length(): " + customLength);
        System.out.println("Length using built-in length(): " + builtinLength);
    }
}
