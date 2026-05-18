package org.example;

public class QuadraticEquation {

    public static String solve(double a, double b, double c) {

        if(a == 0) {
            throw new IllegalArgumentException("a phải khác 0");
        }

        double delta = b * b - 4 * a * c;

        if(delta > 0) {

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            return "2 nghiệm: " + x1 + ", " + x2;

        } else if(delta == 0) {

            double x = -b / (2 * a);

            return "Nghiệm kép: " + x;

        } else {
            return "Vô nghiệm";
        }
    }
}