package programming_fundamentals;

import java.util.Scanner;

public class L2_YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int age1 = scanner.nextInt();
        System.out.print("Enter height of Amar: ");
        int height1 = scanner.nextInt();

        System.out.print("Enter age of Akbar: ");
        int age2 = scanner.nextInt();
        System.out.print("Enter height of Akbar: ");
        int height2 = scanner.nextInt();

        System.out.print("Enter age of Anthony: ");
        int age3 = scanner.nextInt();
        System.out.print("Enter height of Anthony: ");
        int height3 = scanner.nextInt();

        if (age1 <= age2 && age1 <= age3) {
            System.out.println("Amar is the youngest");
        } else if (age2 <= age1 && age2 <= age3) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }

        if (height1 >= height2 && height1 >= height3) {
            System.out.println("Amar is the tallest");
        } else if (height2 >= height1 && height2 >= height3) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }
    }
}
