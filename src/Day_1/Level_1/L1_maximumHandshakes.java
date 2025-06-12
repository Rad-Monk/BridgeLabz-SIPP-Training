package Day_1.Level_1;

import java.util.Scanner;

public class L1_maximumHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of handshakes is " + handshakes);
    }
}
