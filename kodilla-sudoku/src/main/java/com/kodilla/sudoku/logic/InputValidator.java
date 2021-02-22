package com.kodilla.sudoku.logic;

import java.util.ArrayList;
import java.util.List;

public class InputValidator {

    private final String input;

    public InputValidator(String input) {
        this.input = input;
    }

    public boolean validateIfDivisibleByThree() {
        if (input.length() % 3 != 0) {
            System.out.println("The entered string of characters does not consist of 3-digit entries\n");
            return false;
        }
        return true;
    }

    public boolean validateIfCorrectRange() {
        String correctRange = "123456789";
        for (int i = 0; i < input.length(); i++) {
            if (!correctRange.contains(Character.toString(input.charAt(i)))) {
                System.out.println("Invalid entry. All characters should be between 1 and 9\n");
                return false;
            }
        }
        return true;
    }

    public boolean validateDistinctNumbersInARow() {
        List<String> numbersInRow = new ArrayList<>();
        for (int i = 0; i < input.length(); i += 3) {
            numbersInRow.add(input.substring(i, i + 2));
        }

        if (numbersInRow.size() != numbersInRow.stream().distinct().count()) {
            System.out.println("Invalid entry. The numbers in the same row are repeated.\n");
            return false;
        }
        return true;
    }

    public boolean validateDistinctNumbersInAColumn() {
        List<String> numbersInColumn = new ArrayList<>();
        for (int i = 0; i < input.length(); i += 3) {
            numbersInColumn.add("" + input.charAt(i) + input.charAt(i + 2));
        }

        if (numbersInColumn.size() != numbersInColumn.stream().distinct().count()) {
            System.out.println("Invalid entry. The numbers in the same column are repeated.\n");
            return false;
        }
        return true;
    }

    public boolean validateDistinctNumbersInABlock() {
        List<Integer> block1 = new ArrayList<>();
        List<Integer> block2 = new ArrayList<>();
        List<Integer> block3 = new ArrayList<>();
        List<Integer> block4 = new ArrayList<>();
        List<Integer> block5 = new ArrayList<>();
        List<Integer> block6 = new ArrayList<>();
        List<Integer> block7 = new ArrayList<>();
        List<Integer> block8 = new ArrayList<>();
        List<Integer> block9 = new ArrayList<>();

        for (int i = 0; i < input.length(); i += 3) {
            var numericValue = Character.getNumericValue(input.charAt(i + 1));
            var numericValue1 = 0;
            numericValue1 = Character.getNumericValue(input.charAt(i + 2));
            if (numericValue <= 3 && numericValue1 <= 3) {
                block1.add(Character.getNumericValue(input.charAt(i)));
            } else if (numericValue <= 3 && numericValue1 <= 6) {
                block2.add(Character.getNumericValue(input.charAt(i)));
            } else if (numericValue <= 3) {
                block3.add(Character.getNumericValue(input.charAt(i)));
            } else if (numericValue <= 6 && numericValue1 <= 3) {
                block4.add(Character.getNumericValue(input.charAt(i)));
            } else if (numericValue <= 6 && numericValue1 <= 6) {
                block5.add(Character.getNumericValue(input.charAt(i)));
            } else if (numericValue <= 6) {
                block6.add(Character.getNumericValue(input.charAt(i)));
            } else if (numericValue1 <= 3) {
                block7.add(Character.getNumericValue(input.charAt(i)));
            } else if (numericValue1 <= 6) {
                block8.add(Character.getNumericValue(input.charAt(i)));
            } else {
                block9.add(Character.getNumericValue(input.charAt(i)));
            }
        }

        if (block1.size() != block1.stream().distinct().count() || block2.size() != block2.stream().distinct().count()
                || block3.size() != block3.stream().distinct().count() || block4.size() != block4.stream().distinct().count()
                || block5.size() != block5.stream().distinct().count() || block6.size() != block6.stream().distinct().count()
                || block7.size() != block7.stream().distinct().count() || block8.size() != block8.stream().distinct().count()
                || block9.size() != block9.stream().distinct().count()) {

            System.out.println("Invalid entry. The numbers in the same block are repeated.\n");
            return false;
        }

        return true;
    }

    public boolean validateInput() {
        return validateIfDivisibleByThree() && validateIfCorrectRange()
                && validateDistinctNumbersInARow() && validateDistinctNumbersInAColumn() && validateDistinctNumbersInABlock();
    }

}
