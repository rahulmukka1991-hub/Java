package com.java.practice.core.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {

    private static List<String> studentNames = new ArrayList<>();

    public static void main(String[] args) {
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();

        studentManagementSystem.addStudent("Lakshmi");
        studentManagementSystem.addStudent("Karl");

        studentManagementSystem.displayStudents();

        studentManagementSystem.searchStudent("Lakshmi");
    }

    public boolean addStudent(String studentName) {
        studentNames.add(studentName);
        return true;
    }

    public void displayStudents() {
        for (String studentName : studentNames) {
            System.out.println(studentName);
        }
    }

    public boolean searchStudent(String studentName) {
//        for (String name:  studentNames) {
//            if (name.equals(studentName)) {
//                return true;
//            }
//        }
//        return false;

        return studentName.contains(studentName);
    }


}
