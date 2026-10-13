package com.java.practice.core.exceptions;

public class MyExceptionTest {

    public static void main(String[] args) {
        try {
            System.out.println("A");
            int c = 10 / 0;
            System.out.println("D");
        } catch (ArithmeticException e) {
            System.out.println("E");
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
    }
}
