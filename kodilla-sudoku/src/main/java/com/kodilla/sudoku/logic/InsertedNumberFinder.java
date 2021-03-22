package com.kodilla.sudoku.logic;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.data.BlockIndex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.kodilla.sudoku.logic.SudokuSolver.*;

public class InsertedNumberFinder {

    private static final BlockIndex blockIndex = new BlockIndex();
    private final SudokuBoard board;

    public InsertedNumberFinder(SudokuBoard board) {
        this.board = board;
    }

    public List<Integer> findInARow(int row) {
        final List<Integer> numbersInARow = new ArrayList<>();
        for (int col = MIN_INDEX; col < MAX_INDEX; col++) {
            if ((board.getBoard().get(row).getElement(col).getNumber() != EMPTY) && (!numbersInARow.contains(board.getBoard().get(row).getElement(col).getNumber()))) {
                numbersInARow.add(board.getBoard().get(row).getElement(col).getNumber());
            }
        }
        return numbersInARow;
    }

    public List<Integer> findInAColumn(int col) {
        final List<Integer> numbersInAColumn = new ArrayList<>();
        for (int row = MIN_INDEX; row < MAX_INDEX; row++) {
            if ((board.getBoard().get(row).getElement(col).getNumber() != EMPTY) && (!numbersInAColumn.contains(board.getBoard().get(row).getElement(col).getNumber()))) {
                numbersInAColumn.add(board.getBoard().get(row).getElement(col).getNumber());
            }
        }
        return numbersInAColumn;
    }

    public List<Integer> findInABlock(int row, int col) {
        final List<Integer> numbersInABlock = new ArrayList<>();
        int minRow = blockIndex.findBlockMinIndex(row);
        int maxRow = blockIndex.findBlockMaxIndex(row);
        int minColumn = blockIndex.findBlockMinIndex(col);
        int maxColumn = blockIndex.findBlockMaxIndex(col);

        for (int n = minRow; n < maxRow; n++) {
            for (int m = minColumn; m < maxColumn; m++) {
                if ((board.getBoard().get(n).getElement(m).getNumber() != EMPTY) && (!numbersInABlock.contains(board.getBoard().get(n).getElement(m).getNumber()))) {
                    numbersInABlock.add(board.getBoard().get(n).getElement(m).getNumber());
                }
            }
        }
        return numbersInABlock;
    }

    public List<Integer> findNumbers(int row, int col) {
        return Stream.concat(Stream.concat(findInARow(row).stream(), findInAColumn(col).stream()), findInABlock(row, col).stream())
                .distinct()
                .collect(Collectors.toList());
    }


}
