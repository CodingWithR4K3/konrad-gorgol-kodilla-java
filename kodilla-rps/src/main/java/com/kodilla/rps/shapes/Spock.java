package com.kodilla.rps.shapes;

import java.util.ArrayList;

public class Spock implements Shape {

    private final ArrayList<String> winsWith;
    private final ArrayList<String> losesWith;

    public Spock() {

        winsWith = new ArrayList<>();
        losesWith = new ArrayList<>();

        winsWith.add("Scissors");
        winsWith.add("Rock");

        losesWith.add("Lizard");
        losesWith.add("Paper");
    }

    @Override
    public ArrayList<String> getWinsWith() {
        return winsWith;
    }

    @Override
    public ArrayList<String> getLosesWith() {
        return losesWith;
    }

    public String getName() {
        return "Spock";
    }

    @Override
    public String toString() {
        return "Spock";
    }
}