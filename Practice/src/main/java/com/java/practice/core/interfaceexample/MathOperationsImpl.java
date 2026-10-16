package com.java.practice.core.interfaceexample;

public class MathOperationsImpl implements MathsOperations {

    @Override
    public Integer add(Integer a, Integer b) {
        return a+b;
    }

    @Override
    public Integer subtract(Integer a, Integer b) {
        return a-b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }
}
