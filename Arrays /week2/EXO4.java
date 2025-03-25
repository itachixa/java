import java.util.Scanner;

public class EXO4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MaxDigit = 10;
        int Max1 = 0;
        int Max2 = 0;
        int Max;
        int length;
        int index = 0;

        System.out.print("Enter the number:");
        String Numbers = input.nextLine();

        if (Numbers.length() > 10) {
            length = MaxDigit * 2;
        } else {
            length = Numbers.length();
        }

        int[] Number = new int[length];

        for (int i = 0; i < Numbers.length(); i++) {
            Number[i] = Character.getNumericValue(Numbers.charAt(i));
        }
        Max = Number[0];

        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < Numbers.length(); x++) {

                if (Max < Number[x]) {
                    Max = Number[x];
                    index = x;

                }

            }
            if (i == 0) {
                Max1 = Max;
                System.out.println(Number[index]);
                Number[index] = 0;
                Max = 0;
            }
            if (i == 1) {
                Max2 = Max;
            }
        }
        input.close();
        System.out.println("le nombre maximal est :" + Max1);
        System.out.println("le nombre suivant le plus grand est :" + Max2);
        input.close();
    }
}