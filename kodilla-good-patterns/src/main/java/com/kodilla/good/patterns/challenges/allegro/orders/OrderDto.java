package com.kodilla.good.patterns.challenges.allegro.orders;

import com.kodilla.good.patterns.challenges.allegro.products.Product;
import com.kodilla.good.patterns.challenges.allegro.users.User;

public class OrderDto {

    private final User user;
    private final Product product;
    private final boolean isProductOrdered;

    public OrderDto(User user, Product product, boolean isProductOrdered) {
        this.user = user;
        this.product = product;
        this.isProductOrdered = isProductOrdered;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isProductOrdered() {
        return isProductOrdered;
    }
}

