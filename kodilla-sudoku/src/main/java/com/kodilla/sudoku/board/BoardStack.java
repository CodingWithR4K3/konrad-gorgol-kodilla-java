package com.kodilla.sudoku.board;

import java.util.ArrayDeque;
import java.util.Deque;

public class BoardStack {

    private final Deque<SudokuBoard> boardStack;

    public BoardStack() {
        this.boardStack = new ArrayDeque<>();
    }

    public void addBoard(SudokuBoard board) {

        SudokuBoard clonedSudokuBoard = null;
        try {
            clonedSudokuBoard = board.deepCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        boardStack.push(clonedSudokuBoard);
    }

    public Deque<SudokuBoard> getBoardStack() {
        return boardStack;
    }
}
