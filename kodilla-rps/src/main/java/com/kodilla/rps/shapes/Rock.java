package com.kodilla.rps.shapes;

import java.util.ArrayList;

public class Rock implements Shape {

    private final ArrayList<String> winsWith;
    private final ArrayList<String> losesWith;

    public Rock() {

        winsWith = new ArrayList<>();
        losesWith = new ArrayList<>();

        winsWith.add("Lizard");
        winsWith.add("Scissors");

        losesWith.add("Paper");
        losesWith.add("Spock");
    }

    @Override
    public ArrayList<String> getWinsWith() {
        return winsWith;
    }

    @Override
    public ArrayList<String> getLosesWith() {
        return losesWith;
    }

    @Override
    public String toString() {
        return "Rock";
    }

    @Override
    public String getName() {
        return "Rock";
    }
}