package programming_fundamentals;

import java.util.Scanner;

public class L3_calculateGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks obtained in physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter the marks obtained in chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter the marks obtained in mathematics: ");
        int maths = scanner.nextInt();

        double avg = (physics + chemistry + maths) / 3.0;
        System.out.println("Average Marks: " + avg);

        if (avg >= 90) {
            System.out.println("Grade: A - Excellent");
        } else if (avg >= 75) {
            System.out.println("Grade: B - Good");
        } else if (avg >= 60) {
            System.out.println("Grade: C - Fair");
        } else if (avg >= 40) {
            System.out.println("Grade: D - Needs Improvement");
        } else {
            System.out.println("Grade: F - Failed");
        }
    }
}
