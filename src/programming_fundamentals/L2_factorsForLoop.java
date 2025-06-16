package programming_fundamentals;

import java.util.Scanner;

public class L2_factorsForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Not a positive integer.");
            return;
        }

        System.out.println("Factors of " + number + ":");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
