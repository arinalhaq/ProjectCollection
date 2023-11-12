/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortingsearching;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class ArraySortingSearching {

    public static void main(String[] args) {
        String[] students = {"Arinal", "Yusuf", "Azhar", "Mark", "Andrew", "Beth"};

        System.out.println("Unordered");
        displayData(students);
        System.out.println();

        // Arrays Sort
        Arrays.sort(students);
        
        // Selection Sort
        selectionSort(students);

        System.out.println("Ordered");
        displayData(students);
        System.out.println();

        // Arrays Search
        System.out.println("Search Data");
        findData(students, "Arinal");
        findData(students, "efceg");
        
        // Binary Search
        binarySearch(students, "Arinal");
        binarySearch(students, "efceg");

    }

    private static void displayData(String[] students) {
        for (String student : students) {
            System.out.println("Student Names : " + student);
        }
    }

    private static void findData(String[] students, String student) {
        int studentIdx = Arrays.binarySearch(students, student);
        if (studentIdx >= 0) {
            System.out.println(students[studentIdx]
                    + " found with index " + studentIdx + " in array");
        } else {
            System.out.println("No data");
        }
    }

    static void selectionSort(String[] numbers) {
        int indexMin = 0;
        for (int i = 0; i < numbers.length; i++) {
            indexMin = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j].compareTo(numbers[indexMin]) < 0) {
                    indexMin = j;
                }
            }
            String temp = numbers[i];
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
        }
    }

    static public void binarySearch(String[] numbers, String value) {
        int low = 0;
        int high = numbers.length - 1;
        while (high >= low) {
            int middle = (low + high) / 2;
            if (numbers[middle].equals(value)) {
                System.out.println(value + " is at position " + middle + " in the array");
                return;
            }
            if (numbers[middle].compareTo(value) < 0) {
                low = middle + 1;
            }
            if (numbers[middle].compareTo(value) > 0) {
                high = middle - 1;
            }
        }
        System.out.println(value + " is not in the array");
    }

}
