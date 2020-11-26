package com.kodilla.rps;

import com.kodilla.rps.round.MainRound;
import com.kodilla.rps.round.Round;
import com.kodilla.rps.shapes.*;

import java.util.ArrayList;
import java.util.Random;

public class Program {

    public static int playerOnePoints = 0;
    public static int playerTwoPoints = 0;
    static String playerName;
    static int numberOfRoundsToPlay;
    private final ArrayList<Round> rounds = new ArrayList<>();
    private int currentRoundNumber = 1;

    public static void endGame() {
        System.out.println("Quitting...Goodbye!😁");
        System.exit(0);
    }

    public static int compareFigures(Shape shape, Shape shape2) {
        int result = 0;

        if (shape.getWinsWith().contains(shape2.getName())) {
            result = 1;
        }
        if (shape.getLosesWith().contains(shape2.getName())) {
            result = -1;
        }
        if (shape.getName().equals(shape2.getName())) {
            result = 0;
        }
        return result;
    }

    public static Shape generateClassicOpponentMove() {
        Random random = new Random();
        Shape returnShape = null;
        int randomNumber = random.nextInt(3) + 1;

        switch (randomNumber) {
            case 1: {
                returnShape = new Rock();
                break;
            }
            case 2: {
                returnShape = new Scissors();
                break;
            }
            case 3: {
                returnShape = new Paper();
                break;
            }
        }

        return returnShape;
    }

    public static Shape generateUnfairOpponentMove(Shape chosenFigure) {
        Random random = new Random();
        Shape returnFigure = null;

        if (chosenFigure.getClass().equals(Rock.class)) {
            int randomNumber = random.nextInt(5) + 1;

            switch (randomNumber) {
                case 1: {
                    returnFigure = new Paper();
                    break;
                }
                case 2: {
                    returnFigure = new Rock();
                    break;
                }
                case 3: {
                    returnFigure = new Scissors();
                    break;
                }
                case 4: {
                    returnFigure = new Lizard();
                    break;
                }
                case 5: {
                    returnFigure = new Spock();
                    break;
                }
            }
        }

        if (chosenFigure.getClass().equals((Paper.class))) {
            int randomNumber = random.nextInt(5) + 1;
            switch (randomNumber) {

                case 1: {
                    returnFigure = new Paper();
                    break;
                }
                case 2: {
                    returnFigure = new Rock();
                    break;
                }
                case 3: {
                    returnFigure = new Scissors();
                    break;
                }
                case 4: {
                    returnFigure = new Lizard();
                    break;
                }
                case 5: {
                    returnFigure = new Spock();
                    break;
                }
            }
        }

        if (chosenFigure.getClass().equals(Scissors.class)) {
            int randomNumber = random.nextInt(5) + 1;
            switch (randomNumber) {

                case 1: {
                    returnFigure = new Rock();
                    break;
                }
                case 2: {
                    returnFigure = new Paper();
                    break;
                }
                case 3: {
                    returnFigure = new Scissors();
                    break;
                }
                case 4: {
                    returnFigure = new Lizard();
                    break;
                }
                case 5: {
                    returnFigure = new Spock();
                    break;
                }

            }
        }
        if (chosenFigure.getClass().equals(Lizard.class)) {
            int randomNumber = random.nextInt(5) + 1;
            switch (randomNumber) {

                case 1: {
                    returnFigure = new Rock();
                    break;
                }
                case 2: {
                    returnFigure = new Paper();
                    break;
                }
                case 3: {
                    returnFigure = new Scissors();
                    break;
                }
                case 4: {
                    returnFigure = new Lizard();
                    break;
                }
                case 5: {
                    returnFigure = new Spock();
                    break;
                }

            }
        }

        if (chosenFigure.getClass().equals(Spock.class)) {
            int randomNumber = random.nextInt(5) + 1;
            switch (randomNumber) {

                case 1: {
                    returnFigure = new Rock();
                    break;
                }
                case 2: {
                    returnFigure = new Paper();
                    break;
                }
                case 3: {
                    returnFigure = new Scissors();
                    break;
                }
                case 4: {
                    returnFigure = new Lizard();
                    break;
                }
                case 5: {
                    returnFigure = new Spock();
                    break;
                }

            }
        }
        return returnFigure;

    }

    public static void afterRound(int compareResult) {

        switch (compareResult) {

            case 1: {
                System.out.println("You won this round!");
                Program.playerOnePoints += 1;
                break;
            }
            case 0: {
                System.out.println("We have a draw");
                break;
            }
            case -1: {
                System.out.println("You lost...pathetic");
                Program.playerTwoPoints += 1;
                break;
            }
        }
    }

    public void beginGame() {

        playerOnePoints = 0;
        playerTwoPoints = 0;
        playerName = Narrator.getUserName();
        int gameMode = Narrator.getGameMode();
        numberOfRoundsToPlay = Narrator.getNumberOfRounds();


        //TODO Tutaj bedą jeszcze tryby
        switch (gameMode) {

            case 1: {
                for (int index = 1; index <= numberOfRoundsToPlay; index++) {
                    rounds.add(new MainRound(index));
                }
                Narrator.showInstructionsMain();
                break;
            }
        }

        Narrator.showGameInfo();

        while (currentRoundNumber <= numberOfRoundsToPlay) {
            rounds.get(currentRoundNumber - 1).startRound();
            currentRoundNumber++;
        }

        Narrator.showResults();
    }
}