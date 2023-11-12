/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortingsearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author hp
 */
public class ArrayListSortingSearching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Arraylist Sorting & Searching
        ArrayList<String> students = new ArrayList();
        students.add("Arinal");
        students.add("Yusuf");
        students.add("Azhar");
        students.add("Mark");
        students.add("Andrew");
        students.add("Beth");

        System.out.println("Unordered");
        displayData(students);

        // Arraylist Sort
        students.sort(Comparator.naturalOrder());

        // Collection sort
        Collections.sort(students);

        System.out.println("Ordered");
        displayData(students);

        // Arraylist search
        System.out.println("Search Data");
        findData(students, "Arinal");
        findData(students, "efceg");

    }

    private static void displayData(ArrayList<String> students) {
        for (String student : students) {
            System.out.println("Student Names : " + student);
        }
    }

    private static void findData(ArrayList<String> students, String student) {
        int studentIdx = students.indexOf(student);
        if (studentIdx >= 0) {
            System.out.println(students.get(studentIdx)
                    + " found with index " + studentIdx + " in ArrayList");
        } else {
            System.out.println("No data");
        }
    }

}
