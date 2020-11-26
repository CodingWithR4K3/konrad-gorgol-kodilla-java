package com.kodilla.rps.round;

import com.kodilla.rps.Program;
import com.kodilla.rps.shapes.*;

import java.util.Scanner;

public class MainRound implements Round {
    private final int roundNumber;
    private final Scanner roundScanner = new Scanner(System.in);
    private boolean roundEnd = false;

    public MainRound(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    @Override
    public void startRound() {

        System.out.println("------------------------------");
        System.out.println("Starting round number: " + roundNumber);
        while (!roundEnd) {

            System.out.println("Make your move...");
            String move = roundScanner.nextLine();
            Shape playerOneFigure;
            Shape playerTwoFigure;

            switch (move.toUpperCase()) {
                case "N": {
                    System.out.println("Are you sure you want to start a new game? Y/N");
                    String decision = roundScanner.nextLine().toUpperCase();

                    if (decision.equals("Y")) {
                        roundEnd = true;
                        Program program = new Program();
                        program.beginGame();
                    } else if (decision.equals("N")) {
                        continue;
                    } else {
                        System.out.println("Not a valid response");
                    }
                    break;
                }
                case "X": {
                    System.out.println("Are you sure you want to exit? Y/N");
                    String decision = roundScanner.nextLine().toUpperCase();
                    if (decision.equals("Y")) {
                        roundEnd = true;
                        Program.endGame();
                    } else if (decision.equals("N")) {
                        continue;
                    } else {
                        System.out.println("Not a valid response");
                    }
                    break;
                }
                case "1": {
                    System.out.println("------------------------------");
                    System.out.println("You chose Rock");
                    playerOneFigure = new Rock();
                    playerTwoFigure = Program.generateUnfairOpponentMove(playerOneFigure);
                    System.out.println("Opponent chose " + playerTwoFigure);
                    int compareResult = Program.compareFigures(playerOneFigure, playerTwoFigure);

                    CheckRoundEnd(compareResult);

                    System.out.println("Player one points: " + Program.playerOnePoints);
                    System.out.println("Player two points: " + Program.playerTwoPoints);

                    roundEnd = true;
                    break;
                }
                case "2": {
                    System.out.println("------------------------------");
                    System.out.println("You chose Paper");
                    playerOneFigure = new Paper();
                    playerTwoFigure = Program.generateClassicOpponentMove();
                    System.out.println("Opponent chose " + playerTwoFigure);
                    int compareResult = Program.compareFigures(playerOneFigure, playerTwoFigure);

                    CheckRoundEnd(compareResult);

                    System.out.println("Player one points: " + Program.playerOnePoints);
                    System.out.println("Player two points: " + Program.playerTwoPoints);

                    roundEnd = true;
                    break;
                }
                case "3": {
                    System.out.println("------------------------------");
                    System.out.println("You chose Scissors");
                    playerOneFigure = new Scissors();
                    playerTwoFigure = Program.generateClassicOpponentMove();
                    System.out.println("Opponent chose " + playerTwoFigure);
                    int compareResult = Program.compareFigures(playerOneFigure, playerTwoFigure);

                    CheckRoundEnd(compareResult);

                    System.out.println("Player one points: " + Program.playerOnePoints);
                    System.out.println("Player two points: " + Program.playerTwoPoints);

                    roundEnd = true;
                    break;
                }
                case "4": {
                    System.out.println("------------------------------");
                    System.out.println("You chose Lizard");
                    playerOneFigure = new Lizard();
                    playerTwoFigure = Program.generateClassicOpponentMove();
                    System.out.println("Opponent chose " + playerTwoFigure);
                    int compareResult = Program.compareFigures(playerOneFigure, playerTwoFigure);

                    CheckRoundEnd(compareResult);

                    System.out.println("Player one points: " + Program.playerOnePoints);
                    System.out.println("Player two points: " + Program.playerTwoPoints);

                    roundEnd = true;
                    break;
                }
                case "5": {
                    System.out.println("------------------------------");
                    System.out.println("You chose Spock");
                    playerOneFigure = new Spock();
                    playerTwoFigure = Program.generateClassicOpponentMove();
                    System.out.println("Opponent chose " + playerTwoFigure);
                    int compareResult = Program.compareFigures(playerOneFigure, playerTwoFigure);

                    CheckRoundEnd(compareResult);

                    System.out.println("Player one points: " + Program.playerOnePoints);
                    System.out.println("Player two points: " + Program.playerTwoPoints);

                    roundEnd = true;
                    break;
                }
            }
        }
    }

    @Override
    public void CheckRoundEnd(int compareResult) {
        Program.afterRound(compareResult);
    }
}