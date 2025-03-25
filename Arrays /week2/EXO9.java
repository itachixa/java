import java.util.Scanner;

public class EXO9 {

    public static char calculateGrade(double percentage) {
        if (percentage >= 80)
            return 'A';
        else if (percentage >= 70 && percentage <= 79)
            return 'B';
        else if (percentage >= 60 && percentage <= 69)
            return 'C';
        else if (percentage >= 50 && percentage <= 59)
            return 'D';
        else if (percentage >= 40 && percentage <= 49)
            return 'E';
        else
            return 'R';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEntering marks for Student " + (i + 1) + ":");
            String[] subjects = { "Physics", "Chemistry", "Maths" };

            for (int j = 0; j < 3; j++) {
                while (true) {
                    System.out.print("Enter marks for " + subjects[j] + " (0-100): ");
                    marks[i][j] = scanner.nextInt();

                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Invalid input! Please enter a mark between 0 and 100.");
                    } else {
                        break;
                    }
                }
            }

            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            grades[i] = calculateGrade(percentages[i]);
        }

        System.out.println("\nStudent Results:\n");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-5s\n", "Student", "Physics", "Chemistry", "Maths",
                "Percentage", "Grade");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-5c\n", (i + 1), marks[i][0], marks[i][1], marks[i][2],
                    percentages[i], grades[i]);
        }

        scanner.close();

    }
}
