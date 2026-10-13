package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    Factorial obj = new Factorial();

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, obj.findFactorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, obj.findFactorial(1));
    }

    @Test
    public void testFactorialOfFive() {
        assertEquals(120, obj.findFactorial(5));
    }

    @Test
    public void testFactorialOfThree() {
        assertEquals(6, obj.findFactorial(3));
    }

    @Test
    public void testFactorialOfSeven() {
        assertEquals(5040, obj.findFactorial(7));
    }

    @Test
    public void testFactorialOfTen() {
        assertEquals(3628800, obj.findFactorial(10));
    }

    @Test
    public void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class,
                () -> obj.findFactorial(-5));
    }
}