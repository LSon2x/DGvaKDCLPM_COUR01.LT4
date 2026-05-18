package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GCDCalculatorTest {

    @Test
    void testNormal() {
        assertEquals(6,
                GCDCalculator.gcd(12,18));
    }

    @Test
    void testOneZero() {
        assertEquals(5,
                GCDCalculator.gcd(5,0));
    }

    @Test
    void testNegative() {
        assertEquals(4,
                GCDCalculator.gcd(-8,12));
    }
}