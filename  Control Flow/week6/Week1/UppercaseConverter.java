import java.util.Scanner;

public class UppercaseConverter {
    public static String toUpperCaseCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') result += (char)(c - 32);
            else result += c;
        }
        return result;
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
        String input = sc.nextLine();

        String customUpper = toUpperCaseCustom(input);
        String builtInUpper = input.toUpperCase();

        System.out.println("Custom: " + customUpper);
        System.out.println("Built-in: " + builtInUpper);
        System.out.println("Match: " + compareUsingCharAt(customUpper, builtInUpper));
    }
}