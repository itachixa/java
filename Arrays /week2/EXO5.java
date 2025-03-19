import java.util.Scanner;

public class EXO5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MaxDigit = 10;
       
        int length;
        
        

        System.out.print("Enter the number:");
        String Numbers = input.nextLine();

        if (Numbers.length()>10){
            length=MaxDigit*2;
        }else{
             length=Numbers.length();
        }
        
        
        int[] NormalOrder= new int[length];
        int[] reverse= new int[length];


        for (int i = 0; i <Numbers.length(); i++) {
            NormalOrder[i] = Character.getNumericValue(Numbers.charAt(i));
        }

        for (int i = 0; i <Numbers.length(); i++) {
            reverse[i] = NormalOrder[(Numbers.length()-1)-i];
        }
        
        for(int y= 0; y<Numbers.length();y++){
            System.out.print(reverse[y]);

        }
        input.close();
    }
}