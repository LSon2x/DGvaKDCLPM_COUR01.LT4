package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest {

    @Test
    void testSum() {
        assertEquals(15,
                SumCalculator.sum(5));
    }

    @Test
    void testSum1() {
        assertEquals(1,
                SumCalculator.sum(1));
    }

    @Test
    void testInvalid() {

        assertThrows(
                IllegalArgumentException.class,
                () -> SumCalculator.sum(0)
        );
    }
}