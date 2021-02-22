package com.kodilla.sudoku.board;

public class Prototype<T> implements Cloneable {

    @SuppressWarnings("unchecked")
    @Override
    public T clone() throws CloneNotSupportedException {
        return (T) super.clone();
    }
}
