package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {

    LargestNumber obj = new LargestNumber();

    @Test
    public void testFirstNumberLargest() {
        assertEquals(30, obj.findLargest(30, 20, 10));
    }

    @Test
    public void testSecondNumberLargest() {
        assertEquals(50, obj.findLargest(10, 50, 20));
    }

    @Test
    public void testThirdNumberLargest() {
        assertEquals(90, obj.findLargest(10, 20, 90));
    }

    @Test
    public void testAllNumbersEqual() {
        assertEquals(5, obj.findLargest(5, 5, 5));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-2, obj.findLargest(-5, -2, -8));
    }
}