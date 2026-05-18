package org.example;

public class FactorialSum {

    public static long factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static long sumFactorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }

        return sum;
    }
}