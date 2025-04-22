import java.util.Scanner;

public class LowercaseConverter {
    public static String toLowerCaseCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') result += (char)(c + 32);
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

        String customLower = toLowerCaseCustom(input);
        String builtInLower = input.toLowerCase();

        System.out.println("Custom: " + customLower);
        System.out.println("Built-in: " + builtInLower);
        System.out.println("Match: " + compareUsingCharAt(customLower, builtInLower));
    }
}
