import java.util.Scanner;

public class EXO10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MaxDigit = 10;
        int[] digit = new int[MaxDigit];
        int[] NbDigit = new int[MaxDigit];
        int index = 0;

        System.out.print("Enter the number: ");
        String Number = input.nextLine();
        input.close();

        int[] frequency = new int[10];

        for (int i = 0; i < Number.length(); i++) {
            char c = Number.charAt(i);
            if (Character.isDigit(c)) {// is digit verifie si un charctere est un entier ou pas
                int num = Character.getNumericValue(c);
                frequency[num]++;
            }
        }

        for (int x = 0; x < 10; x++) {
            if (frequency[x] >= 1) {
                digit[index] = x;
                NbDigit[index] = frequency[x];
                index++;
            }
        }

        for (int a = 0; a < index; a++) {
            System.out.println("The frequency of " + digit[a] + " is: " + NbDigit[a]);
        }

    }
}
