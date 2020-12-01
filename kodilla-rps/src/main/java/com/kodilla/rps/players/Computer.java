package com.kodilla.rps.players;

import java.util.Random;

public class Computer {
    private static final Random GENERATOR = new Random();
    private final Player computerName;

    public Computer(Player computerName) {
        this.computerName = computerName;
    }

    public final int random() {

        int random = GENERATOR.nextInt(5);
        return random + 1;
    }

    @Override
    public String toString() {
        return "" + computerName;
    }
}
