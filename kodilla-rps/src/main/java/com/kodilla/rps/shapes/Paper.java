package com.kodilla.rps.shapes;

import java.util.ArrayList;
import java.util.List;

public class Paper implements Shape {

    private static final List<Shape> LOSING_SHAPES = new ArrayList<>();

    static {
        LOSING_SHAPES.add(new Rock());
        LOSING_SHAPES.add(new Spock());
    }

    @Override
    public final List<Shape> getWinsWith() {
        return new ArrayList<>(LOSING_SHAPES);
    }

    @Override
    public String toString() {
        return "PAPER";
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().equals(getClass());
    }
}