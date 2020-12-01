package com.kodilla.rps.game;

import com.kodilla.rps.display.Display;
import com.kodilla.rps.players.Computer;
import com.kodilla.rps.players.Player;
import com.kodilla.rps.shapes.Shapes;

import java.util.Scanner;

public class GameEngine {

    public final Computer playerTwo = new Computer(new Player("Computer"));
    public String playerOne;
    Scanner scanner = new Scanner(System.in);
    GameNarrator narrator = new GameNarrator();
    GameProcessor processor = new GameProcessor();
    Display display = new Display();
    private boolean end = false;
    private int playerResult = 0;
    private int computerResult = 0;

    public final void play() {
        narrator.printStartScreen();
        playerOne = processor.getPlayerOneName(scanner);
        narrator.printRulesScreen();
        narrator.printLaunchMenu();

        while (!end) {
            int howManyRounds = processor.getNumberOfRounds(scanner, playerOne);
            for (int round = 0; round < howManyRounds; round++) {
                Shapes playerOneChoice = processor.getPlayerChoice(scanner, playerOne);
                Shapes playerTwoChoice = processor.getComputerChoice(playerTwo);
                int singleMatchResult = processor.getSingleMatchResult(playerOneChoice, playerTwoChoice);

                switch (singleMatchResult) {
                    case 1:
                        playerResult++;
                        break;
                    case 2:
                        computerResult++;
                }

                display.displaySingleMatchResult(singleMatchResult);
                narrator.printScore(playerResult, computerResult);
            }
            display.displayFinalResult(playerResult, computerResult);
            narrator.printEndScreen();

            char newOrQuit = scanner.next().charAt(0);

            switch (newOrQuit) {
                case 'x':
                    end = true;
                    break;
                case 'n':
                    playerResult = 0;
                    computerResult = 0;
            }
        }
    }
}
