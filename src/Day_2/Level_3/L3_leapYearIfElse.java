package Day_2.Level_3;

import java.util.Scanner;

public class L3_leapYearIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        if (year < 1582) {
            System.out.println("Leap year check only valid from 1582 onwards.");
        } else if (year % 4 != 0) {
            System.out.println(year + " is not a Leap Year");
        } else if (year % 100 != 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
