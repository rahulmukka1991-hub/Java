package com.java.practice.core.interfaceexample;

public class TestAddition {

    public static void main(String[] args) {
        MathsOperations math = new MathOperationsImpl();
        System.out.println(math.add(10, 20));
        System.out.println(math.add(0, 0));
        System.out.println(math.add(-1, -1));
        System.out.println(math.add(100, 100));
        System.out.println(math.subtract(10, 20));
        System.out.println(math.multiply(10, 20));
    }
}
