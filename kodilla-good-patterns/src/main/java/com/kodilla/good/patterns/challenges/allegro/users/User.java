package com.kodilla.good.patterns.challenges.allegro.users;

public class User {
    private final String firstname;
    private final String surname;
    private final String nickname;

    public User(String firstname, String surname, String nickname) {
        this.firstname = firstname;
        this.surname = surname;
        this.nickname = nickname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }
}
