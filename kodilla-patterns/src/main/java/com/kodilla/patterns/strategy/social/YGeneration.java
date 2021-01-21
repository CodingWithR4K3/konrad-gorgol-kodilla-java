package com.kodilla.patterns.strategy.social;

public class YGeneration extends User {

    public YGeneration(String name, String surname) {
        super(name, surname);
        this.socialPublisher = new TwitterPublisher();
    }
}
