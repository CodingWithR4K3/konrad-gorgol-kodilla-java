package com.kodilla.rps.shapes;

import java.util.ArrayList;

public class Lizard implements Shape {

    private final ArrayList<String> winsWith;
    private final ArrayList<String> losesWith;

    public Lizard() {

        winsWith = new ArrayList<>();
        losesWith = new ArrayList<>();

        winsWith.add("Paper");
        winsWith.add("Spock");

        losesWith.add("Scissors");
        losesWith.add("Rock");
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
        return "Lizard";
    }

    @Override
    public String toString() {
        return "Lizard";
    }
}