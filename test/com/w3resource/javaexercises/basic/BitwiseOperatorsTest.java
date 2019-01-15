package com.w3resource.javaexercises.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitwiseOperatorsTest {

    private int a = 3, b = 4, c = 14;
    private BitwiseOperators bit = new BitwiseOperators();

    @Test
    void binaryValue() {
        assertEquals("00000011", bit.binaryValue(a));
        assertEquals("00000100", bit.binaryValue(b));
        assertEquals("00001110", bit.binaryValue(c));
    }

    @Test
    void and() {
        assertEquals(0, bit.and(a, b));
        assertEquals(4, bit.and(b, c));
        assertEquals(2, bit.and(a, c));
    }
}