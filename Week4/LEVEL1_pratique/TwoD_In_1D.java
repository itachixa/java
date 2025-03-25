package Week4.LEVEL1_pratique;

import java.util.Scanner;
public class TwoD_In_1D {
public static void main(String[] args) {
    
    int[][] matrix= new int[2][2];
    Scanner Input = new Scanner(System.in);
    int[] SingleDimention = new int[4];

    
    for (int i=0;i<2; i++){
        for (int y=0;y<2; y++){
          System.out.print("pls enter the number in "+(i+1)+" line and "+(y+1)+" colone:");
          matrix[i][y]=Input.nextInt();
        }

    }
    int index=0;
    for (int i=0;i<2; i++){
        for (int y=0;y<2; y++){
          
       SingleDimention[index] = matrix[i][y];
       index+=1;
     }

    }
    System.out.println("the number  in single array is :");
    
    for(int  i=0; i<4;i++){
        System.out.println(SingleDimention[i]);

    }
    Input.close();
}

}
