package Day_2.Level_3;

import java.util.Scanner;

public class L3_armstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number, sum = 0;

        while (original != 0) {
            int digit = original % 10;
            sum += digit * digit * digit;
            original /= 10;
        }

        System.out.println(number + (sum == number ? " is an Armstrong number" : " is not an Armstrong number"));
    }
}
