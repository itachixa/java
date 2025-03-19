import java.util.Scanner;

public class EXO3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MaxDigit = 10;
        int Max1=0;
        int Max2=0;
        int Max;
        int index=0;
        int[] Number = new int[MaxDigit];

        System.out.print("Enter the number:");
        String Numbers = input.nextLine();
        int length = Math.min(Numbers.length(), MaxDigit);

        for (int i = 0; i < length; i++) {
            Number[i] = Character.getNumericValue(Numbers.charAt(i));
        }
        Max = Number[0];
        for (int i = 0; i < 2; i++) {
            for (int x = 0; x <Numbers.length(); x++) {
              
                    if (Max< Number[x]) {
                        Max = Number[x];
                        index=x;

                    }

            
            }
            if (i == 0) {
                Max1 = Max;
                Number[index] = 0;
                Max=0;
            }
            if (i == 1) {
                Max2 = Max;
            }
        }
        
        input.close();
        System.out.println("the first maximal digit is :" + Max1);
        System.out.println("the second Max is  :" + Max2);
        input.close();
    }
}