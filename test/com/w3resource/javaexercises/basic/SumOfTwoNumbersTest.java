package com.w3resource.javaexercises.basic;

import com.w3resource.javaexercises.basic.SumOfTwoNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoNumbersTest {

    private SumOfTwoNumbers sum = new SumOfTwoNumbers();
    private int a = 4, b = 8;


    @Test
    void countSum() {
        assertEquals(12, sum.countSum(a, b));
    }

    @Test
    void printSum() {
    }
}