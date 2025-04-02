package Methode.level3;

import java.util.Scanner;

public class RandomMatrix {

    public static int[][] CreateMatrix() {
        int row, col;

        Scanner Input = new Scanner(System.in);
        System.out.print("please enter the number of row:");
        row = Input.nextInt();

        System.out.print("please enter the number of  colone:");
        col = Input.nextInt();
        int[][] Matrix = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int y = 0; y < row; y++) {
                System.out.print("please enter the number in the position  " + (i + 1) + "," + (y + 1) + " :");
                Matrix[i][y] = Input.nextInt();
                System.out.println();

            }

        }

        return Matrix;

    }

    public static int[][] inverse(int[][] Mat1) {
        int[][] Inverse = new int[Mat1[0].length][Mat1.length];
        for (int i = 0; i < Mat1[0].length; i++) {
            for (int y = 0; y < Mat1.length; y++) {
                Inverse[i][y] = Mat1[y][i];

            }
        }
        return Inverse;

    }

    public static void display(int[][] Matrix) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int y = 0; y < Matrix[0].length; y++) {
                System.out.print((i + 1) + "," + (y + 1) + " :" + Matrix[i][y] + "\n");

            }
        }
    }

    public static int[][] add(int[][] Matrix1, int[][] Matrix2) {
        int row = Matrix1.length;
        int col = Matrix1[0].length;
        int[][] OUT = new int[row][col];
        if (Matrix1.length == Matrix2.length && Matrix1[0].length == Matrix2[0].length) {
            for (int i = 0; i < row; i++) {
                for (int y = 0; y < col; y++) {
                    OUT[i][y] = Matrix1[i][y] + Matrix2[i][y];
                }
            }

            return OUT;
        } else if (Matrix1.length == Matrix2[0].length && Matrix1[0].length == Matrix2.length) {
            Matrix2 = inverse(Matrix2);
            for (int i = 0; i < row; i++) {
                for (int y = 0; y < col; y++) {
                    OUT[i][y] = Matrix1[i][y] + Matrix2[i][y];
                }
            }
            return OUT;

        } else {
            System.out.println("this operation  is impossible");
            return OUT;
        }

    }

    public static void main(String[] args) {
        int[][] Matrix1;
        int[][] Matrix2;
        int[][] Matrix3;
        int[][] Matrix4;
        System.out.println("Matrix1");
        Matrix1 = CreateMatrix();
        System.out.println("Matrix2");
        Matrix2 = CreateMatrix();
        System.out.println("Matrix1 is:");
        display(Matrix1);
        System.out.println("Matrix2 is:");
        display(Matrix2);
        Matrix3 = add(Matrix1, Matrix2);
        System.out.println("Addition of Matrix1 and Matrix2 is:");
        display(Matrix3);
;

    }

}
