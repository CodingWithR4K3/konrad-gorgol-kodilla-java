package com.kodilla.rps.shapes;

import java.util.ArrayList;
import java.util.List;

public class Paper implements Shapes {

    @Override
    public final List<Shapes> getWinsWith() {
        List<Shapes> paperWinsWith = new ArrayList<>();
        paperWinsWith.add(new Rock());
        paperWinsWith.add(new Spock());
        return paperWinsWith;
    }

    @Override
    public final String toString() {
        return "PAPER";
    }

    @Override
    public final boolean equals(Object obj) {
        return obj instanceof Paper;
    }
}