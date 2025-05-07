import java.util.Scanner;

public class ShortestLongestWord {

    public static String[] splitText(String text) {
        return text.split(" ");
    }

    public static String[] findShortestLongestWord(String[] words) {
        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return new String[] {shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        String[] words = splitText(input);
        String[] result = findShortestLongestWord(words);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
