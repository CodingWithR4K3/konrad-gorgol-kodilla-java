package com.kodilla.rps;

import java.util.Scanner;

public class Narrator {

    public int getGameMode() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What game mode do you want to play?");
        int choice = 0;

        while (true) {

            System.out.println("1. Rock Paper Scissors Lizard Spock");

            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    return 1;

                }
            }
        }
    }

    public String getUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock-Paper-Scissors");
        String scannerResult = "";
        while (true) {
            System.out.println("What's your name?");
            scannerResult = scanner.nextLine();
            if (scannerResult.length() < 2) {
                System.out.println("Wrong answer");
            } else {
                return scannerResult;
            }
        }
    }

    public int getNumberOfRounds() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("How many rounds do you want to play?");
            try {
                String scannerResult = scanner.nextLine();
                return Integer.parseInt(scannerResult);
            } catch (Exception e) {
                System.out.println("Incorrect number");
            }
        }
    }

    public void showInstructionsMain() {

        System.out.println("------------------------------");
        System.out.println("Instructions: ");
        System.out.println("Press 1 to use Rock");
        System.out.println("Press 2 to use Paper");
        System.out.println("Press 3 to use Scissors");
        System.out.println("Press 4 to use Lizard");
        System.out.println("Press 5 to use Spock");
        System.out.println("Press X to end the game");
        System.out.println("Press N to start a new game");
        System.out.println("------------------------------");
    }

    public void showResults() {
        Program program = new Program();
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("End of the game.");
        System.out.println("Results: ");
        System.out.println(program.playerName + " got " + program.playerOnePoints + " points.");
        System.out.println("Player two got " + program.playerTwoPoints + " points.");

        if (program.playerOnePoints > program.playerTwoPoints) {
            System.out.println(program.playerName + " won the game!");
        }

        if (program.playerOnePoints < program.playerTwoPoints) {
            System.out.println("Player two won the game!");
        }

        if (program.playerOnePoints == program.playerTwoPoints) {
            System.out.println("The game ended with a draw!");
        }

        System.out.println("------------------------------");
        System.out.println("Do you want to play again? Y/N");
        String scannerResult = scanner.nextLine();

        if (scannerResult.toUpperCase().equals("Y")) {
            System.out.println("Starting new game...");
            program.beginGame();
        } else if (scannerResult.toUpperCase().equals("N")) {
            program.endGame();
        }
    }

    public void showGameInfo() {
        Program program = new Program();
        System.out.println("Name: " + program.playerName);
        System.out.println("Number of rounds you want to play: " + program.numberOfRoundsToPlay);
    }
}