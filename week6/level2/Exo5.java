import java.util.Scanner;

public class VowelConsonantCounter {

    public static String countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return "Vowels: " + vowels + ", Consonants: " + consonants;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        String result = countVowelsConsonants(input);
        System.out.println(result);
    }
}
