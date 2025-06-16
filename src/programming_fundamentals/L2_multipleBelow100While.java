package programming_fundamentals;

import java.util.Scanner;

public class L2_multipleBelow100While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input.");
            return;
        }

        int counter = 1;
        System.out.println("Multiples of " + number + " below 100:");
        while (counter < 100) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
