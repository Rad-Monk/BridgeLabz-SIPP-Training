package programming_fundamentals;

import java.util.Scanner;

public class L2_PowerWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        if (number < 0 || power < 0) {
            System.out.println("Both numbers must be positive.");
            return;
        }

        int result = 1;
        int counter = 0;

        while (counter < power) {
            result = result * number;
            counter++;
        }

        System.out.println(number + " raised to the power " + power + " is " + result);
    }
}
