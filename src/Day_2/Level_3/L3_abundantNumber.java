package Day_2.Level_3;

import java.util.Scanner;

public class L3_abundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        System.out.println(number + (sum > number ? " is an Abundant Number" : " is not an Abundant Number"));
    }
}
