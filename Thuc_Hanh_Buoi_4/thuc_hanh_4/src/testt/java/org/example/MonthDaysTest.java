package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MonthDaysTest {

    @Test
    void test31Days() {
        assertEquals(31,
                MonthDays.getDays(1,2024));
    }

    @Test
    void test30Days() {
        assertEquals(30,
                MonthDays.getDays(4,2024));
    }

    @Test
    void testLeapYear() {
        assertEquals(29,
                MonthDays.getDays(2,2024));
    }

    @Test
    void testNonLeapYear() {
        assertEquals(28,
                MonthDays.getDays(2,2023));
    }

    @Test
    void testInvalidMonth() {

        assertThrows(
                IllegalArgumentException.class,
                () -> MonthDays.getDays(13,2024)
        );
    }
}