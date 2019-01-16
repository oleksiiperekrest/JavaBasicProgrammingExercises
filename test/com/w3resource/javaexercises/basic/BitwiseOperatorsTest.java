package com.w3resource.javaexercises.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitwiseOperatorsTest {

    private int a = 3, b = 4, c = 14;
    private BitwiseOperators bit = new BitwiseOperators();

    @Test
    void binaryValue() {
        assertEquals("11", bit.binaryValue(a));
        assertEquals("100", bit.binaryValue(b));
        assertEquals("1110", bit.binaryValue(c));
    }

    @Test
    void padZeroes() {
        assertEquals("0011", bit.padZeroes(a,4));
        assertEquals("100", bit.padZeroes(b,2));
        assertEquals("00001110", bit.padZeroes(c,8));
    }

    @Test
    void and() {
        assertEquals(0, bit.and(a, b));
        assertEquals(4, bit.and(b, c));
        assertEquals(2, bit.and(a, c));
    }

    @Test
    void or() {
        assertEquals(7, bit.or(a, b));
        assertEquals(14, bit.or(b, c));
        assertEquals(15, bit.or(a, c));
    }
}