import java.util.Scanner;

public class EXO7 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int nombre;
        System.out.print("pls enter the number of employes:");
        nombre = Input.nextInt();
        double[][] Information = new double[nombre][3];
        String[] weightStatus = new String[nombre];

        for (int i = 0; i < nombre; i++) {
            System.err.print("Please enter the heigt in m of " + (i + 1) + " Employer:");
            Information[i][0] = Input.nextDouble();
            System.err.print("Please enter the weigth of in Kg " + (i + 1) + " Employer:");
            Information[i][1] = Input.nextDouble();
            Information[i][2] = Information[i][1] / (Information[i][0] * Information[i][0]);
            if (Information[i][2] > 0 && Information[i][2] <= 18.4) {
                weightStatus[i] = "UnderWeight";

            } else if (Information[i][2] > 18.4 && Information[i][2] < 24.9) {

                weightStatus[i] = "Normal";
            } else if (Information[i][2] >= 25 && Information[i][2] < 39.9) {

                weightStatus[i] = "OverWeight";
            } else {
                weightStatus[i] = "Obese";
            }

        }
        for (int i = 0; i < nombre; i++) {
            System.out.println("the heigh of " + (i + 1) + " Employer is :" + Information[i][0]);
            System.out.println("the weigth of " + (i + 1) + " Employer is :" + Information[i][1]);
            System.out.println("the IBM of " + (i + 1) + " Employer is :" + Information[i][2]);
            System.out.println("the statut of " + (i + 1) + " Employer is :" + weightStatus[i]);
            System.out.println("---------------------------------------------------");
        }
        Input.close();

    }
}
