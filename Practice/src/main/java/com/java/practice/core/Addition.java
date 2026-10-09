package com.java.practice.core;

public class Addition {

    static void main(String[] args) {
        additionOperationCases();
    }

    public static void additionOperationCases() {
        //        //Case 1
        Integer number1 = 10;
        Integer number2 = 20;
        sum(number1, number2); //30

        // case 2:
        number1 = -40;
        number2 = -50;
        sum(number1, number2);//out of scope

        //case 3
        number1 = 40;
        number2 = 50;
        sum(number1, number2); //90

        //case 4:
        number1 = 0;
        number2 = 0;
        sum(number1, number2);//0

        //case 5:
        number1 = Integer.MAX_VALUE;
        number2 = Integer.MAX_VALUE;
        sum(number1, number2);//max value
    }

    /**
     *     Case 1: positive number -> 1  + 1 = 2
     *     Case 2: negative -> -1 + -1 = -2
     *     Case 3: Always positive -> case 2 inactive
     *     case 4: both zero
     *     case 5: max integer values
     */
    public static void sum(int number1, int number2) {
        if( number1 >= 0 && number2 >= 0) {
            int sum = number1 + number2;
            System.out.println(sum);
        } else {
            System.out.println("Out of scope");
        }
    }
}
