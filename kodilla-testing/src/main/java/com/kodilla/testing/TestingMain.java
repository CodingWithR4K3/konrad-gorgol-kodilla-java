package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int addResult = 20;
        int subResult = 50;

        if (addResult == calculator.addCal(15,5)) {
            System.out.println("Addition works!");
        } else {
            System.out.println("Addition failed!");
        }

        if (subResult == calculator.subtractCal(100,50)) {
            System.out.println("Subtraction works!");
        } else {
            System.out.println("Subtraction failed!");
        }

    }
}
