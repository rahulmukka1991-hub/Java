package com.java.practice.core.accessspecifiers.p2;

import com.java.practice.core.accessspecifiers.p1.Class1;

public class Class3 extends Class1 {

    public void m2() {
        Class1 c1 = new Class1();
        System.out.println(c1.a);
        System.out.println(d);
    }
}
