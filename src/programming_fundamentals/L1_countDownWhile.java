package programming_fundamentals;

import java.util.Scanner;

public class L1_countDownWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}
