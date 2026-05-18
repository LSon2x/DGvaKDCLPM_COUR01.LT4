package org.example;

public class Rectangle {

    public static double perimeter(double length, double width) {

        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Chiều dài và chiều rộng phải > 0");
        }

        return (length + width) * 2;
    }
}