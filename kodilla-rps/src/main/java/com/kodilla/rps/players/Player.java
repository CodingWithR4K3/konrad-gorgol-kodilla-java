package com.kodilla.rps.players;

public class Player {

    private final String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public final String toString() {
        return "" + playerName;
    }
}