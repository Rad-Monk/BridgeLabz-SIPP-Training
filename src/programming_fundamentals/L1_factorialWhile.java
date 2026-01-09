package programming_fundamentals;

import java.util.Scanner;

public class L1_factorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 0) {
            int result = 1;
            int i = 1;

            while (i <= number) {
                result = result * i;
                i++;
            }

            System.out.println("Factorial is " + result);
        } else {
            System.out.println("Please enter a non-negative integer");
        }
    }
}
