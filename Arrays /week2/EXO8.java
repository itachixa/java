import java.util.Scanner;

public class EXO8 {

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

        int[] Physics = new int[numStudents];
        int[] Chemistry = new int[numStudents];
        int[] Maths = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEntering marks for Student " + (i + 1) + ":");

            Physics[i] = getValidMarks(scanner, "Physics");
            Chemistry[i] = getValidMarks(scanner, "Chemistry");
            Maths[i] = getValidMarks(scanner, "Maths");

            percentages[i] = (Physics[i] + Chemistry[i] + Maths[i]) / 3.0;
            grades[i] = calculateGrade(percentages[i]);
        }

        System.out.println("\nStudent Results:\n");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-5s\n", "Student", "Physics", "Chemistry", "Maths",
                "Percentage", "Grade");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-5c\n",
                    (i + 1), Physics[i], Chemistry[i], Maths[i], percentages[i], grades[i]);
        }

        scanner.close();
    }

    public static int getValidMarks(Scanner scanner, String subject) {
        int marks;
        while (true) {
            System.out.print("Enter marks for " + subject + ": ");
            marks = scanner.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input! Please enter a mark between 0 and 100.");
            } else {
                break;
            }
        }
        return marks;

    }
}
