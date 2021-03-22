package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.board.SudokuBuilder;
import com.kodilla.sudoku.data.DataInput;

import java.util.Scanner;

public class GameApproval {

    private static final DataInput dataInput = new DataInput();
    private static final Scanner scanner = new Scanner(System.in);
    private static final SudokuBuilder sudokuBoardBuilder = new SudokuBuilder();

    public SudokuBoard acceptOrReEnter() {
        String decision;
        SudokuBoard board;
        do {
            board = sudokuBoardBuilder.build(dataInput.inputData());
            System.out.println("\nSudoku board according to the data you entered:\n" + board + "\n");
            System.out.println("If you want to enter data again press ENTER.\n"
                    + "If you approve this Sudoku and want to solve it, type 'SUDOKU' and press ENTER\n");
            decision = scanner.nextLine();

        } while (!decision.equals("SUDOKU") && !decision.equals("sudoku") && !decision.equals("Sudoku"));

        return board;
    }
}
