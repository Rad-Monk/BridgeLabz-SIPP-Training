package Day_2.Level_2;

import java.util.Scanner;

public class L2_factorsWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Not a positive integer.");
            return;
        }

        int i = 1;
        System.out.println("Factors of " + number + ":");
        while (i < number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
