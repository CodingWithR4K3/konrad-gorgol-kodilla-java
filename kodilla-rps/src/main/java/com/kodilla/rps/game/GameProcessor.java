package com.kodilla.rps.game;

import com.kodilla.rps.players.Computer;
import com.kodilla.rps.shapes.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameProcessor {

    public Shape getChoice(int number) {

        switch (number) {
            case 1:
                return new Rock();
            case 2:
                return new Paper();
            case 3:
                return new Scissors();
            case 4:
                return new Lizard();
            case 5:
                return new Spock();
            default:
                throw new InputMismatchException();
        }
    }


    public int getSingleMatchResult(Shape playersOneShape, Shape computersShape) {
        if (playersOneShape.equals(computersShape)) {
            return 0;
        } else if (playersOneShape.getWinsWith().contains(computersShape)) {
            return 1;
        } else {
            return 2;
        }
    }

    public Shape getPlayerChoice(Scanner scanner, String player) {
        System.out.println("Your move:");
        boolean exceptionOccurred = true;
        Shape playersShape = getChoice(5);
        while (exceptionOccurred) {
            try {
                playersShape = getChoice(scanner.nextInt());
                System.out.println(player + " choose: " + playersShape);
                exceptionOccurred = false;
            } catch (InputMismatchException e) {
                showError(scanner, "Try choosing numbers between 1-5");
            }
        }
        return playersShape;
    }

    public Shape getComputerChoice(Computer playerTwo) {
        Shape computersChoice = getChoice(playerTwo.random());
        System.out.println(playerTwo + " choose: " + computersChoice);
        return computersChoice;
    }

    public int getNumberOfRounds(Scanner scanner, String player) {
        System.out.println("Hey! " + player + ", how many rounds you want to play?");
        int howManyRounds = 0;
        boolean exceptionOccurred = true;
        while (exceptionOccurred) {
            try {
                howManyRounds = scanner.nextInt();
                if (howManyRounds <= 0) {
                    showError(scanner, "You can use only numbers staring from 0");
                }
                exceptionOccurred = false;
                System.out.println("Let the game begin!");
            } catch (InputMismatchException e) {
                showError(scanner, "You can use only numbers staring from 0");
            }
        }
        return howManyRounds;
    }

    public String getPlayerOneName(Scanner scanner) {

        String playerOneName;
        while (true) {
            playerOneName = scanner.nextLine();
            if (playerOneName.length() < 2) {
                System.out.println("It's not a name!");
                System.out.println("You can't fool me!");
                System.out.println("Try again!");
            } else {
                return playerOneName;
            }
        }
    }

    private void showError(Scanner scanner, String errorMessage) {
        System.out.println(errorMessage);
        scanner.nextLine();
    }
}