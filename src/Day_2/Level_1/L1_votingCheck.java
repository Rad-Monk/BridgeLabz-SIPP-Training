package Day_2.Level_1;

import java.util.Scanner;

public class L1_votingCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
