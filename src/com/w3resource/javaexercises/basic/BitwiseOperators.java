package com.w3resource.javaexercises.basic;

public class BitwiseOperators {

    public String binaryValue (int a) {
        return String.format("%08d", Integer.parseInt(Integer.toBinaryString(a)));
    }

    public int and (int a, int b) {
        return a & b;
    }
}
