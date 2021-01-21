package com.kodilla.patterns.strategy.social;

public class User {
    private final String name;
    private final String surname;
    protected SocialPublisher socialPublisher;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getFirstName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
