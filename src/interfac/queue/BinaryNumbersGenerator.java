package com.interfac.queue;

import java.util.*;

public class BinaryNumbersGenerator {
    public static List<String> generateBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        while (n-- > 0) {
            String current = queue.remove();
            result.add(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        List<String> binaryNumbers = generateBinaryNumbers(n);
        System.out.println("Binary numbers: " + binaryNumbers);
    }
}
