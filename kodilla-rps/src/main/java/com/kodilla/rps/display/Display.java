package com.kodilla.rps.display;

public class Display {

    public final void displaySingleMatchResult(int singleResult) {
        if (singleResult == 0) {
            System.out.println("-------------------------");
            System.out.println("It's a TIE!");
            System.out.println("-------------------------");
        } else if (singleResult == 1) {
            System.out.println("-------------------------");
            System.out.println("You WIN!");
            System.out.println("-------------------------");
        } else {
            System.out.println("-------------------------");
            System.out.println("You LOOSE!");
            System.out.println("-------------------------");
        }
    }

    public final void displayFinalResult(int playerResult, int computerResult) {
        if (playerResult > computerResult) {
            System.out.println("-------------------------");
            System.out.println("\nYou've vanquished your enemy!\n");
            System.out.println("-------------------------");
        } else if (playerResult == computerResult) {
            System.out.println("-------------------------");
            System.out.println("\nYour equal to computer!\n");
            System.out.println("-------------------------");
        } else {
            System.out.println("-------------------------");
            System.out.println("\nPathetic....you lost!\n");
            System.out.println("-------------------------");

        }
    }
}
