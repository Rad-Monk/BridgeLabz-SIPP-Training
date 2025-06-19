import java.util.Scanner;

public class ConvertAndCompareUpperCase {

    // Method to convert lowercase characters to uppercase using ASCII logic
    public static String customToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32)); // Convert to uppercase
            } else {
                result.append(ch); // Keep unchanged
            }
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the complete text: ");
        String inputText = input.nextLine();

        // Convert using built-in method
        String builtinUpper = inputText.toUpperCase();

        // Convert using custom method
        String customUpper = customToUpperCase(inputText);

        // Compare using custom method
        boolean areEqual = compareStrings(builtinUpper, customUpper);

        // Display results
        System.out.println("\nBuilt-in uppercase: " + builtinUpper);
        System.out.println("Custom uppercase:   " + customUpper);
        System.out.println("Are both results same? " + areEqual);

        // Close the scanner
        input.close();
    }
}