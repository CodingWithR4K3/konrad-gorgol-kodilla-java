package com.kodilla.rps.shapes;

import java.util.ArrayList;
import java.util.List;

public class Rock implements Shapes {

    @Override
    public List<Shapes> getWinsWith() {
        List<Shapes> rockWinsWith = new ArrayList<>();
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
        return obj instanceof Rock;
    }
}
