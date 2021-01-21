package com.kodilla.patterns.strategy.social;

public class ZGeneration extends User {

    public ZGeneration(String name, String surname) {
        super(name, surname);
        this.socialPublisher = new SnapchatPublisher();
    }
}
