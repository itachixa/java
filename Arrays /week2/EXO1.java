import java.util.Scanner;

public class EXO1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Employers_number;
        System.out.print("pls enter the numbers employers:");
        Employers_number = input.nextInt();
        int[] year = new int[Employers_number];
        double[] old_salary = new double[Employers_number];
        double[] new_salary = new double[Employers_number];
        double[] bonus = new double[Employers_number];

        for (int i = 0; i < Employers_number; i++) {
            System.out.print("pls enter the works age for " + (i + 1) + " Employer: ");
            year[i] = input.nextInt();
            System.out.print("his salary:");
            old_salary[i] = input.nextInt();
        }
        System.out.println();

        for (int i = 0; i < Employers_number; i++) {
            if (year[i] > 5) {
                new_salary[i] = (old_salary[i] * 0.05) + old_salary[i];
                bonus[i] = old_salary[i] * 0.05;
            } else {
                new_salary[i] = (old_salary[i] * 0.02) + old_salary[i];
                bonus[i] = old_salary[i] * 0.02;
            }
        }

        System.out.println("the all information is :\n----------------------------------------------");

        for (int i = 0; i < Employers_number; i++) {
            System.out.println("the employer " + (i + 1) + " has:");
            System.out.println("the works year is : " + year[i]);
            System.out.println("the Old salary is :" + old_salary[i]);
            System.out.println("the bonus is " + bonus[i]);
            System.out.println("the new salary is :" + new_salary[i]);
            System.out.println("--------------------------------------------");

        }
        input.close();
    }
    
}
