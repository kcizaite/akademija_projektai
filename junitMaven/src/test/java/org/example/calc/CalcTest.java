package org.example.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*; // Buna statiniai importai

public class CalcTest {
    //  Mes su siuo atsisakome visu "Calculator calc = new Calculator();", kuriuos zemiau esu uzrasiusi
    Calculator calc;

    @BeforeEach
    void setup() {
        calc = new Calculator();
    }

    @Test
    void testSum() {
//        fail(); ???
//        arrange = nurodymas
//        Calculator calc = new Calculator();
        int expected = 4;
//        act = veikimas
        int result = calc.sum(2, 2);
//        assert = patikrinimas
//        expected = ko as laukiu; result = ka turiu gauti; "2 + 2 should be..." = pranesimas, kai griuna kodas
        assertEquals(expected, result, "2 + 2 should be...");
        assertEquals(4, calc.sum(2, 2));
    }

    @Test
    void testDivideException() {
//        Calculator calc = new Calculator();
        assertThrows(IllegalAccessException.class, () -> calc.divide(2, 0));
    }

    @Test
    void testMultiply() {
//        Calculator calc = new Calculator();
        int expected = 4;
        int result = calc.multiply(2, 2); // Galime pirma tai kurti ir metodas susikurs pats
        assertEquals(expected, result, "2 + 2 should be...");
        assertEquals(4, calc.sum(2, 2));
    }
}
