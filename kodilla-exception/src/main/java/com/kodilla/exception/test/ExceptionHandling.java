package com.kodilla.exception.test;

public class ExceptionHandling {

    double x;
    double y;

    public ExceptionHandling(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String probablyIWillThrowExceptionHandler() {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            return secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            System.out.println("Conditions aren't met");
            return "Exception";
        } finally {
            System.out.println("My life is eternal");
        }
    }
}