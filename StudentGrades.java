import java.util.Random;

public class StudentGrades {

    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(50) + 50;
            scores[i][1] = rand.nextInt(50) + 50;
            scores[i][2] = rand.nextInt(50) + 50;
        }
        return scores;
    }

    public static void main(String[] args) {
        int students = 5;
        int[][] scores = generateScores(students);

        System.out.println("Student Scores:");
        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 150.0) * 100;

            String grade = "";
            if (percentage >= 90) {
                grade = "A";
            } else if (percentage >= 80) {
                grade = "B";
            } else if (percentage >= 70) {
                grade = "C";
            } else if (percentage >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.printf("Student %d - Marks: %d %d %d, Total: %d, Average: %.2f, Percentage: %.2f%%, Grade: %s\n", 
                i + 1, scores[i][0], scores[i][1], scores[i][2], total, average, percentage, grade);
        }
    }
}
