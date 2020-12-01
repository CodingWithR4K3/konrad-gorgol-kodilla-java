package com.kodilla.rps.shapes;

import java.util.ArrayList;
import java.util.List;

public class Scissors implements Shape {

    @Override
    public final List<Shape> getWinsWith() {
        List<Shape> scissorsWinWith = new ArrayList<>();
        scissorsWinWith.add(new Paper());
        scissorsWinWith.add(new Lizard());
        return scissorsWinWith;
    }

    @Override
    public final String toString() {
        return "SCISSORS";
    }

    @Override
    public final boolean equals(Object obj) {
        return obj.getClass().equals(getClass());
    }
}
