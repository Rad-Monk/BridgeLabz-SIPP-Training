package Day_2.Level_2;

import java.util.Scanner;

public class L2_powerFor {
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
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        System.out.println(number + " raised to the power " + power + " is " + result);
    }
}
