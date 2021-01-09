package com.kodilla.good.patterns.challenges.allegro.services;

import com.kodilla.good.patterns.challenges.allegro.users.User;

public class MailInformationService implements InformationService {

    public void inform(User user) {
        System.out.println("Hello! " + user.getFirstname() + " we are currently processing your order");
    }
}
