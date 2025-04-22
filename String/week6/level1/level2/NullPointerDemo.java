public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // This will throw NullPointerException
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Uncomment the following line to see the exception
        // generateException();

        // Handling the exception
        handleException();
    }
}
