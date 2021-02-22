package com.kodilla.sudoku.logic;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.data.BlockIndex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.kodilla.sudoku.logic.SudokuSolver.EMPTY;

public class PossibleNumberFinder {
    private static final BlockIndex blockIndex = new BlockIndex();
    private final SudokuBoard board;

    public PossibleNumberFinder(SudokuBoard board) {
        this.board = board;
    }

    public List<Integer> findPossibleInARow(int row, int col) {
        List<Integer> possibleNumbersInARow = new ArrayList<>();
        for (int i = SudokuSolver.MIN_INDEX; i < SudokuSolver.MAX_INDEX; i++) {
            if ((board.getBoard().get(row).getElement(i).getNumber() == EMPTY) && (i != col)) {
                possibleNumbersInARow = Stream.concat(possibleNumbersInARow.stream(), board.getBoard().get(row).getElement(i).getNumbers().stream())
                        .distinct()
                        .collect(Collectors.toList());
            }
        }
        return possibleNumbersInARow;
    }

    public List<Integer> findPossibleInAColumn(int col, int row) {
        List<Integer> possibleNumbersInAColumn = new ArrayList<>();
        for (int i = SudokuSolver.MIN_INDEX; i < SudokuSolver.MAX_INDEX; i++) {
            if ((board.getBoard().get(i).getElement(col).getNumber() == EMPTY) && (i != row)) {
                possibleNumbersInAColumn = Stream.concat(possibleNumbersInAColumn.stream(), board.getBoard().get(i).getElement(col).getNumbers().stream())
                        .distinct()
                        .collect(Collectors.toList());
            }
        }
        return possibleNumbersInAColumn;
    }

    public List<Integer> findPossibleInABlock(int row, int col) {
        List<Integer> possibleNumbersInABlock = new ArrayList<>();
        int minRow = blockIndex.findBlockMinIndex(row);
        int maxRow = blockIndex.findBlockMaxIndex(row);
        int minColumn = blockIndex.findBlockMinIndex(col);
        int maxColumn = blockIndex.findBlockMaxIndex(col);

        for (int n = minRow; n < maxRow; n++) {
            for (int m = minColumn; m < maxColumn; m++) {
                if ((board.getBoard().get(n).getElement(m).getNumber() == EMPTY) && (n != row || m != col)) {
                    possibleNumbersInABlock = Stream.concat(possibleNumbersInABlock.stream(), board.getBoard().get(n).getElement(m).getNumbers().stream())
                            .distinct()
                            .collect(Collectors.toList());
                }
            }
        }
        return possibleNumbersInABlock;
    }
}

