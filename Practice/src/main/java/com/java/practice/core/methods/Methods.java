package com.java.practice.core.methods;

public class Methods {

    //2 types -> static(no object creation needed) and instance

    private static void m1() {
        System.out.println("Static method");
    }

    private void m2() {
        System.out.println("Instance method");
    }

    public static void main(String[] args) {
        m1();
        Methods m = new Methods();
        m.m2();
    }
}
