package com.kodilla.sudoku.board;

public class SudokuBuilder {

    public SudokuBoard build(String input) {
        SudokuBoard sudokuBoard = new SudokuBoard();
        int numberOfDigitsInserted = input.length() / 3;
        for (int index = 0; index < numberOfDigitsInserted; index++) {
            sudokuBoard.setElement(Character.getNumericValue(input.charAt(0)), Character.getNumericValue(input.charAt(1)), Character.getNumericValue(input.charAt(2)));
            input = input.substring(3);
        }
        return sudokuBoard;
    }
}
