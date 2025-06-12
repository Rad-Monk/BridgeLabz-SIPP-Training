package Day_2.Level_1;

import java.util.Scanner;

public class L1_employeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        int years = scanner.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus is " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }
}
