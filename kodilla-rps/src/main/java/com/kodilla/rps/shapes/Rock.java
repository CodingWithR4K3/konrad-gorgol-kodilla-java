package com.kodilla.rps.shapes;

import java.util.ArrayList;
import java.util.List;

public class Rock implements Shape {

    @Override
    public List<Shape> getWinsWith() {
        List<Shape> rockWinsWith = new ArrayList<>();
        rockWinsWith.add(new Scissors());
        rockWinsWith.add(new Lizard());
        return rockWinsWith;
    }

    @Override
    public final String toString() {
        return "ROCK";
    }

    @Override
    public final boolean equals(Object obj) {
        return obj.getClass().equals(getClass());
    }
}
