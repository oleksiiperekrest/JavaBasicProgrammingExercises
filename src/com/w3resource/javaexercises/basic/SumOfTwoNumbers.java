package com.w3resource.javaexercises.basic;

/**
 * Write a Java program to print the sum of two numbers.
 */
public class SumOfTwoNumbers {

    private int countSum(int one, int two) {
        return (one + two);
    }

    private double countSum(double one, double two) {
        return (one + two);
    }

    public Number countSum(Number one, Number two) {
        if (one.doubleValue() % 1 == 0 && two.doubleValue() % 1 == 0) {
            return countSum(one.intValue(), two.intValue());
        }
        else return countSum(one.doubleValue(), two.doubleValue());
    }


    public void printSum (Number one, Number two) {
        System.out.println(one + " + " + two + " = " + countSum(one, two));
    }
}
