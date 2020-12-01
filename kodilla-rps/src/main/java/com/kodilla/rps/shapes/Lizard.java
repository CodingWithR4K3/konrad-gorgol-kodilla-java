package com.kodilla.rps.shapes;


import java.util.ArrayList;
import java.util.List;

public class Lizard implements Shapes {

    @Override
    public final List<Shapes> getWinsWith() {
        List<Shapes> lizardWinsWith = new ArrayList<>();
        lizardWinsWith.add(new Spock());
        lizardWinsWith.add(new Paper());
        return lizardWinsWith;
    }

    @Override
    public final String toString() {
        return "LIZARD";
    }

    @Override
    public final boolean equals(Object obj) {
        return obj instanceof Lizard;
    }
}
