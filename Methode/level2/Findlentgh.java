package Methode.level2;
import java.util.Scanner;
public class Findlentgh {
    public static int youngess(int[] age){
        int min = age[0];
        for (int i=0; i<3;i++){
            if (min>age[i]){
                min = age[i];
            }
        }
        return min;
    }
    public static double tallest(double[] height){
        double max = height[0];
        for (int i=0; i<3;i++){
            if (max<height[i]){
                max = height[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner Input= new Scanner(System.in);
        int[] age = new int[3];
        double [] height= new double[3];
        for  (int i =0; i<3;i++){
            System.out.print("pls enter the age of  "+(i+1)+(":"));
            age[i]= Input.nextInt();
            System.out.print("his heigtht :");
            height[i]=Input.nextDouble();
        }

        System.out.println("the  yongest age is :" + youngess(age));
        System.out.println("the tallest man have :"+tallest(height));
        Input.close();

    }
    

}
