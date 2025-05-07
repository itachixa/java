import java.util.Scanner;

public class TrimSpaces {

    public static String trimSpaces(String text) {
        int start = 0, end = text.length() - 1;

        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return text.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text with leading and trailing spaces: ");
        String input = scanner.nextLine();

        String trimmed = trimSpaces(input);
        String builtInTrimmed = input.trim();

        System.out.println("Text after trimming spaces (custom method): " + trimmed);
        System.out.println("Text after trimming spaces (built-in trim()): " + builtInTrimmed);
        System.out.println("Do both methods give the same result? " + trimmed.equals(builtInTrimmed));
    }
}
