package programming_fundamentals;

import java.util.Scanner;

public class L1_sumCompareFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum = sum + i;
            }

            int formulaSum = number * (number + 1) / 2;

            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}
