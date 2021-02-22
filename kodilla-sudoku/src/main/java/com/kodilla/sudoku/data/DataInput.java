package com.kodilla.sudoku.data;

import com.kodilla.sudoku.logic.InputValidator;

import java.util.Scanner;

public class DataInput {

    private static final Scanner scanner = new Scanner(System.in);

    public String inputData() {
        boolean validator = false;
        String input = "";
        while (!validator) {
            System.out.print("Please enter your Sudoku data. \n"
                    + "The number you want to enter (From 1 to 9) \n"
                    + "The row number (From 1 to 9) \n"
                    + "The column number (1 to 9) \n"
                    + "Entries can be entered in one sequence. \n"
                    + "For example, typing 121568762 will enter the number 1 in the cell [2, 1], the number 5 in the cell [6.8] and the number 7 in the cell [6.2].\n"
                    + "Your input:");

            input = scanner.nextLine();
            InputValidator inputValidator = new InputValidator(input);
            validator = inputValidator.validateInput();
        }
        return input;
    }
}
