// Java Program - Level 3 Practice Programs
// Author: SALIFOU Aléheri Christian

import java.util.*;

public class Level3PracticePrograms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Heights Program
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); // 150 to 250
        }

        System.out.println("Player Heights: " + Arrays.toString(heights));
        System.out.println("Sum: " + findSum(heights));
        System.out.println("Mean Height: " + findMean(heights));
        System.out.println("Shortest: " + findMin(heights));
        System.out.println("Tallest: " + findMax(heights));

        // 2. NumberChecker usage
        int number = 153;
        System.out.println("Digits Count: " + NumberChecker.countDigits(number));
        int[] digits = NumberChecker.storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck Number: " + NumberChecker.isDuckNumber(digits));
        System.out.println("Armstrong: " + NumberChecker.isArmstrongNumber(digits, number));
        System.out.println("Largest & 2nd: " + Arrays.toString(NumberChecker.findTwoLargest(digits)));
        System.out.println("Smallest & 2nd: " + Arrays.toString(NumberChecker.findTwoSmallest(digits)));
    }

    static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr)
            sum += num;
        return sum;
    }

    static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr)
            if (num < min)
                min = num;
        return min;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr)
            if (num > max)
                max = num;
        return max;
    }
}

class NumberChecker {

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] storeDigits(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = Character.getNumericValue(s.charAt(i));
        }
        return arr;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0)
                return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int[] digits, int number) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    public static int[] findTwoLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2 && n != max1) {
                max2 = n;
            }
        }
        return new int[] { max1, max2 };
    }

    public static int[] findTwoSmallest(int[] arr) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2 && n != min1) {
                min2 = n;
            }
        }
        return new int[] { min1, min2 };
    }
}
