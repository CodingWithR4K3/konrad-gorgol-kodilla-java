package com.kodilla.patterns.strategy.social;

public class Millenials extends User {

    public Millenials(String name, String surname) {
        super(name, surname);
        this.socialPublisher = new FacebookPublisher();
    }
}
