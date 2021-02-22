package com.kodilla.sudoku.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.kodilla.sudoku.logic.SudokuSolver.EMPTY;

public class SudokuElement {

    private int number;
    private List<Integer> numbers;

    public SudokuElement() {
        this.number = EMPTY;
        numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

    public void removeNumber(Integer i) {
        numbers.remove(i);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int i) {
        this.number = i;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}