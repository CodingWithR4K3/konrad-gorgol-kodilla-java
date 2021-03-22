package com.kodilla.sudoku.logic;

import com.kodilla.sudoku.board.SudokuBoard;

import static com.kodilla.sudoku.logic.SudokuSolver.*;

public class FirstEmptyFinder {

    public int findRow(SudokuBoard board) {
        for (int row = MIN_INDEX; row < MAX_INDEX; row++) {
            for (int col = MIN_INDEX; col < MAX_INDEX; col++) {
                if (board.getBoard().get(row).getElement(col).getNumber() == EMPTY) {
                    return row;
                }
            }
        }
        return EMPTY;
    }

    public int findColumn(SudokuBoard board) {
        for (int row = MIN_INDEX; row < MAX_INDEX; row++) {
            for (int col = MIN_INDEX; col < MAX_INDEX; col++) {
                if (board.getBoard().get(row).getElement(col).getNumber() == EMPTY) {
                    return col;
                }
            }
        }
        return EMPTY;
    }
}
