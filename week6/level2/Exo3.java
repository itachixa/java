import java.util.Scanner;

public class WordsWithLengths {

    // Custom method to split words
    public static String[] customSplit(String text) {
        int count = 1;
        int len = 0;
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

    // Custom method to get length of string
    public static int getLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    // Convert word array to 2D array with lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] words = customSplit(sentence);
        String[][] result = wordsWithLengths(words);

        System.out.println("Word\tLength");
        System.out.println("----\t------");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
