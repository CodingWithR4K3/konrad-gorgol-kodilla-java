package com.kodilla.sudoku;

import com.kodilla.sudoku.board.BoardStack;
import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.board.SudokuBuilder;
import com.kodilla.sudoku.game.GameRunner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SudokuGameTestSuite {

    public final static int MAX_INDEX = 9;
    public final static int MIN_INDEX = 0;

    @Test
    public void testSudokuOneAnswer() {
        SudokuBuilder sudokuBoardBuilder = new SudokuBuilder();
        SudokuBoard sudokuBoard = sudokuBoardBuilder.build("113217319424528533635738643246851959564467472775177982886391293697");
        GameRunner sudokuRunner = new GameRunner();
        BoardStack boardStack = sudokuRunner.run(sudokuBoard);

        SudokuBoard solvedBoard = boardStack.getBoardStack().peek();
        System.out.println(solvedBoard);
        SudokuBoard completeBoard = sudokuBoardBuilder.build("41181211371491551" +
                "6217618319721" +
                "6229234242253268275" +
                "2812923133253383463513693773843" +
                "9941542643144445246747348849" +
                "851252453654355756557158959161762363" +
                "56486596646726866957147287" +
                "337477567617797827968198278328418588" +
                "6387488589391192293994595496697898799");

        compareNumbersWithinBoard(solvedBoard, completeBoard);
        Assertions.assertEquals(1, boardStack.getBoardStack().size());
    }

    private void compareNumbersWithinBoard(SudokuBoard solvedBoard, SudokuBoard completeBoard) {
        for (int index1 = MIN_INDEX; index1 < MAX_INDEX; index1++) {
            for (int index2 = MIN_INDEX; index2 < MAX_INDEX; index2++) {
                int actualNumber = solvedBoard.getBoard().get(index1).getElement(index2).getNumber();
                int expectedNumber = completeBoard.getBoard().get(index1).getElement(index2).getNumber();

                Assertions.assertEquals(expectedNumber, actualNumber);
            }
        }
    }
}
