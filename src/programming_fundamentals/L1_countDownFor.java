package programming_fundamentals;

import java.util.Scanner;

public class L1_countDownFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
