package programming_fundamentals;

import java.util.Scanner;

public class L3_leapYearLogical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println("Not a Leap Year or year before Gregorian calendar");
        }
    }
}
