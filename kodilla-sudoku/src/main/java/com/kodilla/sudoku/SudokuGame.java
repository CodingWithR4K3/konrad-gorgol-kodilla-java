package com.kodilla.sudoku;

import com.kodilla.sudoku.game.GameApproval;
import com.kodilla.sudoku.game.GameFinish;
import com.kodilla.sudoku.game.GameResults;
import com.kodilla.sudoku.game.GameRunner;

public class SudokuGame {

    private static final GameApproval sudokuApproval = new GameApproval();
    private static final GameRunner gameRunner = new GameRunner();
    private static final GameResults gameResults = new GameResults();
    private static final GameFinish gameFinish = new GameFinish();

    public static void main(String[] args) {
        boolean gameFinished = false;
        while (!gameFinished) {
            gameResults.showSudokuResults(gameRunner.run(sudokuApproval.acceptOrReEnter()));
            gameFinished = gameFinish.finishGame();
        }
    }
}
