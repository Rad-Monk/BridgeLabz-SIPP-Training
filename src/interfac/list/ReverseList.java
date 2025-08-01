package com.interfac.list;
import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        // Example input list (can be ArrayList or LinkedList)
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Original ArrayList: " + arrayList);
        reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        System.out.println("\nOriginal LinkedList: " + linkedList);
        reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }

    // Method to reverse any List (ArrayList or LinkedList)
    public static <T> void reverseList(List<T> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }
}

