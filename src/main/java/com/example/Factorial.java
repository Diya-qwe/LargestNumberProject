package com.example;

public class Factorial {

    public int findFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Factorial is not defined for negative numbers"
            );
        }

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();

        int n = 5;
        System.out.println("Factorial of " + n + " = "
                + obj.findFactorial(n));
    }
}