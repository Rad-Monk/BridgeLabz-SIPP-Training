package Day_2.Level_1;

import java.util.Scanner;

public class L1_oddEvenPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even number");
                } else {
                    System.out.println(i + " is odd number");
                }
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}
