package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialSumTest {

    @Test
    void testFactorial() {
        assertEquals(120,
                FactorialSum.factorial(5));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1,
                FactorialSum.factorial(0));
    }

    @Test
    void testFactorialNegative() {

        assertThrows(
                IllegalArgumentException.class,
                () -> FactorialSum.factorial(-1)
        );
    }

    @Test
    void testSumFactorial() {
        assertEquals(9,
                FactorialSum.sumFactorial(3));
    }
}