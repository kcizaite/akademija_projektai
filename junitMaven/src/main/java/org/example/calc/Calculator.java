package org.example.calc;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) throws IllegalAccessException {
        if (b == 0) {
            throw new IllegalAccessException("b can not be 0");
        }
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
