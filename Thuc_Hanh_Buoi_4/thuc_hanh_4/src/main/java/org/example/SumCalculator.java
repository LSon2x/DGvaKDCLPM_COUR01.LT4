package org.example;

public class SumCalculator {

    public static int sum(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("n must be >= 1");
        }

        int s = 0;

        for (int i = 1; i <= n; i++) {
            s += i;
        }

        return s;
    }
}