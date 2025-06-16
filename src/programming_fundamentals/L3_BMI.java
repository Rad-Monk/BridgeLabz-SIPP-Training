package programming_fundamentals;

import java.util.Scanner;

public class L3_BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = scanner.nextDouble();
        double heightM = heightCm / 100;

        double bmi = weight / (heightM * heightM);
        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Status: Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Status: Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obesity");
        }
    }
}
