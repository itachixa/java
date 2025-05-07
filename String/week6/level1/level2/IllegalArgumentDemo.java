import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String text, int start, int end) {
        System.out.println(text.substring(start, end)); // May throw IllegalArgumentException
    }

    public static void handleException(String text, int start, int end) {
        try {
            System.out.println(text.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        
        // Using the method that generates exception
        generateException(text, start, end);

        // Using the method that handles exceptions
        handleException(text, start, end);
    }
}
