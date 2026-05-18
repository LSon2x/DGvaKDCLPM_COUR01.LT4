package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeCheckerTest {

    @Test
    void testPrime() {
        assertTrue(PrimeChecker.isPrime(7));
    }

    @Test
    void testNotPrime() {
        assertFalse(PrimeChecker.isPrime(9));
    }

    @Test
    void testLessThan2() {
        assertFalse(PrimeChecker.isPrime(1));
    }

    @Test
    void testPrime2() {
        assertTrue(PrimeChecker.isPrime(2));
    }
}