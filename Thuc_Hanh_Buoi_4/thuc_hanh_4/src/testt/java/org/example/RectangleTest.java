package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testPerimeterValid() {
        assertEquals(14, Rectangle.perimeter(3,4));
    }

    @Test
    void testPerimeterInvalidLength() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Rectangle.perimeter(-1,4)
        );
    }

    @Test
    void testPerimeterInvalidWidth() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Rectangle.perimeter(3,-4)
        );
    }
}