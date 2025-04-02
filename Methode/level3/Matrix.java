package Methode.level3;

import java.util.Scanner;

import Week4.LEVEL1_pratique.array;

public class Matrix {
    public static int det(int[][] Mat1) {
        return (Mat1[1][1] * Mat1[0][0]) - (Mat1[0][1] * Mat1[1][0]);
    }

    public static int[][] Multi(int[][] Mat1, int[][] Mat2) {
        int[][] newMat = new int[2][2];
        newMat[0][0] = (Mat1[0][0] * Mat2[0][0]) + (Mat1[0][1] * Mat2[1][0]);

        newMat[0][1] = (Mat1[0][0] * Mat2[0][1]) + (Mat1[0][1] * Mat2[1][1]);

        newMat[1][0] = (Mat1[1][0] * Mat2[0][0]) + (Mat1[1][0] * Mat2[1][0]);

        newMat[1][1] = (Mat1[1][1] * Mat2[0][1]) + (Mat1[1][1] * Mat2[1][1]);
        return newMat;

    }

    public static void enter(int[][] Mat) {
        Scanner Input = new Scanner(System.in);
        System.out.println("please enter the matrix :");
        for (int i = 0; i < 2; i++) {
            for (int y = 0; y < 2; y++) {
                System.out.print("please enter the number in the position  " + (i + 1) + "," + (y + 1) + " :");
                Mat[i][y] = Input.nextInt();
            }

        }

    }

    public static void display(int[][] Mat) {
        for (int i = 0; i < 2; i++) {
            for (int y = 0; y < 2; y++) {
                System.out
                        .println("The number in the position : " + (i + 1) + "," + (y + 1) + " :" + "is :" + Mat[i][y]);

            }

        }
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int[][] Matrix1 = new int[2][2];
        int[][] Matrix2 = new int[2][2];
        int[][] Matrix3 = new int[2][2];
        enter(Matrix2);
        enter(Matrix1);
        System.out.println("the determinat of the matrix one is :" + det(Matrix2));
        Matrix3 = Multi(Matrix2, Matrix1);
        display(Matrix3);
        Input.close();

    }

}