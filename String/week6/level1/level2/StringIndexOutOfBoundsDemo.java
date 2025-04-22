import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // This will throw StringIndexOutOfBoundsException
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // Uncomment the following line to see the exception
        // generateException(text);

        // Handling the exception
        handleException(text);
    }
}
