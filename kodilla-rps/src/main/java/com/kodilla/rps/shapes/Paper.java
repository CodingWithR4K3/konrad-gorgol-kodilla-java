package com.kodilla.rps.shapes;

import java.util.ArrayList;

public class Paper implements Shape {

    private final ArrayList<String> winsWith;
    private final ArrayList<String> losesWith;

    public Paper() {

        winsWith = new ArrayList<>();
        losesWith = new ArrayList<>();

        winsWith.add("Rock");
        winsWith.add("Spock");

        losesWith.add("Scissors");
        losesWith.add("Lizard");
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
        return "Paper";
    }

    @Override
    public String toString() {
        return "Paper";
    }
}