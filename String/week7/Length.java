package String.week7;
import java.util.Scanner;

public class Length {
    public static int mylenth(String sentence) {
        int count = 0;

        try {
            while (true) {
                sentence.charAt(count);
                    count += 1;

                }

            }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(mylenth("Bonjour"));
    }

}
