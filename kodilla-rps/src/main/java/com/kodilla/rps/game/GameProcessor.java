package com.kodilla.rps.game;

import com.kodilla.rps.players.Computer;
import com.kodilla.rps.shapes.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameProcessor {

    public final Shapes getChoice(int number) {
        Shapes shape;

        if (number == 1) {
            shape = new Rock();
        } else if (number == 2) {
            shape = new Paper();
        } else if (number == 3) {
            shape = new Scissors();
        } else if (number == 4) {
            shape = new Lizard();
        } else {
            shape = new Spock();
        }
        return shape;
    }

    public final int getSingleMatchResult(Shapes playersOneShapes, Shapes computersShapes) {
        if (playersOneShapes.equals(computersShapes)) {
            return 0;
        } else if (playersOneShapes.getWinsWith().contains(computersShapes)) {
            return 1;
        } else {
            return 2;
        }
    }

    public final Shapes getPlayerChoice(Scanner scanner, String player) {
        System.out.println("Your move:");
        boolean exceptionOccurred = true;
        Shapes playersShapes = getChoice(0);
        while (exceptionOccurred) {
            try {
                playersShapes = getChoice(scanner.nextInt());
                System.out.println(player + " choose: " + playersShapes);
                exceptionOccurred = false;
            } catch (InputMismatchException e) {
                System.out.println("Try choosing numbers between 1-5");
                scanner.next();
            }
        }
        return playersShapes;
    }

    public final Shapes getComputerChoice(Computer playerTwo) {
        Shapes computersChoice = getChoice(playerTwo.random());
        System.out.println(playerTwo + " choose: " + computersChoice);
        return computersChoice;
    }

    public final int getNumberOfRounds(Scanner scanner, String player) {
        System.out.println("Hey! " + player + ", how many rounds you want to play?");
        int howManyRounds = 0;
        boolean exceptionOccurred = true;
        while (exceptionOccurred) {
            try {
                howManyRounds = scanner.nextInt();
                exceptionOccurred = false;
                System.out.println("Let the game begin!");
            } catch (InputMismatchException e) {
                System.out.println("Try with numbers this time!");
                scanner.next();
            }
        }
        return howManyRounds;
    }

    public final String getPlayerOneName(Scanner scanner) {

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
}