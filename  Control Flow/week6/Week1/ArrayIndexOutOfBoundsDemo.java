import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        // generateException(names); // Uncomment to crash
        handleException(names);
    }
}
