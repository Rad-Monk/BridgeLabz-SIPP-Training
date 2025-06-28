package classandobject.level2.palindromechecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string to check for palindrome: ");
        String str = input.nextLine();

        // Create an instance of PallindromeChecker and check the result
        PalindromeChecker checker = new PalindromeChecker(str);
        checker.displayResult();

        // Close the Scanner
        input.close();
    }
}