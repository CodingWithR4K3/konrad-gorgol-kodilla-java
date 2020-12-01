package com.kodilla.rps.game;

public class GameNarrator {

    private static final String HEADER = "\n--------ROCK, PAPER, SCISSORS, LIZARD, SPOCK--------\n";

    public void printStartScreen() {
        System.out.println(HEADER);
        System.out.println("Please enter your name: ");
    }

    public void printRulesScreen() {
        System.out.println("SCISSORS cuts PAPER");
        System.out.println("PAPER covers ROCK");
        System.out.println("ROCK crushes LIZARD");
        System.out.println("LIZARD poisons SPOCK");
        System.out.println("SPOCK smashes SCISSORS");
        System.out.println("SCISSORS decapitates LIZARD");
        System.out.println("LIZARD eats PAPER");
        System.out.println("PAPER disproves SPOCK");
        System.out.println("SPOCK vaporizes ROCK");
        System.out.println("ROCK crushes SCISSORS");
    }

    public void printLaunchMenu() {

        System.out.println();
        System.out.println(HEADER);
        System.out.println("To play ROCK press --> 1 <--");
        System.out.println("To play PAPER press --> 2 <--");
        System.out.println("To play SCISSORS press --> 3 <--");
        System.out.println("To play LIZARD press ---> 4 <---");
        System.out.println("To play SPOCK press ---> 5 <---");
        System.out.println("If you want to end the game press --> x <--");
        System.out.println("If you want to restart your current game press --> n <--");
        System.out.println(HEADER);
        System.out.println();
    }

    public void printEndScreen() {
        System.out.println("If u want to play another game PRESS ---> n <---");
        System.out.println("If you want to quit PRESS ---> x <---");
    }

    public void printScore(int score1, int score2) {
        System.out.println(score1 + " : " + score2);
    }
}

