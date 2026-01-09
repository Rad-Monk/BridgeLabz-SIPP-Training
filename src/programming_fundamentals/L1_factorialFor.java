package programming_fundamentals;

import java.util.Scanner;

public class L1_factorialFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 0) {
            int result = 1;

            for (int i = 1; i <= number; i++) {
                result = result * i;
            }

            System.out.println("Factorial is " + result);
        } else {
            System.out.println("Please enter a non-negative integer");
        }
    }
}
