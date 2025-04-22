public class UniqueCharacters {
    static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    static char[] getUniqueCharacters(String text) {
        int length = getLength(text);
        char[] unique = new char[length];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    found = true;
                    break;
                }
            }
            if (!found) unique[index++] = current;
        }
        return Arrays.copyOf(unique, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] result = getUniqueCharacters(input);
        System.out.println("Unique characters: " + Arrays.toString(result));
    }
}
