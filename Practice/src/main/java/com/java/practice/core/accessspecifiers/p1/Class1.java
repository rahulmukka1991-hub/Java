package com.java.practice.core.accessspecifiers.p1;

public class Class1 {

    public int a = 10;//any where in the project
    private int b = 20;//only in this class
    int  c = 30;//with in package
    protected  int d = 40;//with in the package and subclass


    public void m1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
