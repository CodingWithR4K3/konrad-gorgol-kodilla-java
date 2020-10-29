package com.kodilla;

public class EuclidAlgorithm {
    public static void main(String[] args) {

        int a = 1700;
        int b = 400;

        System.out.print("Greatest common divisor of an integer: " + a + " and " + b + ";");

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        System.out.print(" equals " + a);
    }
}

