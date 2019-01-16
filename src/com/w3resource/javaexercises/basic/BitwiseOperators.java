package com.w3resource.javaexercises.basic;

public class BitwiseOperators {

    public String binaryValue (int a) {
        return Integer.toBinaryString(a);
    }

    public String padZeroes (int a, int digits) {
        return String.format("%0" + digits + "d", Integer.parseInt(binaryValue(a)));
    }

    public int and (int a, int b) {
        return a & b;
    }

    public int or (int a, int b) {
        return a | b;
    }
}
