package com.java.practice.core.datatypes;

public class DataTypes {

    // byte
// Size: 8 bits (1 byte)
// Range: -128 to 127
// Specification: Stores small whole numbers

// short
// Size: 16 bits (2 bytes)
// Range: -32,768 to 32,767
// Specification: Stores whole numbers in a small range

// int
// Size: 32 bits (4 bytes)
// Range: -2^31 to 2^31 - 1
// Specification: Stores integer values; commonly used for whole numbers

// long
// Size: 64 bits (8 bytes)
// Range: -2^63 to 2^63 - 1
// Specification: Stores large whole numbers; use L for long literals

// float
// Size: 32 bits (4 bytes)
// Precision: Approximately 6-7 decimal digits
// Specification: Stores single-precision floating-point numbers; use f for float literals

// double
// Size: 64 bits (8 bytes)
// Precision: Approximately 15-16 decimal digits
// Specification: Stores double-precision floating-point numbers; default type for decimal literals

// char
// Size: 16 bits (2 bytes)
// Range: '\u0000' (0) to '\uFFFF' (65,535)
// Specification: Stores one UTF-16 code unit; uses single quotes

    // boolean
// Size: Not precisely specified by Java
// Values: true or false
// Specification: Stores logical values used in conditions
    public static void main(String[] args) {
        //Integer --> byte, int, short, long
        byte a = 10;
        int b = 10;
        short c = 10;
        long d = 10;
        //Floating point --> float, double
        float e = 10.0f;
        double f = 10.0;
        //Character --> char
        char g = 'C';
        //Boolean --> boolean
        boolean h = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
