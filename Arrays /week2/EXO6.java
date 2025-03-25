import java.util.Scanner;

public class EXO6 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int nombre;
        System.out.print("pls enter the number of employes:");
        nombre = Input.nextInt();
        double[] height = new double[nombre];
        double[] weight = new double[nombre];
        double[] IBM = new double[nombre];
        String[] weightStatus = new String[nombre];

        for (int i = 0; i < nombre; i++) {
            System.err.print("Please enter the heigt in m of " + (i + 1) + " Employer:");
            height[i] = Input.nextDouble();
            System.err.print("Please enter the weigth of in Kg" + (i + 1) + " Employer:");
            weight[i] = Input.nextDouble();
            IBM[i] = weight[i] / (height[i] * height[i]);
            if (IBM[i] > 0 && IBM[i] <= 18.4) {
                weightStatus[i] = "UnderWeight";

            } else if (IBM[i] > 18.4 && IBM[i] < 24.9) {

                weightStatus[i] = "Normal";
            } else if (IBM[i] >= 25 && IBM[i] < 39.9) {

                weightStatus[i] = "OverWeight";
            } else {
                weightStatus[i] = "Obese";
            }

        }
        for (int i = 0; i < nombre; i++) {
            System.out.println("the heigh of " + (i + 1) + " Employer is :" + height[i]);
            System.out.println("the weigth of " + (i + 1) + " Employer is :" + weight[i]);
            System.out.println("the IBM of " + (i + 1) + " Employer is :" + IBM[i]);
            System.out.println("the statut of " + (i + 1) + " Employer is :" + weightStatus[i]);
            System.out.println("---------------------------------------------------");
        }

        Input.close();
    }
}