import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the month name from month number
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Method to calculate first day of the month using Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }

    // Method to print the calendar
    public static void printCalendar(int month, int year) {
        int days = getDaysInMonth(month, year);
        int startDay = getFirstDayOfMonth(month, year);

        System.out.printf("\n  %s %d\n", getMonthName(month), year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First line spacing
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print days
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println(); // New line after Saturday
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner oject
        Scanner input = new Scanner(System.in);

        // Taking month and year input from user
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        // print the calendar
        printCalendar(month, year);

        // Close the scanner
        input.close();
    }
}