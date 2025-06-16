package programming_fundamentals;

import java.util.Scanner;

public class L3_harshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0, temp = number;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println(number + (number % sum == 0 ? " is a Harshad Number" : " is not a Harshad Number"));
    }
}
