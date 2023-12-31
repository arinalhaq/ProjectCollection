/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayliststudent;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author hp
 */
public class Student {

    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList();
        addStudents(studentNames);
        displayStudents(studentNames);
        Collections.sort(studentNames);
        displayStudents(studentNames);
    }

    private static void addStudents(ArrayList<String> studentNames) {
        studentNames.add("Arinal");
        studentNames.add("Yusuf");
        studentNames.add("Azhar");
        studentNames.add("Mark");
        studentNames.add("Andrew");
        studentNames.add("Beth");
    }

    private static void displayStudents(ArrayList<String> studentNames) {
        for (String student : studentNames) {
            System.out.println("Student Names : " + student);
        }
    }

}
