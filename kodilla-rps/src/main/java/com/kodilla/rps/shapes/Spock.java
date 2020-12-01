package com.kodilla.rps.shapes;

import java.util.ArrayList;
import java.util.List;

public class Spock implements Shape {

    @Override
    public final List<Shape> getWinsWith() {
        List<Shape> spockWinsWith = new ArrayList<>();
        spockWinsWith.add(new Scissors());
        spockWinsWith.add(new Rock());
        return spockWinsWith;
    }

    @Override
    public final String toString() {
        return "SPOCK";
    }

    @Override
    public final boolean equals(Object obj) {
        return obj.getClass().equals(getClass());
    }
}