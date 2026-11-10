package com.java.practice.core;

public class Welcome {
    public static void main(String[] args) {

        System.out.println("Welcome to Java");

        ClassExample example = new ClassExample();
        example.setName("name");
        System.out.println(example.getName());
        System.out.println(example.upperCaseName("name"));
    }
}
