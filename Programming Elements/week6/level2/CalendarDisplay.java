import java.util.Scanner;

public class CalendarDisplay {

 
    private static final String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

  
    private static final int[] daysInMonth = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to calculate the first day of the month
    public static int getFirstDay(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }

    // Method to print the calendar
    public static void printCalendar(int month, int year) {
        // Adjust days for leap year
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        } else {
            daysInMonth[2] = 28;
        }

        System.out.printf("%n     %s %d%n", months[month], year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // Print spaces before first day
        }

        for (int day = 1; day <= daysInMonth[month]; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0 || day == daysInMonth[month]) {
                System.out.println(); // Move to next line after Saturday
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.close();

        printCalendar(month, year);
    }
}
