package com.kodilla.sudoku;

import com.kodilla.sudoku.game.GameApproval;
import com.kodilla.sudoku.game.GameFinish;
import com.kodilla.sudoku.game.GameResults;
import com.kodilla.sudoku.game.GameRunner;

public class SudokuGame {

    GameApproval sudokuApproval = new GameApproval();
    GameRunner gameRunner = new GameRunner();
    GameResults gameResults = new GameResults();
    GameFinish gameFinish = new GameFinish();

    public static void main(String[] args) {
        SudokuGame sudokuGame = new SudokuGame();
        sudokuGame.sudokuRunner();
    }

    public void sudokuRunner() {
        boolean gameFinished = false;
        while (!gameFinished) {
            gameResults.showSudokuResults(gameRunner.run(sudokuApproval.acceptOrReEnter()));
            gameFinished = gameFinish.finishGame();
        }
    }
}
