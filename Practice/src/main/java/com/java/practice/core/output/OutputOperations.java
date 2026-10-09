package com.java.practice.core.output;

public class OutputOperations {

    public static void main(String[] args) {
        System.out.println("Hello World");

        m2();

        OutputOperations outputOperations = new OutputOperations();
        outputOperations.m1();
    }

    public void m1() {
        System.out.println("Welcome to method 1");
    }


    public static void m2() {
        System.out.println("Welcome to method 1");
    }

}
