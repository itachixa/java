import java.util.Scanner;

public class CharacterTypeChecker {

    public static String checkCharacterType(char c) {
        if (Character.isLetter(c)) {
            c = Character.toLowerCase(c);
            if ("aeiou".indexOf(c) != -1) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i) + " : " + checkCharacterType(input.charAt(i)));
        }
    }
}

