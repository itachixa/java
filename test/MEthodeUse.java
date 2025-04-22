package test;
import java.util.Scanner;
public class MEthodeUse {
    
    public static int  SumEven(int[] tab, int size){
        int sum=0;
        for( int i=0; i<size; i++){
            if (tab[i] %2==0){
                sum+=tab[i];
            }
        }
        return sum;

    }

    public static int  Sumold(int[] tab, int size){
        int sum=0;
        for( int i=0; i<size; i++){
            if (tab[i] %2!=0){
                sum+=tab[i];
            }
        }
        return sum;

    }


    public static int  SumPrime(int[] tab, int size){
        int sum=0;
        for( int i=0; i<size; i++){
            if (tab[i]==2 || tab[i]==3){
                sum+=tab[i];
            }
            else if (tab[i] %2!=0 && tab[i]%3!=0){
                sum+=tab[i];
            }
        }
        return sum;

    }

    public static int  Max(int[] tab, int size){
        int Max=tab[0];
        for( int i=0; i<size; i++){
            if (Max<tab[i]){
            Max=tab[i];
            }
        }
        return Max;

    }
    public static int  Min(int[] tab, int size){
        int Min=tab[0];
        for( int i=0; i<size; i++){
            if (Min>tab[i]){
            Min=tab[i];
            }
        }
        return Min;

    }

    public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    int size;
    System.out.println("please enter the number of number ");
    size=Input.nextInt();
    int [] Numbers= new int[size];
     for (int i= 0; i<size;i++){
         System.out.println("please enter the "+(i+1)+"number :");
         Numbers[i]=Input.nextInt();
     }

    System.out.println("The sum of  Even Numbers is : "+SumEven(Numbers, size));
    System.out.println("The sum of old Numbers is :"+ Sumold(Numbers, size));
    System.out.println("The sum of Prime Numbers is :"+SumPrime(Numbers, size));
    System.out.println("The Max number is :"+Max(Numbers, size));
    System.out.println("The Min is :"+Min(Numbers, size));
    Input.close();
}
}
