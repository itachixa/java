import java.util.Scanner;

public class SubstringComparison {
    public static String substringUsingCharAt(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < text.length(); i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String substrCharAt = substringUsingCharAt(text, start, end);
        String substrBuiltIn = text.substring(start, end);

        System.out.println("Substring using charAt(): " + substrCharAt);
        System.out.println("Substring using substring(): " + substrBuiltIn);
        System.out.println("Are both substrings equal? " + compareUsingCharAt(substrCharAt, substrBuiltIn));
    }
}
