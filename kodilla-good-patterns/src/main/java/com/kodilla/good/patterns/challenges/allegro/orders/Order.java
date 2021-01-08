package com.kodilla.good.patterns.challenges.allegro.orders;

import com.kodilla.good.patterns.challenges.allegro.products.Product;
import com.kodilla.good.patterns.challenges.allegro.users.User;

public interface Order {

    User getUser();

    Product getProduct();

    int getQuantity();
}
