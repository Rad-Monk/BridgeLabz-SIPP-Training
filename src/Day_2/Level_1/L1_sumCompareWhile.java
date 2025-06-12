package Day_2.Level_1;

import java.util.Scanner;

public class L1_sumCompareWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            int sum = 0;
            int i = 1;

            while (i <= number) {
                sum = sum + i;
                i++;
            }

            int formulaSum = number * (number + 1) / 2;

            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}
