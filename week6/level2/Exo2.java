import java.util.Scanner;

public class WordSplitter {

    // Method to count words and return an array of words
    public static String[] customSplit(String text) {
        int count = 1; // at least one word
        int len = 0;

        // Find length manually
        try {
            while (true) {
                text.charAt(len);
                if (text.charAt(len) == ' ') count++;
                len++;
            }
        } catch (Exception e) {}

        int[] spaceIndexes = new int[count - 1];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        String[] words = new String[count];
        int start = 0;
        for (int i = 0; i < count; i++) {
            int end = (i == count - 1) ? len : spaceIndexes[i];
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = end + 1;
        }

        return words;
    }

    // Compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] customWords = customSplit(sentence);
        String[] builtinWords = sentence.split(" ");

        System.out.println("Words (custom split):");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("Comparison with built-in split(): " +
            compareArrays(customWords, builtinWords));
    }
}
