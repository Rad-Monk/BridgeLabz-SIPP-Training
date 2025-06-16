package programming_fundamentals;

import java.util.Scanner;

public class L2_multipleNumbersBelow100For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input.");
            return;
        }

        System.out.println("Multiples of " + number + " below 100:");
        for (int i = 1; i < 100; i++) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
    }
}
