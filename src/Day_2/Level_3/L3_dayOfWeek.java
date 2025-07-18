package Day_2.Level_3;

import java.util.Scanner;

public class L3_dayOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();
        System.out.print("Enter year: ");
        int d = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int y = scanner.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int dayOfWeek = (d + x + 31 * m0 / 12) % 7;

        System.out.println("Day of week is: " + dayOfWeek);
    }
}
