package com.kodilla.sudoku.board;

public class SudokuDto {

    private final SudokuBoard board;
    private final int count;
    private final boolean isSolution;

    public SudokuDto(SudokuBoard board, int count, boolean isSolution) {
        this.board = board;
        this.count = count;
        this.isSolution = isSolution;
    }

    public SudokuBoard getBoard() {
        return board;
    }

    public int getCount() {
        return count;
    }

    public boolean isSolution() {
        return isSolution;
    }
}