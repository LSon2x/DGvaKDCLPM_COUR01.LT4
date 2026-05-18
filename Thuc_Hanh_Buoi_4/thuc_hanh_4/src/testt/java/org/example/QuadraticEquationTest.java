package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {

    @Test
    void testDeltaPositive() {

        String result =
                QuadraticEquation.solve(1,-3,2);

        assertTrue(result.contains("Two solutions"));
    }

    @Test
    void testDeltaZero() {

        String result =
                QuadraticEquation.solve(1,2,1);

        assertTrue(result.contains("Double solution"));
    }

    @Test
    void testDeltaNegative() {

        assertEquals(
                "No solution",
                QuadraticEquation.solve(1,1,1)
        );
    }

    @Test
    void testAEqualsZero() {

        assertThrows(
                IllegalArgumentException.class,
                () -> QuadraticEquation.solve(0,1,1)
        );
    }
}