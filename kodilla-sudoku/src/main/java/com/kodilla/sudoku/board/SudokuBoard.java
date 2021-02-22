package com.kodilla.sudoku.board;

import com.kodilla.sudoku.data.SudokuElement;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard extends Prototype<SudokuBoard> {

    public final static int MAX_INDEX = 9;
    public final static int MIN_INDEX = 0;
    private List<SudokuRow> board = new ArrayList<>();

    public SudokuBoard() {
        for (int row = MIN_INDEX; row < MAX_INDEX; row++) {
            board.add(new SudokuRow());
        }
    }

    public List<SudokuRow> getBoard() {
        return board;
    }

    public void setElement(int number, int row, int col) {
        board.get(row - 1).getElement(col - 1).setNumber(number);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = MIN_INDEX; row < MAX_INDEX; row++) {
            result.append("  ---   ---   ---   ---   ---   ---   ---   ---   ---\n");
            result.append("|");
            for (int col = MIN_INDEX; col < MAX_INDEX; col++) {
                if (board.get(row).getElement(col).getNumber() == -1) {
                    result.append("     ");
                } else {
                    result.append("  ").append(board.get(row).getElement(col).getNumber()).append("  ");
                }
                result.append("|");
            }
            result.append("\n");
        }
        result.append("  ---   ---   ---   ---   ---   ---   ---   ---   ---");
        return result.toString();
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedBoard = super.clone();
        clonedBoard.board = new ArrayList<>();
        for (SudokuRow row : board) {
            SudokuRow clonedRow = new SudokuRow();
            int col = 0;
            for (SudokuElement element : row.getRow()) {
                clonedRow.getRow().get(col).setNumber(element.getNumber());
                List<Integer> clonedNumbers = new ArrayList<>(element.getNumbers());
                clonedRow.getRow().get(col).setNumbers(clonedNumbers);
                col++;
            }
            clonedBoard.getBoard().add(clonedRow);
        }
        return clonedBoard;
    }
}