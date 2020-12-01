package com.kodilla.rps.players;

import java.util.Random;

public class Computer {
    Player computerName;

    public Computer(Player computerName) {
        this.computerName = computerName;
    }

    public final int random() {

        Random generator = new Random();
        int random = generator.nextInt(5);
        return random + 1;
    }

    @Override
    public final String toString() {
        return "" + computerName;
    }
}
