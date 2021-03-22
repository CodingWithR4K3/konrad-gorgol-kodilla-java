package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.BoardStack;
import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.logic.FirstEmptyFinder;
import com.kodilla.sudoku.logic.SudokuSolver;

public class GameRunner {

    private static final SudokuSolver sudokuSolver = new SudokuSolver();
    private static final FirstEmptyFinder firstEmpty = new FirstEmptyFinder();

    public BoardStack run(SudokuBoard board) {
        BoardStack solvedBoardStack = new BoardStack();
        BoardStack tempBoardStack = new BoardStack();
        BoardStack backtrack = new BoardStack();
        if (sudokuSolver.solve(board).isSolution()) {
            if (sudokuSolver.solve(board).getCount() == 81) {
                solvedBoardStack.addBoard(sudokuSolver.solve(board).getBoard());
                return solvedBoardStack;
            } else {
                board = sudokuSolver.solve(board).getBoard();
                tempBoardStack.addBoard(board);

                do {
                    board = tempBoardStack.getBoardStack().pop();
                    int n = firstEmpty.findRow(board);
                    int m = firstEmpty.findColumn(board);
                    for (int i = 0; i < board.getBoard().get(n).getElement(m).getNumbers().size(); i++) {
                        backtrack.addBoard(board);
                    }
                    for (int i = 0; i < board.getBoard().get(n).getElement(m).getNumbers().size(); i++) {
                        board.getBoard().get(n).getElement(m).setNumber(board.getBoard().get(n).getElement(m).getNumbers().get(i));
                        if (sudokuSolver.solve(board).isSolution()) {
                            sudokuSolver.solve(board);
                            if (sudokuSolver.solve(board).getCount() == 81) {
                                solvedBoardStack.addBoard(board);
                                if (solvedBoardStack.getBoardStack().size() > 1000) {
                                    return solvedBoardStack;
                                }
                            } else {
                                tempBoardStack.addBoard(board);
                            }
                        }
                        board = backtrack.getBoardStack().pop();

                    }
                } while (tempBoardStack.getBoardStack().size() > 0);
            }
        } else {
            System.out.println("Your Sudoku doesn't have the correct solution.\n");
        }

        return solvedBoardStack;
    }
}
