package Methode.level2;

import java.util.Scanner;

public class Generator {
    public static double[] generate4DigitRandomArray(int size) {
        double[] NunberGenrete = new double[size];
        for (int i = 0; i < 4; i++) {
            NunberGenrete[i] = Math.random();

        }
        return NunberGenrete;

    }

    public static void findAvergeMinMx(double[] a) {
        int sum = 0;
        double max = a[0];
        double min = a[0];
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("the max is :" + max + " the  min is " + min + " the  avreage is :" + sum / a.length);

    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int Number;

        System.out.println("write the number the of integer do  you want to generate :");
        Number = Input.nextInt();

        double[] Genrate = new double[Number];
        Genrate = generate4DigitRandomArray(Number);
        findAvergeMinMx(Genrate);
        Input.close();

    }
}
